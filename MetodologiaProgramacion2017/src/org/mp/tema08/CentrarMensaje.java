package org.mp.tema08;

import javax.swing.*;
import java.awt.*;

public class CentrarMensaje extends JFrame {
	public CentrarMensaje() {
		CentrarMensajePanel mensajePanel = new CentrarMensajePanel();
		add(mensajePanel);
		setTitle("CentrarMensaje");
		mensajePanel.setBackground(Color.WHITE);
		mensajePanel.setFont(new Font("Arial", Font.ITALIC, 40));
	}


	public static void main(String[] args) {
		CentrarMensaje frame = new CentrarMensaje();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 150);
		frame.setVisible(true);
	}
}

class CentrarMensajePanel extends JPanel {

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		FontMetrics fm = g.getFontMetrics();

		int stringWidth = fm.stringWidth("Hola Mundo");
		int stringAscent = fm.getAscent();

		int xCoordinate = getWidth() / 2 - stringWidth / 2;
		int yCoordinate = getHeight() / 2 + stringAscent / 2;

		g.drawString("Hola Mundo", xCoordinate, yCoordinate);
	}
}
