package practicaivancrespo;

import java.util.ArrayList;

public class CalculosMatematicos {
	
	public CalculosMatematicos() {		
	}

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
