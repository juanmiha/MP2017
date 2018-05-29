package org.mp.tema02;
public abstract class Animal {
  private double peso;
  
  public double getPeso() {
    return peso;
  }
  
  public void setPeso(double peso) {
    this.peso = peso;
  }
  
  /** Devuelve el sonido de un animal*/
  public abstract String sonido();
}
