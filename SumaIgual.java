package arrays;
/**
 * 
 * @author Janira
 *
 */
public class SumaIgual {
	
	public static String sumanX (int[] numeros, int result) {
		String sumandos="";
		
		for (int nums1:numeros) {
			for (int nums2:numeros) {
				if ((nums1+nums2)==result) {
					sumandos+=nums1 +" + " +nums2 +", ";
				}
			}
		}
		return sumandos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros= {3, 5, 4, 3, 2, 7, 5};
		int resultado=7;
	
		System.out.println("Los numeros que suman " +resultado +" son " +sumanX(numeros,resultado));
		
	}

}
