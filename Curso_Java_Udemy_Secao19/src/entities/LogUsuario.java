package entities;

import java.time.Instant;
import java.util.Objects;

/**
 * Classe que contém as caracteristicas de um login de um usuário em uma data
 * específica.
 * 
 * @author noe.martins
 */
public class LogUsuario {
	private String name;
	private Instant date;
	
	public LogUsuario(String name, Instant date) {
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public Instant getDate() {
		return date;
	}
	/**
	 * Método do hashCode baseado no nome do usuário.
	 * 
	 * @return O hash do objeto
	 */
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogUsuario other = (LogUsuario) obj;
		return Objects.equals(name, other.name);
	}

	
}
