package Operaciones;


public class Operaciones {

	public void Oper() {
		// TODO Auto-generated method stub
		float x = 1;

		x = x + 1;
		++x;
		System.out.println("Resultado de la operación ++x : " + x);
		x = x / 2;
		System.out.println("Resultado de la operación x=x/2 : " + x);
		x += 1;
		System.out.println("Resultado de la operación x+=1 : " + x);
		x -= 2;
		System.out.println("Resultado de la operación x-=2 : " + x);
		x++;
		System.out.println("Resultado de la operación x++ : " + x);
		System.out.println();
	}
}
