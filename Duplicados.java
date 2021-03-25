package arrays;
/**
 * 
 * @author Janira
 *
 */
public class Duplicados {
	
	public static String duplicados (int [] valores) {
		String repetidos="";
		
		for (int i=0; i<valores.length-1; i++) {
			for (int j=i+1; j<=valores.length-1; j++) {
				if (valores[i]==valores[j]) {
					repetidos+=valores[i] +" ";
				}
			}
			
		}
		return repetidos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] valores= {12, 12, 25, 13, 16, 9, 8, 16};
		
		System.out.println("Los numeros que se repiten son : " +duplicados(valores));
		
	}

}
