package org.mp.tema06;

public class SystemDemo {

	public static void main(String[] args) {
		
		// Todas las propiedades por defecto del sistema
		java.util.Properties properties = System.getProperties();
		
		properties.list(System.out);
		
		System.out.println("========================================");
		
		// Home
		String path = System.getProperty("user.home");

		System.out.println("Your Home Path: " + path);
		System.out.println("========================================");
		
		//Sistema operativo
		System.out.println(System.getProperty("os.name"));
		System.out.println("========================================");
		
		// Directorio por defecto
		System.out.println(System.getProperty("user.dir"));
		System.out.println("========================================");

		
	}
}

