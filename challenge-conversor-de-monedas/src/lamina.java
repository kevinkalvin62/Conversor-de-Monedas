
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class lamina extends JPanel{
	JTextField jtfCantidad;
	JTextField jtfResultado;
	JComboBox TipoMoneda;
	JComboBox segundaopcion;
	double resultado;
	public lamina() {
		accionarCambio accionDeCambio= new accionarCambio();
		jtfCantidad=new JTextField(8);
		jtfResultado= new JTextField(8);
		JButton btnIntercambio=new JButton("presiona \n par intercambiar");
		btnIntercambio.addActionListener(accionDeCambio);
		add(btnIntercambio);
		add(jtfCantidad);
		add(jtfResultado);
		TipoMoneda=new JComboBox();
		segundaopcion=new JComboBox();
		add(TipoMoneda);
		add(segundaopcion);
	}
	
	public class accionarCambio implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}

}
