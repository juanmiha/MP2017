package org.mp.tema08;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MuestraFlowLayout extends JFrame {
  public MuestraFlowLayout() {

    setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20));

    add(new JLabel("Nombre"));
    add(new JTextField(8));
    add(new JLabel("Primer Apellido"));
    add(new JTextField(8));
    add(new JLabel("Segundo Apellido"));
    add(new JTextField(8));
  }


  public static void main(String[] args) {
    MuestraFlowLayout frame = new MuestraFlowLayout();
    frame.setTitle("Muestra FlowLayout");
    frame.setSize(200, 200);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
