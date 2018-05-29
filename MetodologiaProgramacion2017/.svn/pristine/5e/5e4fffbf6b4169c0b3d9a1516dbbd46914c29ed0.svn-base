package org.mp.tema08;

import java.awt.*;
import javax.swing.*;

public class VerImagen extends JFrame {
  public VerImagen() {
    add(new ImagenPanel());
  }

  public static void main(String[] args) {
    JFrame frame = new VerImagen();
    frame.setTitle("Ver Imagen");
    frame.setSize(600, 500);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

class ImagenPanel extends JPanel {
  private ImageIcon imagenIcon = new ImageIcon(System.getProperty("user.dir") +
			"/src/org/mp/tema08/winners.jpg");
  private Image imagen = imagenIcon.getImage();

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    if (imagen != null)
      g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
  }
}

