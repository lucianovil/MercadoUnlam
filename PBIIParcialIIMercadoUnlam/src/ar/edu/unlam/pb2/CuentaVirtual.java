package ar.edu.unlam.pb2;

import java.util.Objects;

public class CuentaVirtual extends Cuenta implements Transferible {

	private String cvu;
	private final Integer LARGO_CVU = 23;

	public CuentaVirtual(String cvu, String entidad, String titular) throws CVUInvalidoException {
		this.setCvu(cvu);
		this.entidad = entidad;
		this.titular = titular;
	}

	private void setCvu(String cvu) throws CVUInvalidoException {
		if (cvu.length() != LARGO_CVU) {
			throw new CVUInvalidoException();
		}
		this.cvu = cvu;
	}

	@Override
	public String getNumero() {
		return this.cvu;
	}

	@Override
	public void depositar(Double importe) {

	}

	@Override
	public Boolean extraer(Double importe) {
		return null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cvu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaVirtual other = (CuentaVirtual) obj;
		return Objects.equals(cvu, other.cvu);
	}

}
