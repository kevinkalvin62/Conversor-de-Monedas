
public class valorMonedas {
	private  double peso ;
	private  double dolar;
	private  double libra;
	private  double yan;
	private  double wonj;
	public double getPeso(String moneda) {
		switch (moneda) {
		case "dolar":
			peso= 17.2;
			 return peso;
		case "libra":
			peso= 22.01;
			 return peso;
		case "yan":
			peso= 0.12;
			 return peso;
		case "wonj":
			peso= 100;
			 return peso;
		}
		return peso=1;
	}
	public double getDolar(String moneda) {
		switch (moneda) {
		case "peso":
			dolar= 17.5;
			 return dolar;
		case "libra":
			dolar= 1.28;
			 return dolar;
		case "yan":
			dolar= 15.5;
			 return dolar;
		case "wonj":
			dolar= 10;
			 return dolar;
		}
		return dolar=1;
	}
	public double getLibra(String moneda) {
		switch (moneda) {
		case "peso":
			libra= 17.5;
			 return libra;
		case "dolar":
			libra= 20;
			 return libra;
		case "yan":
			libra= 15.5;
			 return libra;
		case "wonj":
			libra= 10;
			 return libra;
		}
		return libra=1;
	}
	public double getYan(String moneda) {
		switch (moneda) {
		case "peso":
			yan= 17.5;
			 return yan;
		case "dolar":
			yan= 20;
			 return yan;
		case "libra":
			yan= 15.5;
			 return yan;
		case "wonj":
			yan= 10;
			 return yan;
		}
		return yan=1;
	}
	public double getWonj(String moneda) {
		switch (moneda) {
		case "peso":
			wonj= 17.5;
			 return wonj;
		case "dolar":
			wonj= 20;
			 return wonj;
		case "libra":
			wonj= 15.5;
			 return wonj;
		case "yan":
			wonj= 10;
			 return wonj;
		}
		return wonj=1;
	}
}
