package org.mp.tema01;

import java.util.Scanner;


public class TestCirculoRectangulo {
  private static Scanner entrada;

public static void main(String[] args) {
	  
	entrada = new Scanner(System.in);
	int radio = entrada.nextInt();
    Circulo circulo = 
      new Circulo(radio);
    System.out.println("Circulo " + circulo.toString());
    System.out.println("Su color es " + circulo.getColor());
    System.out.println("El radio es " + circulo.getRadio());
    System.out.println("El área es " + circulo.getArea());
    System.out.println("El diámetro es " + circulo.getDiametro());
    
    Rectangulo rectangulo =
      new Rectangulo(2, 4);
    System.out.println("\nRectángulo " + rectangulo.toString());
    System.out.println("El área es " + rectangulo.getArea());
    System.out.println("El perímetro es " + 
      rectangulo.getPerimetro());
  }
}