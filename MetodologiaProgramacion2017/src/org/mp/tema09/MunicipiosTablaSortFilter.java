package org.mp.tema09;

import javax.swing.*;
import javax.swing.table.*;

import java.awt.BorderLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class MunicipiosTablaSortFilter extends JFrame {

	private String[] nombresColumnas;
	private Object[][] datos;
	private JTable jTable1;
	private TableRowSorter<TableModel> sorter;
	private JTextField jtfFiltro = new JTextField();
	private JButton btFiltro = new JButton("Filtro");

	public MunicipiosTablaSortFilter() {
		String directorioEntrada = System.getProperty("user.dir");

		directorioEntrada = directorioEntrada + File.separator + "src"
				+ File.separator + "org" + File.separator + "mp"
				+ File.separator + "tema09" + File.separator;

		String cmunicipios = directorioEntrada + "municipios.csv";
		File file = new File(cmunicipios);

		Municipios municipios = new Municipios(file);

		ArrayList<Municipio> muni = (ArrayList<Municipio>) municipios
				.getMunicipios();
		ArrayList<String> cabe = (ArrayList<String>) municipios.getCabecera();

		Object[][] datos = new Object[muni.size()][cabe.size()];

		int i = 0;
		for (Iterator<Municipio> iterator = muni.iterator(); iterator.hasNext();) {
			Municipio municipio = iterator.next();
			datos[i][0] = municipio.getComunidad();
			datos[i][1] = municipio.getProvincia();
			datos[i][2] = municipio.getMunicipio();
			datos[i][3] = municipio.getPoblacion();
			i++;
		}

		Object[] cabecera = new Object[cabe.size()];
		int j = 0;
		for (Iterator iterator = cabe.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			cabecera[j] = string;
			j++;
		}
		DefaultTableModel tableModel = new DefaultTableModel(datos, cabecera);
		jTable1 = new JTable(tableModel);
		sorter = new TableRowSorter<TableModel>(jTable1.getModel());

		class DoubleComparator implements Comparator {
			public int compare(Object o1, Object o2) {
				Double dbl1 = (Double) o1;
				Double dbl2 = (Double) o2;
				return dbl1.compareTo(dbl2);
			}
			public boolean equals(Object o2) {
				return this.equals(o2);
			}
		}

		sorter.setComparator(3, new DoubleComparator());

		jTable1.setRowSorter(sorter);

		JPanel panel = new JPanel(new java.awt.BorderLayout());
		panel.add(new JLabel("Escriba la palabra para que coincida:"),
				BorderLayout.WEST);
		panel.add(jtfFiltro, BorderLayout.CENTER);
		panel.add(btFiltro, BorderLayout.EAST);

		getContentPane().add(panel, BorderLayout.SOUTH);
		getContentPane().add(new JScrollPane(jTable1), BorderLayout.CENTER);

		btFiltro.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				String text = jtfFiltro.getText();
				if (text.trim().length() == 0)
					sorter.setRowFilter(null);
				else
					sorter.setRowFilter(RowFilter.regexFilter(text));
			}
		});
	}

	public static void main(String[] args) {
		MunicipiosTablaSortFilter frame = new MunicipiosTablaSortFilter();
		frame.setDefaultCloseOperation(3);
		frame.setTitle("TestTableSortFilterSortFilter");
		frame.setSize(500, 420);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
