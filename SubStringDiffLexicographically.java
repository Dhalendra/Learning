package dc.learn.Testpack;

/**
 * compareTo is used to compare two strings ascii values.
 * @author chandd2
 *
 */

public class SubStringDiffLexicographically {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);

		System.out.println(maxStr());

		// sc.close();

	}

	private static String maxStr() {
		// TODO Auto-generated method stub
		String[] strAr = { "Aleax", "Harry","Michael", "Marry" ,"A"};
		// System.out.println(strAr[4]);
		String min = strAr[0], max = strAr[0];
		// System.out.println("min "+ min);
		for (int i = 0; i < strAr.length-1; i++) {
		//	System.out.println( i + " " + min.compareTo(strAr[i+1]) + " Atr i : " + min + " atr i+1 : " + strAr[i+1]);
			if ((min.compareTo(strAr[i+1])) >0 ){
				min = strAr[i+1];
				System.out.println("min inside loop: "+ min);
			} if((max.compareTo(strAr[i+1]))<0){
				max = strAr[i+1];
				System.out.println("max inside loop: "+ max);
			}

		}
		return max;
	}

}
