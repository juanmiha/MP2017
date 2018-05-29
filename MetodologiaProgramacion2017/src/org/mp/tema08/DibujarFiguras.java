package org.mp.tema08;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class DibujarFiguras extends JFrame {
	public DibujarFiguras() {
		setTitle("DibujarFiguras");
		add(new FigurasPanel());
	}

	public static void main(String[] args) {
		DibujarFiguras frame = new DibujarFiguras();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
}


class FigurasPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();

		g.setColor(Color.MAGENTA);
		g.setFont(new Font("Arial",Font.PLAIN,20));
		g.drawString("Dibujos", width/2-30, height/2-30);

		g.setColor(Color.BLACK);
		g.drawLine(10, 10, width - 10, height - 10);
		g.drawLine(width - 10, 10, 10, height - 10);

		g.setColor(Color.BLUE);

		g.drawRect((int) (0.1 * width), (int) (0.1 * height),
				(int) (0.8 * width), (int) (0.8 * height));

		g.setColor(Color.RED);

		g.drawRoundRect((int) (0.1 * width), (int) (0.1 * height),
				(int) (0.8 * width), (int) (0.8 * height), 100, 100);

		g.setColor(Color.BLACK);

		g.drawOval((int) (0.1 * width), (int) (0.1 * height),
				(int) (0.8 * width), (int) (0.8 * height));
	}

}
