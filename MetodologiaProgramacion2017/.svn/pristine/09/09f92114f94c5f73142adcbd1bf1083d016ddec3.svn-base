package org.mp.tema04;

public class TestPriorityQueue {
  public static void main(String[] args) {
    Paciente paciente1 = new Paciente("Juan", 2);
    Paciente paciente2 = new Paciente("Ana", 1);
    Paciente paciente3 = new Paciente("Antonio", 5);
    Paciente paciente4 = new Paciente("Carmen", 7);

    PriorityQueue<Paciente> colaPrioridad
      = new PriorityQueue<Paciente>();
    colaPrioridad.enqueue(paciente1);
    colaPrioridad.enqueue(paciente2);
    colaPrioridad.enqueue(paciente3);
    colaPrioridad.enqueue(paciente4);

    System.out.println();
    while (colaPrioridad.getSize() > 0)
      System.out.print(colaPrioridad.dequeue() + " ");
  }

  static class Paciente implements Comparable<Paciente> {
    private String nombre;
    private int prioridad;

    public Paciente(String name, int priority) {
      this.nombre = name;
      this.prioridad = priority;
    }

    @Override
    public String toString() {
      return nombre + "(prioridad:" + prioridad + ")";
    }

    public int compareTo(Paciente o) {
      return this.prioridad - o.prioridad;
    }
  }
}
