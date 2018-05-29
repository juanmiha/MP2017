package org.mp.sesion08;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
/**
*
* @author Juan Miguel Herrada Acosta
* @version 05/06/2017
*/
public class Indalo extends JFrame {
	/**
	 * Constructor
	 */
	public Indalo() {

		IndaloPanel indalo = new IndaloPanel();
		add(indalo);
		setTitle("Dibujo Indalo");
		indalo.setBackground(Color.WHITE);
	}
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		 //Creamos el frame
		 Indalo frame = new Indalo();
		 //Añadimos las propiedades necesarias para su funcionamiento
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// boton para cerrar
		 frame.setSize(300, 300);//Tamaño del frame
		 frame.setVisible(true);//Visibilidad
	}
	/**
	 * IndaloPanel
	 * Dibuja un indalo y escribe debajo del mismo "Indalo"
	 * @author Juan Miguel HA
	 *
	 */
	class IndaloPanel extends JPanel {
		//Declaramos el componente grafico
		  protected void paintComponent(Graphics i) {
			  super.paintComponent(i);
			  //Marcamos el tamaño de los ejes
			  int xCenter = getWidth() / 2;
			  int yCenter = getHeight() / 2;
			  //Añadimos tantos draw como necesitemos para nuesrtro dibujo
			  i.drawLine(xCenter-70, yCenter-60, xCenter+70, yCenter-60);
			  i.drawArc(xCenter-70, yCenter-120, 140, 120, 0, 180);
			  i.drawLine(xCenter, yCenter-70, xCenter, yCenter + 25);
			  i.drawArc(xCenter-12, yCenter-95, 24, 24, 0, 360);
			  i.drawLine(xCenter, yCenter+25, xCenter+65, yCenter+85);
			  i.drawLine(xCenter, yCenter+25, xCenter-65, yCenter+85);
			  //Posteriormente aplicamos color y una fuente
			  i.setColor(Color.RED);
			  i.setFont(new Font("Arial", Font.ITALIC , 20));
			  //
			  FontMetrics fm = i.getFontMetrics();
			  int stringWidth = fm.stringWidth("Hola Mundo");
			  int stringAscent = fm.getAscent();

			  int xCoordinate = getWidth() / 2 - stringWidth / 2;
			  int yCoordinate = getHeight() / 2 + stringAscent / 2;

			  i.drawString("Indalo", xCoordinate + 25, yCoordinate +85);

		  }
	}
}