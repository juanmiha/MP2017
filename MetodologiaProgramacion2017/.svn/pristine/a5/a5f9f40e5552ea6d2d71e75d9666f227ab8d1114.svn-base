package org.mp.tema08;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class CaracteristicasComunes extends JFrame {
  public CaracteristicasComunes() {
    
    JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
    JButton jbtIzq = new JButton("Izq");
    JButton jbtCentro = new JButton("Centro");
    JButton jbtDer = new JButton("Der");
    jbtIzq.setBackground(Color.WHITE);
    jbtCentro.setForeground(Color.GREEN);
    jbtDer.setToolTipText("Boton derecho");
    p1.add(jbtIzq);
    p1.add(jbtCentro);
    p1.add(jbtDer);
    p1.setBorder(new TitledBorder("Tres Botones"));

   
    Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
    Border lineBorder = new LineBorder(Color.BLACK, 2);

    
    JPanel p2 = new JPanel(new GridLayout(1, 2, 5, 5));
    JLabel jlblNaranja = new JLabel("Naranja");
    JLabel jlblRojo = new JLabel("Rojo");
    jlblNaranja.setForeground(Color.RED);
    jlblRojo.setForeground(Color.ORANGE);
    jlblNaranja.setFont(largeFont);
    jlblRojo.setFont(largeFont);
    jlblNaranja.setBorder(lineBorder);
    jlblRojo.setBorder(lineBorder);
    p2.add(jlblNaranja);
    p2.add(jlblRojo);
    p2.setBorder(new TitledBorder("Dos etiquetas"));

   
    getContentPane().setLayout(new GridLayout(2, 1, 5, 5));
    getContentPane().add(p1);
    getContentPane().add(p2);
  }

  public static void main(String[] args) {

    JFrame frame = new CaracteristicasComunes();
    frame.setTitle("CaracteristicasComunes");
    frame.setSize(300, 150);
    frame.setLocationRelativeTo(null); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
