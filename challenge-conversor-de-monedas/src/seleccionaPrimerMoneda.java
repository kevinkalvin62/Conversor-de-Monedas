
public class seleccionaPrimerMoneda  {
	public void escogerMoneda(String seleccionDeMoneda, double cantidadIngresada) {
		String TipoMoneda = seleccionDeMoneda;
		 double primerMoneda;
		 double cantidad,resultado;
			Scanner entrada= new Scanner(System.in);
			valorMonedas monedas= new valorMonedas();
			//System.out.println("escoja la moneda a convertir,\n peso \n dolar \n libra \n yan \n wonj");
			TipoMoneda= entrada.next();
			switch (TipoMoneda) {
			case "peso":
				//System.out.println("escoja a que moneda va convertir, \n dolar \n libra \n yan \n wonj");
				TipoMoneda= entrada.next();
				primerMoneda=monedas.getPeso(TipoMoneda);
				//System.out.println("cuantos pesos desea convertir?");
				cantidad=entrada.nextDouble();
				resultado= cantidad/primerMoneda;
				//System.out.println(resultado);
				break;
			case "dolar":
				TipoMoneda= entrada.next();
				primerMoneda=monedas.getDolar(TipoMoneda);
				cantidad=entrada.nextDouble();
				resultado= cantidad* primerMoneda;
				break;
			case "libra":
				TipoMoneda= entrada.next();
				primerMoneda=monedas.getLibra(TipoMoneda);
				cantidad=entrada.nextDouble();
				resultado= cantidad* primerMoneda;
				break;
			case "yan":
				TipoMoneda= entrada.next();
				primerMoneda=monedas.getYan(TipoMoneda);
				cantidad=entrada.nextDouble();
				resultado= cantidad* primerMoneda;
				break;
			case "wonj":
				TipoMoneda= entrada.next();
				primerMoneda=monedas.getWonj(TipoMoneda);
				cantidad=entrada.nextDouble();
				resultado= cantidad* primerMoneda;
				break;
			}
	}
	
}
