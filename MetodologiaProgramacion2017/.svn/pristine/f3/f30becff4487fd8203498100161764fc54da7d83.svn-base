package org.mp.tema08;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class DibujoArco extends JFrame {
  public DibujoArco() {
    setTitle("DibujoArco");
    add(new ArcsPanel());
  }

  /** Main method */
  public static void main(String[] args) {
    DibujoArco frame = new DibujoArco();
    frame.setLocationRelativeTo(null); // Centra el frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(250, 300);
    frame.setVisible(true);
  }
}

class ArcsPanel extends JPanel {
  // dibuja palas de un ventilador
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

    int x = xCenter - radius;
    int y = yCenter - radius;

    g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 180, 30);
    g.fillArc(x, y, 2 * radius, 2 * radius, 270, 30);
  }
}
