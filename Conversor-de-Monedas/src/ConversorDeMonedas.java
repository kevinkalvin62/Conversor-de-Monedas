import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class ConversorDeMonedas {
	public static void main(String[] args) {
		marco m1=new marco();
		m1.setVisible(true);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	 String TipoMoneda;
	 double primerMoneda;
	 double cantidad,resultado;
		Scanner entrada= new Scanner(System.in);
		monedas monedas= new monedas();
		System.out.println("escoja la moneda a convertir,\n peso \n dolar \n libra \n yan \n wonj");
		TipoMoneda= entrada.next();
		switch (TipoMoneda) {
		case "peso":
			System.out.println("escoja a que moneda va convertir, \n dolar \n libra \n yan \n wonj");
			TipoMoneda= entrada.next();
			primerMoneda=monedas.getPeso(TipoMoneda);
			System.out.println("cuantos pesos desea convertir?");
			cantidad=entrada.nextDouble();
			resultado= cantidad/primerMoneda;
			System.out.println(resultado);
			break;
		case "dolar":
			System.out.println("escoja a que moneda va convertir, \n peso \n libra \n yan \n wonj");
			TipoMoneda= entrada.next();
			primerMoneda=monedas.getDolar(TipoMoneda);
			System.out.println("cuantos dolares desea convertir?");
			cantidad=entrada.nextDouble();
			resultado= cantidad* primerMoneda;
			System.out.println(resultado);
			break;
		case "libra":
			System.out.println("escoja a que moneda va convertir, \n peso \n dolar \n yan \n wonj");
			TipoMoneda= entrada.next();
			primerMoneda=monedas.getLibra(TipoMoneda);
			System.out.println("cuantas libras desea convertir?");
			cantidad=entrada.nextDouble();
			resultado= cantidad* primerMoneda;
			System.out.println(resultado);
			break;
		case "yan":
			System.out.println("escoja a que moneda va convertir, \n peso \n dolar \n libra \n wonj");
			TipoMoneda= entrada.next();
			primerMoneda=monedas.getYan(TipoMoneda);
			System.out.println("cuantos yan desea convertir?");
			cantidad=entrada.nextDouble();
			resultado= cantidad* primerMoneda;
			System.out.println(resultado);
			break;
		case "wonj":
			System.out.println("escoja a que moneda va convertir, \n peso \n dolar \n libra \n yan");
			TipoMoneda= entrada.next();
			primerMoneda=monedas.getWonj(TipoMoneda);
			System.out.println("cuantos wonj desea convertir?");
			cantidad=entrada.nextDouble();
			resultado= cantidad* primerMoneda;
			System.out.println(resultado);
			break;
		}
		
		
	}
}
class marco extends JFrame{
	public marco() {
		Toolkit miPantalla= Toolkit.getDefaultToolkit();
		lamina laminaUno=new lamina();
		setBounds(550, 300, 500, 300);
		setTitle("convertidor de monedas");
		setIconImage(getIconImage());
		setResizable(false);
		Image icono= miPantalla.getImage("logo.png");
		setIconImage(icono);
		add(laminaUno);
		
	}
}
class lamina extends JPanel{	
	public lamina() {
		JTextField jtfCantidad= new JTextField(10);
		jtfCantidad.setLocation(300, 100);
		add(jtfCantidad);
		
		
	}
}

