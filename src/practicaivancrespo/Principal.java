package practica;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el número sobre el que hacer los cálculos");
		
		int numero;
try {
numero = sc.nextInt();
}catch (Exception e){
System.out.println("El dato introducido no es un número");
return;
}

		
		new CalculosMatematicos().calculos(numero);

	}

}
