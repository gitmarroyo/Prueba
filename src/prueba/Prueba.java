package prueba;

import java.awt.Graphics;
import javax.swing.JApplet;

public class Prueba extends JApplet{

	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
	        g.drawString("Hola, mundo!", 45, 95);
	        g.drawString("Aqu� estamos practicando!", 45, 105);
	        g.drawString("Aqu� estamos intentando hacer un repositorio!", 45, 120);
	    }
}
