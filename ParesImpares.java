package del5al7;

import java.util.Arrays;

/**
 * Escribid un programa Java para encontrar el número de enteros pares e impares 
 * en un array dado de números enteros.
 * @author victor
 *
 */
public class ParesImpares {

	public static int sonPares(int[] numeros) {
		/*
		 * Vamos a usar la variable pares como un contador. Siempre se incializa a 0 y
		 * se incrementa de uno en uno
		 */
		int pares = 0;
		// Recorremos el array
		for (int i = 0; i < numeros.length; i++) {
			// Si es par, es decir, el resto de dividirlo entre 2 es 0, aumentamos el
			// contador
			if ((numeros[i] % 2) == 0) {
				pares++;
			}
		}
		return pares;
	}

	public static void main(String[] args) {
		int[] numeros = new int[20];
	
		int pares = 0;
		Utilidades.rellenaArray(numeros, 0, 30);

		System.out.println("Original Array : " + Arrays.toString(numeros));
		
		pares = sonPares(numeros);
		
		System.out.printf("El array contiene %d números pares y %d impares", pares, numeros.length - pares);
	}

}