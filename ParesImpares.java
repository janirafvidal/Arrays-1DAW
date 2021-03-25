package arrays5A7;
/**
 * 
 * @author Janira
 *
 */
public class ParesImpares {
	
	public static String pares (int[] numeros) {
		String pares="";
		
		for (int num:numeros) {
			if (num%2==0) {
				pares+=num +" ";
			}
		}
		return pares;
	}
	
	public static String impares (int[] numeros) {
		String impares="";
		
		for (int num:numeros) {
			if (num%2!=0) {
				impares+=num +" ";
			}
		}
		return impares;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros= {152, 153, 154, 155};
		
		System.out.println("Los numeros pares son " +pares(numeros));
		System.out.println("Los numeros impares son " +impares(numeros));
		
	}

}
