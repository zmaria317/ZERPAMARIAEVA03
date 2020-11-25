package ar.edu.unlam.pb2.eva03.interfaces;

public interface ICorredor {
	
	
	public abstract Boolean seCorrer();
	
	public void setCantidadDeKilometrosEntrenados(Integer km);
	
	public Integer getCantidadDeKilometrosEntrenados();
}
