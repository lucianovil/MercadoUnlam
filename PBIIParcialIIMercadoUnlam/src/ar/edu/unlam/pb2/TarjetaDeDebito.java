package ar.edu.unlam.pb2;

public class TarjetaDeDebito extends Tarjeta implements Pagadora {

	public TarjetaDeDebito(Long numero, String titular, String fechaDeVencimiento, Integer codigoDeSeguridad)
			throws NumeroDeTarjetaInvalidoException {
		this.setNumero(numero);
		this.setTitular(titular);
		this.setFechaDeVencimiento(fechaDeVencimiento);
		this.setcodigoDeSeguridad(codigoDeSeguridad);
		this.setSaldo(0.0);
	}

	private void setTitular(String titular) {
		this.titular = titular;

	}

	@Override
	public void setNumero(Long numero) throws NumeroDeTarjetaInvalidoException {

		String numeroDeTarjetaEnString = numero.toString();
		if (numeroDeTarjetaEnString.length() != CANTIDAD_DE_DIGITOS_DE_LA_TARJETA) {
			throw new NumeroDeTarjetaInvalidoException();
		}
		this.numero = numero;
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getSaldo() {
		return this.saldo;
	}

}
