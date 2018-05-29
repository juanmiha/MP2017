package org.mp.tema08;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MuestraBorderLayout extends JFrame {
  public MuestraBorderLayout() {
    
    setLayout(new BorderLayout(5, 10));

    
    add(new JButton("East"), BorderLayout.EAST);
    add(new JButton("South"), BorderLayout.SOUTH);
    add(new JButton("West"), BorderLayout.WEST);
    add(new JButton("North"), BorderLayout.NORTH);
    add(new JButton("Center"), BorderLayout.CENTER);
    
 
  }


  public static void main(String[] args) {
    MuestraBorderLayout frame = new MuestraBorderLayout();
    frame.setTitle("Muestra BorderLayout");
    frame.setSize(300, 200);
    frame.setLocationRelativeTo(null); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
