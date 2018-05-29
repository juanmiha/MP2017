package org.mp.tema05;
import java.util.*;

public class PriorityQueueDemo {
  public static void main(String[] args) {
    PriorityQueue<String> cola1 = new PriorityQueue<String>();
    cola1.offer("Oviedo");
    cola1.offer("Huesca");
    cola1.offer("Granada");
    cola1.offer("Teruel");

    System.out.println("Cola de prioridad usando Comparable:");
    while (cola1.size() > 0) {
      System.out.print(cola1.remove() + " ");
    }
    System.out.println();

    PriorityQueue<String> cola2 = new PriorityQueue<String>(
      4, Collections.reverseOrder());
    cola2.offer("Oviedo");
    cola2.offer("Huesca");
    cola2.offer("Granda");
    cola2.offer("Terual");

    System.out.println("\nCola de prioridad usando Comparator:");
    while (cola2.size() > 0) {
      System.out.print(cola2.remove() + " ");
    }
  }
}