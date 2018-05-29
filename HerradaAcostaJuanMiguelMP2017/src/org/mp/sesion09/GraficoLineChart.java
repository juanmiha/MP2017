package org.mp.sesion09;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.apache.commons.math3.stat.regression.SimpleRegression;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.entity.XYAnnotationEntity;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.labels.XYItemLabelGenerator;
import org.jfree.chart.labels.XYSeriesLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.HorizontalAlignment;
import org.jfree.ui.RectangleEdge;
import org.jfree.ui.RectangleInsets;
import org.jfree.ui.RefineryUtilities;

public class GraficoLineChart extends JFrame {
	
	public GraficoLineChart(String title ) {
		super(title);

	}

	
	public void visualizar(AnalisisDatos ad) {
	
		int indice = ad.jTable1.getSelectedColumn();
		String salida = "";
		String col = ad.jTable1.getModel().getColumnName(
				indice);
		
		int filas = ad.jTable1.getModel().getRowCount();
	
		Double[] datos = new Double[filas];

		for (int i = 0; i < filas; i++) {
			Double doble = (Double)ad.jTable1.getModel().getValueAt(i, indice);
			datos[i] = doble;
		}
		
		
		SimpleRegression sr = new SimpleRegression();

		for (int i = 0; i < datos.length; i++) {
			sr.addData(i,datos[i]);
		}
		
		XYSeriesCollection dataset = new XYSeriesCollection();

		XYSeries series1 = new XYSeries("Datos");
		for (int i = 0; i < datos.length; i++) {
			series1.add(i, datos[i]);
		}
		
		dataset.addSeries(series1);
		XYSeries series2 = new XYSeries("Regresión lineal: "+col);
		for (int i = 0; i < datos.length; i++) {
			series2.add(i, sr.getIntercept()+sr.getSlope()*i);
		}
		dataset.addSeries(series2);

		NumberFormat format = NumberFormat.getInstance();
		// create the chart...
		JFreeChart chart = ChartFactory.createXYLineChart(
				"Regresión", // chart 
				"Dias", // x axis label
				col, // y axis label
				dataset, // data
				PlotOrientation.VERTICAL, true, // include legend
				true, // tooltips
				false // urls
				);
		// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
		chart.setBackgroundPaint(Color.white);
		// get a reference to the plot for further customisation...
		XYPlot plot = (XYPlot) chart.getPlot();

		String formula = "f(x) = "+format.format(sr.getIntercept()) +" + "+format.format(sr.getSlope())+"*x";
		XYTextAnnotation annotation = new XYTextAnnotation(formula, series1.getMinX()+15, series1.getMaxY()+10);
		annotation.setFont(new Font("SansSerif", Font.PLAIN, 20));
		plot.addAnnotation(annotation);
	
		plot.setBackgroundPaint(Color.lightGray);
		plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
		plot.setDomainGridlinePaint(Color.white);
		plot.setRangeGridlinePaint(Color.white);
		XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) plot
				.getRenderer();
		renderer.setSeriesShapesVisible(0, true);
		renderer.setSeriesLinesVisible(0, false);
	
		
		XYItemLabelGenerator generator = new StandardXYItemLabelGenerator("{2}", new DecimalFormat("0.00"),new DecimalFormat("0.0"));
		//generator.
		//renderer.setBaseItemLabelGenerator(generator);
		renderer.setSeriesItemLabelGenerator(0, generator);
		renderer.setSeriesItemLabelsVisible(0, false);
		
		
		//.setShapesVisible(true);
		//renderer.setShapesFilled(true);
		// change the auto tick unit selection to integer units only...
		NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		//rangeAxis.setAutoRange(true);
		rangeAxis.setRange(series1.getMinY()-20, series1.getMaxY()+20);
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		// OPTIONAL CUSTOMISATION COMPLETED.

		System.out.println("series1.getMaxY()"+series1.getMaxY());
		System.out.println("series1.getMinY()"+series1.getMinY());
		System.out.println("series1.getMaxX()"+series1.getMaxX());
		System.out.println("series1.getMinX()"+series1.getMinX());
		
		// /////////////////////
		ChartPanel chartPanel = new ChartPanel(chart);
		
		
		chartPanel.setPreferredSize(new Dimension(500, 500));
		setContentPane(chartPanel);

		pack();
		RefineryUtilities.centerFrameOnScreen(this);
		setVisible(true); 
	}




	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		


	}

}
