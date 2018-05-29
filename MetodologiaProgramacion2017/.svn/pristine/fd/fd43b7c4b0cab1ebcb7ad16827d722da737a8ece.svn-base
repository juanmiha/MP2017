package org.mp.tema09;

public class Externa2 {
	private String x = "Externa2";

	public static void main(String[] args) {
		//Instancia de la clase contenedora
		Externa2 e = new Externa2(); 
		e.doAlgo();
	}

	void doAlgo() {
		final String z = "variable local";
		class Interna {
			public void miraExterna() {
				System.out.println("x de externa : " + x);
				System.out.println("variable local z : " + z);
				// compila porque z es final 
			} // cierra m�todo clase interna
		} // cierra definici�n clase interna
		
		Interna i = new Interna();
		i.miraExterna();
		
	} // cierra clase interna en metodo doAlgo
} // cierra clase externa

