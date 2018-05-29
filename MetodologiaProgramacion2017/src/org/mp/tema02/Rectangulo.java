package org.mp.tema02;
public class Rectangulo extends ObjetoGeometrico {
  private double anchura;
  private double altura;

  public Rectangulo() {
  }
  public Rectangulo(
      double anchura, double altura) {
    this.anchura = anchura;
    this.altura = altura;
  }
  public Rectangulo(
      double anchura, double altura, String color, boolean relleno) {
    this.anchura = anchura;
    this.altura = altura;
    setColor(color);
    setRelleno(relleno);
  }
  /** Devuelve la anchura */
  public double getAnchura() {
    return anchura;
  }
  /** Pone una nueva anchura */
  public void setAnchura(double anchura) {
    this.anchura = anchura;
  }
  /** Devuelve la altura */
  public double getAltura() {
    return altura;
  }
  /** Pone una nueva altura */
  public void setAltura(double altura) {
    this.altura = altura;
  }
  @ Override
  /** Devuelve el Área */
  public double getArea() {
    return anchura * altura;
  }
  @ Override
  /** Devuelve el perímetro */
  public double getPerimetro() {
    return 2 * (anchura + altura);
  }
}
