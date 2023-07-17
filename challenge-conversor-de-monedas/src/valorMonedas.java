
public class valorMonedas {
	private double peso;
	private double dolar;
	private double libra;
	private double yan;
	private double wonj;

	public double getPeso(String moneda) {
		switch (moneda) {
		case "dolar":
			peso = 17.2;
			return peso;
		case "libra":
			peso = 22.01;
			return peso;
		case "yan":
			peso = 0.12;
			return peso;
		case "wonj":
			peso = 100;
			return peso;
		}
		return peso = 1;
	}

	public double getDolar(String moneda) {
		switch (moneda) {
		case "peso":
			dolar = 0.059;
			return dolar;
		case "libra":
			dolar = 1.28;
			return dolar;
		case "yan":
			dolar = 15.5;
			return dolar;
		case "wonj":
			dolar = 10;
			return dolar;
		}
		return dolar = 1;
	}

	public double getLibra(String moneda) {
		switch (moneda) {
		case "peso":
			libra = 21.93;
			return libra;
		case "dolar":
			libra = 1.30;
			return libra;
		case "yan":
			libra = 9.31;
			return libra;
		case "wonj":
			libra = 1658;
			return libra;
		}
		return libra = 1;
	}

	public double getYan(String moneda) {
		switch (moneda) {
		case "peso":
			yan = 2.36;
			return yan;
		case "dolar":
			yan = 0.14;
			return yan;
		case "libra":
			yan = 0.11;
			return yan;
		case "wonj":
			yan = 178;
			return yan;
		}
		return yan = 1;
	}

	public double getWonj(String moneda) {
		switch (moneda) {
		case "peso":
			wonj = 17.5;
			return wonj;
		case "dolar":
			wonj = 20;
			return wonj;
		case "libra":
			wonj = 15.5;
			return wonj;
		case "yan":
			wonj = 10;
			return wonj;
		}
		return wonj = 1;
	}
}
