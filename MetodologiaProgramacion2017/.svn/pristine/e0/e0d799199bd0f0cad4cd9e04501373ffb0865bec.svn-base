package org.mp.tema09;

import javax.swing.*;

import java.awt.event.*;

@SuppressWarnings("serial")

public class FrameComoListenerDemo extends JFrame 
    implements ActionListener {
	private JButton jbtAbrir = new JButton("Abrir");
	private JButton jbtNuevo = new JButton("Nuevo");
	private JButton jbtGuardar = new JButton("Guardar");

  public FrameComoListenerDemo() {
		JPanel panel = new JPanel();
		panel.add(jbtAbrir);
		panel.add(jbtNuevo);
		panel.add(jbtGuardar);
		getContentPane().add(panel);
		// Registra listener 
		jbtAbrir.addActionListener(this);
		jbtNuevo.addActionListener(this);
		jbtGuardar.addActionListener(this);
  }
  /** Implementa actionPerformed */
  public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbtNuevo)
			System.out.println("Procesa Nuevo");
		else if (e.getSource() == jbtAbrir)
			System.out.println("Procesa Abrir");
		else if (e.getSource() == jbtGuardar)
			System.out.println("Procesa Guardar");
  }

  /** Main method */
  public static void main(String[] args) {
    JFrame frame = new FrameComoListenerDemo();
    frame.setTitle("FrameComoListenerDemo");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
