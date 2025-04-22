package practicaivancrespo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el número sobre el que hacer los cálculos");
		
		int numero = sc.nextInt();
		
		CalculosMatematicos misCalculosMatematicos = new CalculosMatematicos();
misCalculosMatematicos.calculosRefactorizados(numero);
	}

}
