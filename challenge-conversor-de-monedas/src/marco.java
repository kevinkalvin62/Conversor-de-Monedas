import javax.swing.JFrame;

public class marco extends JFrame {
	public marco() {
		setBounds(550, 300, 500, 300);
		setTitle("convertidor de monedas");
		setResizable(true);
		lamina laminaUno= new lamina();
		add(laminaUno);
	}
}
