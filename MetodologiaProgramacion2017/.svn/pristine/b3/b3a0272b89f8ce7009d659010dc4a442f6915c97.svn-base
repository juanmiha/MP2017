package org.mp.tema09;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.TextComponent;

import javax.swing.AbstractButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class EjemplosJFileChooser extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemplosJFileChooser frame = new EjemplosJFileChooser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EjemplosJFileChooser() {
		setTitle("EjemplosJFileChooser");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JButton btnJFChooser1 = new JButton("JFChooser1");
		btnJFChooser1.setBounds(109, 11, 168, 23);
		
		contentPane.add(btnJFChooser1);
		
		JButton btnJFChooser2 = new JButton("JFChooser2");

		btnJFChooser2.setBounds(109, 29, 168, 23);
		
		contentPane.add(btnJFChooser2);
		
		textArea = new JTextArea();
		textArea.setRows(5);
		textArea.setBounds(109, 63, 276, 80);
		contentPane.add(textArea);
		btnJFChooser1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					visualizar1();
			}
		});
		
		btnJFChooser2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visualizar2();
			}
		});
	}
	
	private void visualizar1() {
		JFileChooser fc = new JFileChooser();
		int resultado = fc.showOpenDialog(this);
		//int resultado = fc.showSaveDialog(contentPane);
		if(resultado == JFileChooser.APPROVE_OPTION) {
			textArea.append(fc.getSelectedFile().getName()+"\n");
		}
	}
	private void visualizar2() {
		JFileChooser fc = new JFileChooser();
		fc.setDialogTitle("Abierto con .showSaveDialog");
		fc.setCurrentDirectory(new File("."));
		fc.setDialogType(JFileChooser.APPROVE_OPTION);
		fc.setMultiSelectionEnabled(true);
		int resultado = fc.showDialog(this, "Elegir");
		if(resultado == JFileChooser.APPROVE_OPTION) {
			File[] files =fc.getSelectedFiles();
			for (int i = 0; i < files.length; i++) {
				textArea.append(files[i].getName()+"\n");
			}
					
		}
	}
}

