package org.mp.tema08;
import javax.swing.*;
import java.awt.Font;

public class MiFrame {
  public static void main(String[] args) {
    JFrame frmMiFrameimito = new JFrame("Mi Frame"); 
    frmMiFrameimito.getContentPane().setFont(new Font("Courier", Font.PLAIN, 12));
    frmMiFrameimito.setTitle("Mi Frameimito");
    frmMiFrameimito.setSize(400, 300); 
    frmMiFrameimito.setLocationRelativeTo(null); //Centra
    frmMiFrameimito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frmMiFrameimito.getContentPane().setLayout(null);
    frmMiFrameimito.setVisible(true); 
  }
}

