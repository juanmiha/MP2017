package org.mp.tema09;

import javax.swing.*;
import java.awt.event.*;

public class AnonymousListenerDemo extends JFrame {
  public AnonymousListenerDemo() {
    JButton jbtAbrir = new JButton("Abrir");
    JButton jbtNuevo = new JButton("Nuevo");
    JButton jbtGuardar = new JButton("Guardar");
    JPanel panel = new JPanel();
    panel.add(jbtAbrir);
    panel.add(jbtNuevo);
    panel.add(jbtGuardar);
    getContentPane().add(panel);
    // Crea y registra: anonymous inner class listener
    jbtAbrir.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("Procesa Abrir");
        }
      }
    );
    jbtNuevo.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("Procesa Nuevo");
        }
      }
    );
    jbtGuardar.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("Procesa Guardar");
        }
      }
    );
  }
  
  

  public static void main(String[] args) {
    JFrame frame = new AnonymousListenerDemo();
    frame.setTitle("AnonymousListenerDemo");
    frame.setLocationRelativeTo(null); // Centra el frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}

