package dc.learn.Testpack;

public class IsUpperCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "NONMH";
		//StringBuffer stb = new StringBuffer(str);
		//char[] c = str.toCharArray();
		boolean isUpper = false;
		for(Character c: str.toCharArray()){
			if(Character.isUpperCase(c)){
				isUpper = true;	
			}else{
				isUpper = false;
			}
		}
		System.out.println(isUpper);

	}

}
