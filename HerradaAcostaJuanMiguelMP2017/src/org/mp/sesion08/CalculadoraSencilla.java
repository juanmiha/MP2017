package org.mp.sesion08;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class CalculadoraSencilla extends JFrame {

   JTextField pantalla;
   JPanel panelNumeros;
   double resultado;
   double numero1;
   double numero2;
   String operacion;
   boolean nuevaOperacion = true;

   public CalculadoraSencilla() {

	   //Creamos el panel y le ponemos un Layout
       JPanel panel = (JPanel) this.getContentPane();
       panel.setLayout(new BorderLayout());

       // Creando un TextField con Numero por defencto y Numero de espacios
       pantalla = new JTextField("0", 20);
       //Para aplicar bordes
       pantalla.setBorder(new EmptyBorder(4, 0, 0, 0));
       //Poner tipo de letra y tamaño
       pantalla.setFont(new Font("Arial", Font.BOLD, 30));
       //Ponemos el cursor en la parte derecha
       pantalla.setHorizontalAlignment(JTextField.RIGHT);
       //Fondo de color blanco
       pantalla.setBackground(Color.LIGHT_GRAY);
       //Añadimos la pantalla al panel pegando por la parte de arriba
       panel.add("North", pantalla);

       //Creamos el panel de los numeros de tipo GridLayout(filas, columnas)
       panelNumeros = new JPanel();
       panelNumeros.setBackground(Color.DARK_GRAY);
       panelNumeros.setLayout(new GridLayout(5, 4));
       //Aplicamos bordes
       panelNumeros.setBorder(new EmptyBorder(4, 4, 4, 4));
       //Orientamos los elemetos de derecha a izquerda
       panelNumeros.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

       //Añadimos todos los botones en orden llamando al metodo
       nuevoBotonOperacion("*");
       nuevoBotonNumerico("9");
       nuevoBotonNumerico("8");
       nuevoBotonNumerico("7");

       nuevoBotonOperacion("/");
       nuevoBotonNumerico("6");
       nuevoBotonNumerico("5");
       nuevoBotonNumerico("4");

       nuevoBotonOperacion("-");
       nuevoBotonNumerico("3");
       nuevoBotonNumerico("2");
       nuevoBotonNumerico("1");


       nuevoBotonOperacion("+");
       nuevoBotonOperacion("%");
       nuevoBotonNumerico(".");
       nuevoBotonNumerico("0");

       nuevoBotonOperacion("=");
       nuevoBotonOperacion("CLR");

       //Añadimos el panel de los botones al panel general en la parte baja
       panel.add("Center", panelNumeros);
   }

   private void nuevoBotonNumerico(String digito) {

	   //Creamos un boton
       JButton btn = new JButton();

       //Cambiamos tamaño y fuente
       btn.setFont(new Font("Arial", Font.ITALIC , 30));
       //Le añadimos el texto
       btn.setText(digito);

       //Guardamos el numero pulsado y lo pasamos a otro metodo donde se hará que se añada a la pantalla.
       btn.addMouseListener(new MouseAdapter(){

           @Override
           public void mouseReleased(MouseEvent evt) {
               JButton btn = (JButton) evt.getSource();
               numeroPulsado(btn.getText());
           }
       }
       );

       //Añadimos el boton al panel numerico
       panelNumeros.add(btn);
   }

   private void nuevoBotonOperacion(String operacion) {

	   //Creamos un boton con la operacion
       JButton btn = new JButton(operacion);
     //Cambiamos tamaño y fuente
       btn.setFont(new Font("Arial", Font.ITALIC , 30));
       //Le ponemos el color rojo
       btn.setForeground(Color.RED);
       //Si son el boton "CE" o "=" que se escriba en azul y cambia el tamaño para que queda
       if(operacion.equals("CLR") || operacion.equals("=")){

    	   btn.setFont(new Font("Arial", Font.ITALIC , 30));
    	   btn.setForeground(Color.blue);
       }

       //Guardamos la operacion pulsada y lo pasamos a otro metodo donde se hará que se añada a la pantalla.
       btn.addMouseListener(new MouseAdapter() {

           @Override
           public void mouseReleased(MouseEvent evt) {
               JButton btn = (JButton) evt.getSource();
               operacionPulsado(btn.getText());
           }
       });

       //Añadimos el boton al panel numerico
        panelNumeros.add(btn);
   }

   //Si en la pantalla habia un 0 o es una nueva operacion, saldra solo el numero pulsado
   //pero si es la continuacion de una cuenta, saldrá el numero pultaso y lo anterior que habia
   //Tambien guarda los numeros para luego ahcer las operaciones.
   private void numeroPulsado(String digito) {

       if (pantalla.getText().equals("0")){

    	   pantalla.setText(digito);
           numero1 = new Double(digito);

       }else if (nuevaOperacion){

    	   pantalla.setText(pantalla.getText() + digito);
    	   numero1 = new Double(pantalla.getText());
       }
       else if(!nuevaOperacion) {

    	  int posicion;
    	  String actual;

    	  pantalla.setText(pantalla.getText() + digito);

    	  if(pantalla.getText().contains("+")){

    		  posicion = pantalla.getText().indexOf('+');
    		  actual = pantalla.getText().substring(posicion+1);
    		  numero2 = new Double(actual);

    	   }

		 if(pantalla.getText().contains("-")){

		     posicion = pantalla.getText().indexOf('-');
		     actual = pantalla.getText().substring(posicion+1);
		     numero2 = new Double(actual);

		   }

		 if(pantalla.getText().contains("*")){

			  posicion = pantalla.getText().indexOf('*');
			  actual = pantalla.getText().substring(posicion+1);
			  numero2 = new Double(actual);

		  }

		 if(pantalla.getText().contains("/")){

			  posicion = pantalla.getText().indexOf('/');
			  actual = pantalla.getText().substring(posicion+1);
			  numero2 = new Double(actual);

		  }

		 if(pantalla.getText().contains("%")){

			  posicion = pantalla.getText().indexOf('%');
			  actual = pantalla.getText().substring(posicion+1);
			  numero2 = new Double(actual);

		  }
      }
   }

   /*
    * Si se pulsa el = y hay alguna operacion, la calcula.
    * Si pulsamos CLR, resetea todos los valores de la calculadora
    * Si pulsa cualquier otra tecla de operaciones, si no hay una nueva operacion y resultado > 0, calculara el resultado
  	* pero si es diferente, saldra por pantalla la operacion.
    */
   private void operacionPulsado(String tecla) {
       if (tecla.equals("=")) {
           if(operacion != null){
        	   calcularResultado();
        	   nuevaOperacion = true;
           }
       } else if (tecla.equals("CLR")) {
           resultado = 0;
           pantalla.setText("0");
           nuevaOperacion = true;
       } else {
           operacion = tecla;
           nuevaOperacion = false;
           if ((resultado > 0) && !nuevaOperacion) {
               calcularResultado();
           } else {
               resultado = new Double(pantalla.getText());
               pantalla.setText(pantalla.getText() + operacion);
           }
       }
   }

   /*
    *	Lo que hace basicamente es hacer las operacion dependiendo del valor de operaciones y despues mostrarlo por la pantalla de la calculadora.
    */
   private void calcularResultado() {
       if (operacion.equals("+")) {
          resultado = numero1 + numero2;

       } else if (operacion.equals("-")) {
          resultado = numero1 - numero2;
       } else if (operacion.equals("/")) {
           resultado = numero1 / numero2;
       } else if (operacion.equals("*")) {
           resultado = numero1 * numero2;
       }else if(operacion.equals("%")) {
    	   resultado = numero1 * (numero2/100);
       }

       pantalla.setText("" + resultado);
       operacion = "";
   }

   public static void main(String[] args) {

	   //Creamos el frame
       JFrame calc = new CalculadoraSencilla();
       //Ponemos el tamaño que queremos
       calc.setSize(500, 600);
       //Ponemos el titulo
       calc.setTitle("Calculadora Sencilla");
       //Tipo de operaciones de cerrado
       calc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       //Hacer visible el panel
       calc.setVisible(true);
   }

}