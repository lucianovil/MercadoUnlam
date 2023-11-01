package ar.edu.unlam.pb2;

import java.util.Objects;

public class Comercio {

	private Long cuit;
	private String nombre;

	private final Integer CANTIDAD_DE_DIGITOS_DEL_CUIT = 11;
	private final String COMIENZO_CUIT = "30";

	public Comercio(Long cuit, String nombre) throws CuitInvalidoException {
		this.setCuit(cuit);
		this.setNombre(nombre);
	}

	protected void setCuit(Long cuit) throws CuitInvalidoException {

		String CuitEnString = cuit.toString();
		if (CuitEnString.length() != CANTIDAD_DE_DIGITOS_DEL_CUIT || CuitEnString.substring(0, 2) == COMIENZO_CUIT) {
			throw new CuitInvalidoException();
		}
		this.cuit = cuit;
	}

	public Long getCuit() {
		return cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cuit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comercio other = (Comercio) obj;
		return Objects.equals(cuit, other.cuit);
	}

}
