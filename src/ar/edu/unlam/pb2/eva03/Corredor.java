package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor{
	
	private Integer distanciaPreferida;
	private Integer cantidadDeKilometrosEntrenados;
	private Boolean seCorrer = true;



	public Corredor(Integer numeroDeSocio , String nombre, Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.cantidadDeKilometrosEntrenados = 0;
	}



	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}



	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}



	public Integer getCantidadDeKilometrosEntrenados() {
		return cantidadDeKilometrosEntrenados;
	}



	public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
		this.cantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
	}



	@Override
	public Boolean seCorrer() {
		if(this.seCorrer.equals(true)) {
			return true;
		}
			return false;
	}


	
	
	
	

}
