package ar.edu.unlam.pb2;

import java.util.Objects;

public abstract class Tarjeta extends MedioDePago {

	protected Long numero;
	protected String fechaDeVencimiento;
	protected Integer codigoDeSeguridad;
	protected Double saldo;

	protected final Integer CANTIDAD_DE_DIGITOS_DE_LA_TARJETA = 16;

	protected void setcodigoDeSeguridad(Integer codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}

	protected void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Long getNumero() {
		return numero;
	}

	public Integer getCodigoDeSeguridad() {
		return codigoDeSeguridad;
	}

	public void setCodigoDeSeguridad(Integer codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}

	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public abstract Double getSaldo();

	protected void setNumero(Long numero) throws NumeroDeTarjetaInvalidoException {

		String numeroDeTarjetaEnString = numero.toString();
		if (numeroDeTarjetaEnString.length() != CANTIDAD_DE_DIGITOS_DE_LA_TARJETA) {
			throw new NumeroDeTarjetaInvalidoException();
		}
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		return Objects.equals(numero, other.numero);
	}

}
