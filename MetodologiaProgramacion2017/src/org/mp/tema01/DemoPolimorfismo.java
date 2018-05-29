package org.mp.tema01;
public class DemoPolimorfismo {
  public static void main(String[] args) {
    m(new EstudianteGraduado());
    m(new Estudiante());
    m(new Persona());
    m(new Object());
  }

  public static void m(Object x) {
    System.out.println(x.toString());
  }
}

