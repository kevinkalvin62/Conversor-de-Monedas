
public class seleccionaPrimerMoneda {
	String TipoMoneda;
	String segundaMoneda;
	double primerMoneda;
	double cantidad, resultado;

	public void escogerMoneda(String seleccionDeMoneda, String SegundaSeleccion, double cantidadIngresada) {
		TipoMoneda = seleccionDeMoneda;
		segundaMoneda = SegundaSeleccion;
		valorMonedas monedas = new valorMonedas();
		switch (TipoMoneda) {
		case "peso":
			primerMoneda = monedas.getPeso(segundaMoneda);
			cantidad = cantidadIngresada;
			// resultado= cantidad/primerMoneda;
			resultado = setResultados(cantidad, primerMoneda);
			break;
		case "dolar":
			primerMoneda = monedas.getDolar(segundaMoneda);
			cantidad = cantidadIngresada;
			resultado = setResultados(cantidad, primerMoneda);
			resultado = setResultados(cantidad, primerMoneda);
			break;
		case "libra":
			primerMoneda = monedas.getLibra(segundaMoneda);
			cantidad = cantidadIngresada;
			if (segundaMoneda == "dolar") {
				resultado = setResultadosYan(cantidad, primerMoneda);
			} else if (segundaMoneda != "dolar") {
				resultado = setResultadosYan(cantidad, primerMoneda);
			}
			break;
		case "yan":
			primerMoneda = monedas.getYan(segundaMoneda);
			cantidad = cantidadIngresada;
			resultado = setResultadosYan(cantidad, primerMoneda);
			break;
		case "wonj":
			resultado = primerMoneda = monedas.getWonj(segundaMoneda);
			cantidad = cantidadIngresada;
			setResultados(cantidad, primerMoneda);
			break;
		}
	}

	public double setResultados(double laCantidad, double moneda) {
		double getCantidad = laCantidad;
		double getMoneda = moneda;
		return getCantidad / getMoneda;
	}

	public double setResultadosYan(double laCantidad, double moneda) {
		double getCantidad = laCantidad;
		double getMoneda = moneda;
		return getCantidad * getMoneda;
	}

	public double getResultados() {
		return resultado;
	}

	public double getResultadosYan() {
		return resultado;
	}

}
