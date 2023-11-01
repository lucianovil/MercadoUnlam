package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Consumidor implements Comparable {

	private Integer dni;
	private String nombre;
	private Set<MedioDePago> mediosDePago;

	public Consumidor(Integer dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.mediosDePago = new HashSet<MedioDePago>();
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consumidor other = (Consumidor) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public int compareTo(Object o) {
		return this.nombre.compareTo(((Consumidor) o).getNombre());
	}

	public void agregarMedioDePago(MedioDePago nuevo) {
		mediosDePago.add(nuevo);
	}

	public MedioDePago getMedioPagador(String identificadorDelMedioPago) {
		for (MedioDePago actual : mediosDePago) {
			if (actual instanceof Tarjeta) {
				Long numero = Long.parseLong(identificadorDelMedioPago);
				if (((Tarjeta) actual).getNumero().equals(numero)) {
					return actual;
				}
			} else {
				if (actual instanceof CuentaBancaria) {
					if (((CuentaBancaria) actual).getNumero().equals(identificadorDelMedioPago)) {
						return actual;
					}
				} else {
					if (((CuentaVirtual) actual).getNumero().equals(identificadorDelMedioPago)) {
						return actual;
					}
				}
			}
		}
		return null;
	}

}
