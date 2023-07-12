import javax.swing.JFrame;

public class marco extends JFrame {
	public marco() {
		setBounds(550, 300, 250, 200);
		setTitle("convertidor de monedas");
		setResizable(false);
		lamina laminaUno= new lamina();
		add(laminaUno);
	}
}
