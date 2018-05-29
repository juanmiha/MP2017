package org.mp.sesion09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

import org.apache.commons.math3.analysis.function.Cbrt;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.regression.SimpleRegression;

import java.io.*;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class AnalisisDatos extends JFrame {

	ConjuntoDatosAdaptador cdA;
	DefaultTableModel tableModel;
	JTable jTable1 = new JTable();
	private GraficoLineChart grafico;// = new GraficoLineChart("Grafico",this);

	private JComboBox jcboProceso = new JComboBox();
	private final JPanel panelC1 = new JPanel();
	private final JToolBar toolBar = new JToolBar("My Tool Bar");
	private ImageIcon openImageIcon = new ImageIcon(
			System.getProperty("user.dir") + "\\src\\org\\mp\\sesion09\\open.gif");;
	private ImageIcon guardarImageIcon = new ImageIcon(
			System.getProperty("user.dir") + "\\src\\org\\mp\\sesion09\\save.gif");;

	private final JMenuBar menuBar = new JMenuBar();

	private final JMenu mnNewMenu = new JMenu("Archivo");
	private final JMenu mnNewMenu_1 = new JMenu("Ayuda");
	private final JMenuItem mntmNewMenuItem = new JMenuItem("Acerca de ...");
	private final JMenuItem mntmNewMenuItem_1 = new JMenuItem("Abrir",
			openImageIcon);
	private final JMenuItem mntmNewMenuItem_2 = new JMenuItem("Salir");

	private final JButton btnNewButton_1 = new JButton(openImageIcon);
	private final JButton jbCalcular = new JButton("Calcular");
	private final JPanel panel_4 = new JPanel();
	private final JTextArea taSalida = new JTextArea();
	private final JPanel panelC2 = new JPanel();
	private final JScrollPane scrollPane = new JScrollPane(taSalida);
	private final JMenuItem mntmNewMenuItem_3 = new JMenuItem("Guardar",
			guardarImageIcon);
	private final JPanel panelB = new JPanel();
	private final JButton btnNewButton_2 = new JButton(guardarImageIcon);

	private final JLabel lblNombreArchivo = new JLabel("");
	private final JPanel panel = new JPanel();
	private final JButton btnGrafica = new JButton("Grafica");

	public AnalisisDatos() {
		setTitle("An\u00E1lisis de datos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelA = new JPanel();
		panelA.setLayout(new BorderLayout(0, 0));

		JPanel panelA1 = new JPanel();
		panelA1.setLayout(new BorderLayout(5, 0));
		panelA.add(panelA1, BorderLayout.NORTH);

		// Configurar el menu
		mnNewMenu.setMnemonic('A');
		mnNewMenu_1.setMnemonic('y');
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						new JPanel().add(new JLabel("Hola")), "Acerca de...",
						JOptionPane.INFORMATION_MESSAGE, null);
			}
		});
		mntmNewMenuItem.setMnemonic('c');
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrir();
			}
		});
		mntmNewMenuItem_1.setMnemonic('A');
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem_2.setMnemonic('S');
		panelA1.add(menuBar, BorderLayout.NORTH);

		menuBar.add(mnNewMenu);

		mnNewMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});

		mnNewMenu.add(mntmNewMenuItem_3);

		mnNewMenu.add(mntmNewMenuItem_2);

		menuBar.add(mnNewMenu_1);
		mnNewMenu_1.add(mntmNewMenuItem);
		panelA.add(toolBar, BorderLayout.CENTER);
		toolBar.setFloatable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrir();
			}
		});

		toolBar.add(btnNewButton_1);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();

			}
		});

		toolBar.add(btnNewButton_2);

		JPanel panelC = new JPanel();
		panelC.setLayout(new BorderLayout());

		getContentPane().add(panelA, BorderLayout.NORTH);

		getContentPane().add(panelB, BorderLayout.CENTER);
		panelB.setLayout(new BorderLayout(0, 0));

		jTable1.setRowSelectionAllowed(false);
		jTable1.setColumnSelectionAllowed(true);
		jTable1.setModel(new DefaultTableModel(new Object[][] { { null }, },
				new String[] { "Sin datos" }));
		JScrollPane scrollPane_1 = new JScrollPane(jTable1);
		scrollPane_1
				.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		panelB.add(scrollPane_1);
		getContentPane().add(panelC, BorderLayout.SOUTH);

		panelC.add(panelC1, BorderLayout.NORTH);
		panelC1.setLayout(new BoxLayout(panelC1, BoxLayout.Y_AXIS));

		panelC1.add(panel_4);
		JLabel lblProceso = new JLabel("Seleccionar proceso");
		panel_4.add(lblProceso);
		jcboProceso.setModel(new DefaultComboBoxModel(new String[] {
				"Estad\u00EDstica", "Regresi\u00F3n" }));
		panel_4.add(jcboProceso);

		panel_4.add(jbCalcular);
		btnGrafica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jTable1.getColumnSelectionAllowed()) {
					visualizar();
				}else{
					JOptionPane.showMessageDialog(null, "Debes seleccionar una columna");

				}


			}

		});

		panel_4.add(btnGrafica);

		panelC.add(panelC2, BorderLayout.CENTER);
		panelC2.setLayout(new BorderLayout(0, 0));

		taSalida.setRows(10);
		taSalida.setColumns(30);

		panelC2.add(scrollPane, BorderLayout.CENTER);

		panelC.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		lblNombreArchivo.setForeground(Color.BLUE);

		panel.add(lblNombreArchivo);
		jbCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int proceso = jcboProceso.getSelectedIndex();

					if (proceso == 0) {
						estadistica();
					}

					if (proceso == 1) {
						regresion();
					}

			}
		});

	}

	private void visualizar() {

		grafico = new GraficoLineChart("Grafico");


		grafico.visualizar(this);
	}

	private void estadistica() {

		DescriptiveStatistics stats = new DescriptiveStatistics();

		StringBuffer salidab = new StringBuffer();

		NumberFormat format = NumberFormat.getInstance();

		int indice = jTable1.getSelectedColumn();
		String salida = "";
		String col = jTable1.getModel().getColumnName(indice);

		if (col == "") {
			JOptionPane
					.showMessageDialog(null, "Debes seleccionar una columna");
		} else {
			int filas = jTable1.getModel().getRowCount();

			for (int i = 0; i < filas; i++) {
				stats.addValue((Double) jTable1.getModel()
						.getValueAt(i, indice));
			}

			salidab.append("Estadistica: " + col + "\n");
			salidab.append("===========================" + "\n");
			salidab.append("N: " + stats.getN() + "\n");

			salidab.append("Max: " + format.format(stats.getMax()) + "\n");
			salidab.append("Min: " + format.format(stats.getMin()) + "\n");
			salidab.append("Media: " + format.format(stats.getMean()) + "\n");
			salidab.append("Varianza: " + format.format(stats.getVariance())
					+ "\n");
			salidab.append("Desviación Estandar: "
					+ format.format(stats.getStandardDeviation()) + "\n\n");

			taSalida.append(salidab.toString());
		}





	}

	private void regresion() {
		SimpleRegression sr = new SimpleRegression();

		int indice = jTable1.getSelectedColumn();
		String salida = "";
		String col = jTable1.getModel().getColumnName(indice);

		int filas = jTable1.getModel().getRowCount();

		for (int i = 0; i < filas; i++) {
			sr.addData(i, (Double) jTable1.getModel().getValueAt(i, indice));
		}

		StringBuffer salidab = new StringBuffer();

		NumberFormat format = NumberFormat.getInstance();
		salidab.append("REGRESION: " + col + "\n");
		salidab.append("===========================" + "\n");
		salidab.append("N: " + sr.getN() + "\n");

		salidab.append("Corte: " + format.format(sr.getIntercept()) + "\n");

		salidab.append("Pendiente: " + format.format(sr.getSlope()) + "\n");
		salidab.append("r : " + format.format(sr.getR()) + "\n");
		salidab.append("r cuadrado: " + format.format(sr.getRSquare()) + "\n\n");
		taSalida.append(salidab.toString());

	}

	private void leerDatos(File file) throws Exception {

		cdA = new ConjuntoDatosAdaptador(new ConjuntoDatos(file, ";",
				new Locale("English", "US")));

		tableModel = new DefaultTableModel(cdA.getDatos(), cdA.getCabecera());
		jTable1.setModel(tableModel); // = new JTable(tableModel);

		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(
				jTable1.getModel());

		jTable1.setRowSorter(sorter);

		jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	}

	private Vector getColumnNames() {
		Vector<String> columnNames = new Vector<String>();
		for (int i = 0; i < jTable1.getColumnCount(); i++)
			columnNames.add(jTable1.getColumnName(i));
		return columnNames;
	}

	private void abrir() {
		JFileChooser jFileChooser1 = new JFileChooser(new File("."));
		if (jFileChooser1.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

			try {

				lblNombreArchivo.setText(jFileChooser1.getSelectedFile()
						.getAbsolutePath());
				leerDatos(jFileChooser1.getSelectedFile());

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	private void guardar() {
		JFileChooser jFileChooser1 = new JFileChooser(new File("."));
		if (jFileChooser1.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

			try {

				cdA.guardarComo(jFileChooser1.getSelectedFile());
				// leerDatos(jFileChooser1.getSelectedFile());
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	// Main method
	public static void main(String[] args) {
		AnalisisDatos frame = new AnalisisDatos();
		frame.setDefaultCloseOperation(3);
		frame.setTitle("Análisis Datos");
		frame.setSize(600, 520);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
