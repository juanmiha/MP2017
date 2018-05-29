package org.mp.tema06;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EjemploScanner {
	
  public double media1(String archivoTexto) throws IOException{
	    
	    int contador = 0;
	    double suma = 0.0;

	    File file = new File(archivoTexto);
	    PrintWriter pw = new PrintWriter(file);
	    pw.println("2 3,4 5 6 7,4 9,1 10,5");
	    pw.close();

	    FileReader fr = new FileReader(archivoTexto);
	    BufferedReader br = new BufferedReader(fr);
	    
	    Scanner src = new Scanner(br.readLine());

	    while (src.hasNext()) {
	        suma += src.nextDouble();
	        contador++;
	    }

	    br.close();
	    
	    return suma / contador ;
	   
  }
  
  public double media2(String archivoTexto) throws IOException{
	  
	    int contador = 0;
	    double suma = 0.0;

	    File file = new File(archivoTexto);
	    PrintWriter pw = new PrintWriter(file);
	    pw.println("2;3,4;5;6;7,4;9,1;10,5");
	    pw.close();

	    FileReader fr = new FileReader(archivoTexto);
	    BufferedReader br = new BufferedReader(fr);
	    
	    Scanner src = new Scanner(br.readLine());
	    //usando un delimitador concreto ; Por defecto es el espacio en blanco
	    src.useDelimiter(";");

	    while (src.hasNext()) {
	        suma += src.nextDouble();
	        contador++;
	    }

	    br.close();
	    
	    return suma / contador ;
	  
  }
	
  public static void main(String args[]) throws IOException {

		String directorioEntrada = System.getProperty("user.dir");
		
		System.out.println("user.dir: " + directorioEntrada);

		directorioEntrada = directorioEntrada 
				+ File.separator + "src"
				+ File.separator + "org" 
				+ File.separator + "mp"
				+ File.separator + "tema06"
				;
		
		System.out.println(directorioEntrada);
		
		String archivo = directorioEntrada + File.separator + "test.txt";
		
		EjemploScanner es = new EjemploScanner();
		
		// la media debe salir 6.2
		
		System.out.println("La media es: "+es.media1(archivo));
		
		System.out.println("La media es: "+es.media2(archivo));
		
  }
}