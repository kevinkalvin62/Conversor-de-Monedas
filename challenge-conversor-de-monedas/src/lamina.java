
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class lamina extends JPanel{
	JTextField jtfCantidad;
	JTextField jtfResultado;
	JComboBox TipoMoneda;
	JComboBox segundaopcion;
	double cantidad;
	String resultado;
	 
	public lamina() {
		
		accionarCambio accionDeCambio= new accionarCambio();
		jtfCantidad=new JTextField(8);
		
		
		jtfResultado= new JTextField(8);
		
		add(jtfCantidad);
		add(jtfResultado);
		
		TipoMoneda=new JComboBox();
		TipoMoneda.addItem("peso");
		TipoMoneda.addItem("dolar");
		TipoMoneda.addItem("libra");
		TipoMoneda.addItem("yan");
		TipoMoneda.addItem("wonj");
		
		add(TipoMoneda);
		
		segundaopcion=new JComboBox();
		segundaopcion.addItem("peso");
		segundaopcion.addItem("dolar");
		segundaopcion.addItem("libra");
		segundaopcion.addItem("yan");
		segundaopcion.addItem("wonj");
		
		add(segundaopcion);
		
		JButton btnIntercambio=new JButton("presiona \n par intercambiar");
		btnIntercambio.addActionListener(accionDeCambio);
		add(btnIntercambio);
		
	}
	
	public class accionarCambio implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			DecimalFormat df= new DecimalFormat("#.00");
			try {
				String textCantidad= jtfCantidad.getText();
				cantidad= Double.parseDouble(textCantidad);
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "ADVERTENCIA, NOSE PUEDEN INGRSAR LETRAS");
			}
			
			seleccionaPrimerMoneda seleccion= new seleccionaPrimerMoneda();
			String valor=TipoMoneda.getSelectedItem().toString();
			String valorFinal= valor;
			String segundoValor=segundaopcion.getSelectedItem().toString();
			String segundoValorFinal= segundoValor;
			seleccion.escogerMoneda(valorFinal, segundoValorFinal, cantidad);
			resultado=df.format(seleccion.getResultados());
			jtfResultado.setText(resultado);
			System.out.println(segundoValor);
			System.out.println(segundoValorFinal);
			System.out.println(resultado);
		}
		
	}

}
