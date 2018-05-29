package org.mp.tema09;

import javax.swing.*;

@SuppressWarnings("serial")

public class DisplayLabelApplet02 extends JApplet {
  public DisplayLabelApplet02() {
    add(new JLabel("�Hola Mundo!", JLabel.CENTER));
  }
  public static void main(String[] args) {
    // Crea un frame
    JFrame frame = new JFrame("Applet en el frame");
    // Crea una instancia del applet
    DisplayLabelApplet02 applet = new DisplayLabelApplet02();
    // A�ade el applet al frame
    frame.add(applet);
    // Visualiza el frame
    frame.setSize(300, 100);
    frame.setLocationRelativeTo(null); // Centrado   
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}


