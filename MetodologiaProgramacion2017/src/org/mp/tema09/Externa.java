package org.mp.tema09;

public class Externa {
   private int x = 7;

   public static void main(String[] args) {
	   Externa e = new Externa(); //Intancia de la clase contenedora
	   Interna i1 = e.new Interna();
	   Externa.Interna i2 = e.new Interna();
	   Externa.Interna i3 = new Externa().new Interna();
	   i1.accesoExterna();
	   i2.accesoExterna();
	   i3.accesoExterna();
   }
   
   //definicion de una clase interna   
  class Interna {
      public void accesoExterna() {
         System.out.println("x = " + x);
      }
   } 
} 

