package org.mp.tema08;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class MuestraGridLayout extends JFrame {
  public MuestraGridLayout() {
  
    setLayout(new GridLayout(3, 2, 5, 5));
    //setLayout(new GridLayout(3, 2));
    
    add(new JLabel("Nombre"));
    add(new JTextField(8));
    add(new JLabel("Primer Apellido"));
    add(new JTextField(8));
    add(new JLabel("Segundo Apellido"));
    add(new JTextField(8));
  }


  public static void main(String[] args) {
    MuestraGridLayout frame = new MuestraGridLayout();
    frame.setTitle("Muestra GridLayout");
    frame.setSize(200, 125);
    frame.setLocationRelativeTo(null); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
