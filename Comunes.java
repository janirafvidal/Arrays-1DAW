package arrays;
/**
 * 
 * @author Janira
 *
 */
public class Comunes {
	
	public static String comunes (int[] array1, int[] array2) {
		String iguales="";
		
		for (int valor:array1) {
			for (int valor2:array2) {
				if (valor==valor2) {
					iguales+=valor +" ";
				}
			}
		}
		return iguales;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros1 = {26, 14, 25, 18, 99, 25};
		int [] numeros2 = {26, 74, 99, 28, 13, 18};
		
		
		System.out.println("Los numeros en común son :" +comunes(numeros1,numeros2));
	}

}
