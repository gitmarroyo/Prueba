package prueba;

import java.awt.Graphics;
import javax.swing.JApplet;

public class Prueba extends JApplet{

	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {
	        g.drawString("Hola, mundo!", 45, 95);
	        g.drawString("Aquí estamos practicando!", 45, 105);
	        g.drawString("Aquí estamos intentando hacer repositorio!", 45, 125);
	        g.drawString("Prueba repositorio 1", 45, 145);
	        g.drawString("Prueba Rama-2", 45, 145);
	    }
}
