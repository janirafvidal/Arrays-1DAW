package arrays;
/**
 * 
 * @author Janira
 *
 */
import java.util.Arrays;

public class Eliminar {
	
	public static int[] eliminar (int[] numeros, int posicion) {
		
		int valorPosicion = numeros[posicion];
		
		for (int i=posicion; i<numeros.length-1; i++) {
			numeros[i] = numeros[i+1];
		}
		
		numeros[numeros.length-1]=valorPosicion;
		return numeros;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = {12, 26, 15, 5, 98, 45};
		int posicion=0;
		
		System.out.println(Arrays.toString(numeros)); 
		
		do {
			posicion = Utilidades.leerEntero("Introduce posicion a eliminar :");
		}while(posicion>numeros.length-1);
			
		
		System.out.println(Arrays.toString(eliminar(numeros,posicion)));
		
	}

}
