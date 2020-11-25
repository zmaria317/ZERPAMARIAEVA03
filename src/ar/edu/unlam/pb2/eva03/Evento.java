package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	
	public Evento(TipoDeEvento tipo, Integer numeroDeInscripcion) {
		this.tipo = tipo;
		this.numeroDeInscripcion = numeroDeInscripcion;
		this.participantes = new HashMap <Integer, Deportista> ();
	}


	public TipoDeEvento getTipo() {
		return tipo;
	}


	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}


	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}


	public void setNumeroDeInscripcion(Integer numeroDeInscripcion) {
		this.numeroDeInscripcion = numeroDeInscripcion;
	}


	public Map<Integer, Deportista> getParticipantes() {
		return participantes;
	}


	public void setParticipantes(Map<Integer, Deportista> participantes) {
		this.participantes = participantes;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDeInscripcion == null) ? 0 : numeroDeInscripcion.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (numeroDeInscripcion == null) {
			if (other.numeroDeInscripcion != null)
				return false;
		} else if (!numeroDeInscripcion.equals(other.numeroDeInscripcion))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	
	
	
	
	
	
}
