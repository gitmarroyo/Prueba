package prueba;

import java.awt.Graphics;

import javax.swing.JApplet;

public class Prueba extends JApplet{

	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {
			float x = 1;
			char r;
	        g.drawString("Hola, mundo!", 45, 95);
	        g.drawString("Aquí estamos practicando!", 45, 105);
	        g.drawString("Aquí estamos intentando hacer repositorio!", 45, 125);
	        g.drawString("Prueba repositorio 1", 45, 150);
	        g.drawString("Prueba Rama-2", 45, 170);
	        x = x+1;
	        ++x;
	        x=x/2;
	        r= (char) x;
	        g.drawString("El estimado", 45, 190);
	        System.out.println("Resultado de la operación: " + x);
	        System.out.println("Resultado de la operación 2: " + r);
	    }
}
