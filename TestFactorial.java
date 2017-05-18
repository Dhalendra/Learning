package dc.learn.Testpack;

public class TestFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		System.out.println(fact(num));

	}

	private static int fact(int num) {
		// TODO Auto-generated method stub
		if(num == 0) return 0;
		if(num == 1) return 1;
		if (num == 2) return 2;
		if(num>2){
			num *= fact(num-1);
		}
		return num;
	}

}
