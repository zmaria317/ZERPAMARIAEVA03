package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements INadador{
	
	private String estiloPreferido;
	private Boolean seNadar = true;
	
	

	public Nadador(Integer numeroDeSocio, String nombre, String estiloPreferido) {
		super(numeroDeSocio, nombre);
		this.estiloPreferido = estiloPreferido;
		
	}

	public String getEstiloPreferido() {
		return estiloPreferido;
	}

	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}

	@Override
	public Boolean seNadar() {
		if(this.seNadar.equals(true)) {
			return true;
		}
		return false;
	
	}
	
}
