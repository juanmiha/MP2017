package org.mp.tema09;

import javax.swing.*;

import java.awt.event.*;

@SuppressWarnings("serial")

public class DetectaSourceDemo extends JFrame {
	private JButton jbtAbrir = new JButton("Abrir");
	private JButton jbtNuevo = new JButton("Nuevo");
	private JButton jbtGuardar = new JButton("Guardar");

	public DetectaSourceDemo() {
		JPanel panel = new JPanel();
		panel.add(jbtAbrir);
		panel.add(jbtNuevo);
		panel.add(jbtGuardar);
		getContentPane().add(panel);
		// Create a listener
		ButtonListener listener = new ButtonListener();
		// Registra listener 
		jbtAbrir.addActionListener(listener);
		jbtNuevo.addActionListener(listener);
		jbtGuardar.addActionListener(listener);

	}
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == jbtNuevo)
				System.out.println("Procesa Nuevo");
			else if (e.getSource() == jbtAbrir)
				System.out.println("Procesa Abrir");
			else if (e.getSource() == jbtGuardar)
				System.out.println("Procesa Guardar");
		}
	}


	public static void main(String[] args) {
		JFrame frame = new DetectaSourceDemo();
		frame.setTitle("DetectSourceDemo");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
