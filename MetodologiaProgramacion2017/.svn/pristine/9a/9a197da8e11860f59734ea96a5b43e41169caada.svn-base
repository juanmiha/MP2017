package org.mp.tema05;
import java.util.*;

public class TestColeccion {
  public static void main(String[] args) {
    ArrayList<String> coleccion1 = new ArrayList<String>();
    coleccion1.add("Almeria");
    coleccion1.add("Granada");
    coleccion1.add("Cadiz");
    coleccion1.add("Jaen");

    System.out.println("Una lista de ciudades de la colección 1:");
    System.out.println(coleccion1);

    System.out.println("\n¿Está Almería en la colección 1? "
      + coleccion1.contains("Almeria"));

    coleccion1.remove("Almeria");
    System.out.println("\n"+
       "Ahora tiene "+ coleccion1.size() + " ciudades la colección 1");

    Collection<String> coleccion2 = new ArrayList<String>();
    coleccion2.add("Madrid");
    coleccion2.add("Barcelona");
    coleccion2.add("San Sebastian");
    coleccion2.add("Granada");

    System.out.println("\nUna lista de ciudades de la colección 2:");
    System.out.println(coleccion2);

    ArrayList<String> c1 = (ArrayList<String>)(coleccion1.clone());
    c1.addAll(coleccion2);
    System.out.println("\nCiudades en la colección 1 o en la colección 2: ");
    System.out.println(c1);

    c1 = (ArrayList<String>)(coleccion1.clone());
    c1.retainAll(coleccion2);
    System.out.print("\nCiudades en la colecci´on 1 y en la colección 2: ");
    System.out.println(c1);

    c1 = (ArrayList<String>)(coleccion1.clone());
    c1.removeAll(coleccion2);
    System.out.print("\nCiudades en la colección 1, pero no en la 2: ");
    System.out.println(c1);
  }
}
