package arrays5A7;
/**
 * 
 * @author Janira

 */
import java.util.Arrays;

public class MoverCeros {
	
public static int[] mueveCeros (int[] numeros) {
		
		int zeroPosition = 0;
		int valorPosicion = 0;
		
		for (int i=0; i<=numeros.length-1; i++) {
			if (0==numeros[i]) {
				zeroPosition=i;
				valorPosicion=numeros[zeroPosition];
				//cuantosCeros++;
				for (int j=zeroPosition; j<numeros.length-1; j++) {
					numeros[j] = numeros[j+1];
				}
				numeros[numeros.length-1]=valorPosicion; //mueve 0 al final
			}
		}
		
		return numeros;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array1 = {12, 0, 14, 0, 12, 0, 84, 0, 2, 10, 12};
		System.out.println(Arrays.toString(array1));
		
		System.out.println(Arrays.toString(mueveCeros(array1)));

	}

}
