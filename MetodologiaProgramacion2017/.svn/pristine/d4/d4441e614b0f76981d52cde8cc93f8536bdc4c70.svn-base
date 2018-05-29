package org.mp.tema09;
public class Externa3 {
	public static void main(String[] args) {
		Externa3 e = new Externa3(); 
		e.doAlgo();
	}
  public void doAlgo() {
	  Gato gato = new Gato();
	  gato.maulla(new Gatuno() {
                       public void maulla() {
                          System.out.println("Miau");
                       } 
                   }); 
  } 
} // cierre de clase
interface Gatuno{
	public void maulla();
}
class Gato {
	public void maulla(Gatuno g){
		g.maulla();
	}
}

