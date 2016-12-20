package dc.learn.CollectionTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveEvenIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> num = new ArrayList<Integer>();
		Set<Integer> index = new HashSet<Integer>();
		try{
		for(int i =0; i<10; i++){
			num.add(i); //AutoBoxing
		}
		System.out.println(num);
		for(Integer in : num ){
			if(in % 2 == 0 ){
			int ind = num.indexOf(in);
			index.add(ind);
				//num.remove(index); // FailFast iterator. Can't use Object.remove while iterating.
			}	
		}
		for (Integer in1 : index){
			System.out.println("in1 " + in1);
			num.remove(in1);
		}
		System.out.println("Last numbers: "+ num);
		
	}catch(Exception e)
	{
		 e.printStackTrace();
	}
	}
}
