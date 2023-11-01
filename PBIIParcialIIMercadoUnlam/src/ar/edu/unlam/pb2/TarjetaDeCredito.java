package ar.edu.unlam.pb2;

public class TarjetaDeCredito extends Tarjeta implements Pagadora {

	private Double limiteDeCompraEnPesos;
	private Double limiteDeCompraEnDolares;

	public TarjetaDeCredito(Long numero, String titular, String fechaDeVencimiento, Integer codigoDeSeguridad,
			Double limiteCompraEnPesos, Double limiteCompraEnDolares) throws NumeroDeTarjetaInvalidoException {
		this.setNumero(numero);
		this.setTitular(titular);
		this.setFechaDeVencimiento(fechaDeVencimiento);
		this.setCodigoDeSeguridad(codigoDeSeguridad);
		this.setLimiteDeCompraEnPesos(limiteCompraEnPesos);
		this.setLimiteDeCompraEnDolares(limiteCompraEnDolares);

	}

	private void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		return null;
	}

	@Override
	public Double getSaldo() {
		return null;
	}

	public void setLimiteDeCompraEnPesos(Double limiteDeCompraEnPesos) {
		this.limiteDeCompraEnPesos = limiteDeCompraEnPesos;
	}

	public Double getLimiteDeCompraEnPesos() {
		return limiteDeCompraEnPesos;
	}

	public Double getLimiteDeCompraEnDolares() {
		return limiteDeCompraEnDolares;
	}

	public void setLimiteDeCompraEnDolares(Double limiteDeCompraEnDolares) {
		this.limiteDeCompraEnDolares = limiteDeCompraEnDolares;
	}

}
