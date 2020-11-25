package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;


public class Triatleta  extends Deportista implements ICorredor,  ICiclista, INadador{
	
	private String distanciaPreferida;
	private TipoDeBicicleta tipoDeBicicleta;
	private Boolean seCorrer = true;
	private Boolean seNadar = true;
	private Boolean seAndarEnBicicleta = true;
	private Integer cantidadDeKilometrosEntrenados;

	public Triatleta(Integer numeroDeSocio, String nombre , String distanciaPreferida, TipoDeBicicleta tria) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.cantidadDeKilometrosEntrenados = 0;
		
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta.TRIA;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	@Override
	public Boolean seCorrer() {
		if(this.seCorrer.equals(true)) {
			return true;
		}
			return false;
	}
	

	@Override
	public Boolean seNadar() {
		if(this.seNadar.equals(true)) {
			return true;
		}
		return false;
	
	}
	
	
	@Override
	public Boolean seAndarEnBicicleta() {
		if(this.seAndarEnBicicleta.equals(true)) {
			return true;
		}
		return false;
		
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKilometrosEntrenados = km;
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.getCantidadDeKilometrosEntrenados();
	}
	
	

	
	
	

}