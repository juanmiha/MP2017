package org.mp.tema08;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Grafo extends JFrame {

	private List<Vertice> vertices;
	private List<Arista> aristas;
	

	public Grafo() {
		super();
		vertices = new ArrayList<Vertice>();
		aristas = new ArrayList<Arista>();

		
		getContentPane().add(new GrafoPanel());
		
		JButton btnNewButton = new JButton("Seleccionar archivo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrir();
			}
		});
	
		getContentPane().add(btnNewButton, BorderLayout.NORTH);
	}
	
	private void abrir() {
		JFileChooser jFileChooser1 = new JFileChooser(new File("."));
		if (jFileChooser1.showOpenDialog(this) ==JFileChooser.APPROVE_OPTION){
			try {
				leerDatos(jFileChooser1.getSelectedFile());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
	public void leerDatos(File file) throws IOException {
		vertices.clear();
		aristas.clear();
			BufferedReader br = new BufferedReader(new FileReader(file));
			String linea=br.readLine();
			while ((linea = br.readLine()).equals("Aristas")==false) {
				Scanner scanner = new Scanner(linea);
				String nombre=scanner.next();
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				vertices.add(new Vertice(nombre + "", x , y));
			}
			
			while ((linea = br.readLine())!=null ) {
				Scanner scanner = new Scanner(linea);
				String buscadoA = scanner.next();
				Vertice vbuscadoA = null;
				for (int i = 0; i < vertices.size(); i++) {
					if(vertices.get(i).getNombre().equals(buscadoA)){
						vbuscadoA = vertices.get(i);
					}
				}
				
				while(scanner.hasNext()){
					String buscadoB = scanner.next();
					Vertice vbuscadoB = null;
					for (int i = 0; i < vertices.size(); i++) {
						if(vertices.get(i).getNombre().equals(buscadoB)){
							vbuscadoB = vertices.get(i);
						}
					}
					
					aristas.add(new Arista(vbuscadoA,vbuscadoB));
				}
			}
			
			br.close();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new Grafo();
		frame.setTitle("Grafo");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);

	}

	class GrafoPanel extends JPanel {

		private static final long serialVersionUID = 1L;

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			 // Dibuja vertices
		        
		    for (int i = 0; i < vertices.size(); i++) {
		      int x = vertices.get(i).getX();
		      int y = vertices.get(i).getY();
		      String name = vertices.get(i).getNombre();
		      
		      g.fillOval(x - 8, y - 8, 16, 16); 
		      g.drawString(name, x - 12, y - 12); 
		    }
		    
		    // dibuja lineas
		    for (int i = 0; i < aristas.size(); i++) {
		        int x1 = aristas.get(i).u.getX();
		        int y1 = aristas.get(i).u.getY();
		        int x2 = aristas.get(i).v.getX();
		        int y2 = aristas.get(i).v.getY();
		        g.drawLine(x1, y1, x2, y2); 
		    }
		  }
		}
}
