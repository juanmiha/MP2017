package org.mp.tema09;

public class Municipio {
	
	private String comunidad;
	private String provincia;
	private String municipio;
	private long poblacion;

	public Municipio(String comunidad, String provincia, String municipio,
			long poblacion) {
		super();
		this.comunidad = comunidad;
		this.provincia = provincia;
		this.municipio = municipio;
		this.poblacion = poblacion;
	}
	public String getComunidad() {
		return comunidad;
	}
	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public double getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(long poblacion) {
		this.poblacion = poblacion;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Municipio other = (Municipio) obj;
		if (municipio == null) {
			if (other.municipio != null)
				return false;
		} else if (!municipio.equals(other.municipio))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Municipio [comunidad=" + comunidad + ", provincia=" + provincia
				+ ", municipio=" + municipio + ", poblacion=" + poblacion + "]";
	}
	 
}
