package arrays5A7;

import java.util.Arrays;
/**
 * 
 * @author Janira
 *
 */
public class Iguales {
	
	public static boolean sonIguales (int[] array1, int[] array2) {
		
		boolean iguales=false;
		
		for (int i=0; i<=array1.length-1; i++) {
			for (int j=i; j<=array2.length-1; j++) {
				if (array1[i]==array2[j]) {
					iguales=true;
				}else
					iguales=false;
			}
		}
		return iguales;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array1 = new int[10];
		Utilidades.rellenaArray(array1, 0, 20);
		Arrays.toString(array1);
		
		int [] array2 =  array1.clone(); //new int[10];
		//Utilidades.rellenaArray(array2, 0, 20);
		Arrays.toString(array1);
		
		if (sonIguales(array1,array2)) {
			System.out.println("Los arrays son iguales");
		}else System.out.println("No son iguales ni parecidos");
	}

}
