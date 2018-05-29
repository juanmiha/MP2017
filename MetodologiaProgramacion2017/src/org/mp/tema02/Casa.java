package org.mp.tema02;
public class Casa implements Cloneable, Comparable<Casa> {
  private int id;
  private double area;
  private java.util.Date fechaConstruccion;

  public Casa(int id, double area) {
    this.id = id;
    this.area = area;
    fechaConstruccion = new java.util.Date();
  }

  public int getId() {
    return id;
  }
    public double getArea() {
    return area;
  }

  public java.util.Date getFechaConstruccion() {
    return fechaConstruccion;
  }

  @Override /** Sobre-escribe el método clone protected  definido en
    la clase Object y refuerza su accesibilidad */
  public Object clone() {
    try {
      return super.clone();
    }
    catch (CloneNotSupportedException ex) {
      return null;
    }
  }

  @Override // Implementa el método compareTo definido en Comparable
  public int compareTo(Casa o) {
    if (area > o.area)
      return 1;
    else if (area < o.area)
      return -1;
    else
      return 0;
  }
}
