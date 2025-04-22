package practicaivancrespo;

import java.util.ArrayList;
/**
 * Clase que contiene operaciones matemáticas como factorización y cálculo del MCD.
 */
public class CalculosMatematicos {
	
	public CalculosMatematicos() {		
	}

/**
     * Calcula el MCD de dos números usando el algoritmo de Euclides.
     * @param numA Primer número
     * @param numB Segundo número
     */
        public void calcularMCD(int numA, int numB) {
int a = numA, b = numB;
while (b != 0) {
int temp = b;
b = a % b;
a = temp;
}
System.out.println("El máximo común divisor de "+numA+ " y "+numB+" es " + a);
}

  /**
     * Realiza la descomposición en factores primos.
     * @param numero Número a descomponer
     */
	public void calculosRefactorizados(int numero) {
		
		
		// Calculamos los factoriales primos
		ArrayList<Integer> miArray = new ArrayList();
		boolean noEsPrimo = false;
		int j = 0;

		
		//Añadimos el 1
		miArray.add(1);
		
        noEsPrimo = factorialesPrimos(numero, noEsPrimo, j, miArray);			
		
		System.out.println("Los factoriales primos del número introducido son: "+miArray);
		
        noEsPrimo = comprobarPrimo(numero, noEsPrimo);
		
		if(noEsPrimo) {
			System.out.println("El número "+numero+ " NO es primo");
		} else System.out.println("El número "+numero+ " SI es primo");
	}			
/**
     * Verifica si un número es primo.
     * @param numero Número a verificar
     * @return true si es primo, false en caso contrario
     */
    private boolean comprobarPrimo(int numero, boolean noEsPrimo) {
        for (int  i = 2; i< numero ; i++) {
            noEsPrimo = false;
            if(numero%i==0) {
                noEsPrimo = true;
                i=numero;
            }
        }
        return noEsPrimo;
    }

    private boolean factorialesPrimos(int numero, boolean noEsPrimo, int j, ArrayList<Integer> miArray) {
        for (int  i = 2; i< numero ; i++) {
            noEsPrimo = false;
            j = 2;
            while(j<i) {
                if(i%j==0) {
                    noEsPrimo = true;
                    j=i;
                } else j++;
            }
            if(!noEsPrimo&&numero%i==0) {
                miArray.add(i);
            }
            
        }
        return noEsPrimo;
    }
}
