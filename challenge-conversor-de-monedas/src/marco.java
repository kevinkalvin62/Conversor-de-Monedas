import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class marco extends JFrame {
	public marco() {
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		setBounds(550, 300, 250, 200);
		setTitle("convertidor de monedas");
		setResizable(false);
		lamina laminaUno = new lamina();
		Image icono = miPantalla.getImage("logo.png");
		setIconImage(icono);
		add(laminaUno);
	}
}
