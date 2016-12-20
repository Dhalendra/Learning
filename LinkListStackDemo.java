package dc.learn.Stack;



public class LinkListStackDemo<T> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkListStack<Integer> st = new LinkListStack<Integer>();

		st.push(50);
		st.push(70);
		st.push(190);
		System.out.println(st.toString());
		// st.displayStack();
		st.pop();
		// st.displayStack();
		System.out.println(st.toString());
	}

}
