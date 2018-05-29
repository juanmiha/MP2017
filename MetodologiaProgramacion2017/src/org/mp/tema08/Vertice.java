package org.mp.tema08;

 public class Vertice  {
    private int x, y;
    private String nombre;
   
    public Vertice(String nombre) {
        this.nombre = nombre;
      }
    
    public Vertice(String nombre, int x, int y) {
      this.nombre = nombre;
      this.x = x;
      this.y = y;
    }
    
    public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getX() {
      return x;
    }
    
    public int getY() {
      return y;
    }
    
    public String getNombre() {
      return nombre;
    }
    
    public boolean equals(Object o) {
      return ((Vertice)o).nombre.equals(this.nombre);
    }
  }