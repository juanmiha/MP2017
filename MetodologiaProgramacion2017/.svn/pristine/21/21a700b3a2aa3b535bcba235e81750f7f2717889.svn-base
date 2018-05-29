package org.mp.tema09;

interface Ladrador{
	public void ladra();
}

public class Perro implements Ladrador {
	public void ladra() {
		System.out.println("guau");
	}
	public static void main(String[] args) {
		//Instancia de la clase contenedora
		Perro p = new Perro(); 
		p.ladra();
		PerroGuardia p1 = new PerroGuardia();
		p1.ladra();
	}
}

class PerroGuardia implements Ladrador{
	Ladrador perro = new Perro() {
		public void ladraladra() {
			System.out.println("GUAU");
		}
		public void ladra() {
			System.out.println("guau anonimo");
			ladraladra();
		}
	};
	public void ladra() {
		perro.ladra(); // tiene un metodo pop()
		//perro.ladraladra(); //no tiene un metodo ladraladra;
	}
}


