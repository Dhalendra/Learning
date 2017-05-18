package dc.learn.Testpack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * Write a program which receives 1 string and give us all consecutive substring. it means String with consecutive characters
 * ie BCCD should give [BC,CD]
 * @author chandd2
 * Wrote a utility method find all substring as well.
 * 
 */

public class ConsecutiveSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "BCDEFFFFRESTHJKL";
		List<String> subList = new ArrayList<String>();
		Set<String> resultSet = new LinkedHashSet<String>();
		subList = findAllSubString(str);
		//System.out.println(subList);
		for (String str1 : subList) {
			if (str1.length() >= 2) {
				//System.out.println(str1  + "str length " + str1.length());
				for (int i = 0; i < str1.length() - 1; i++) {
					// System.out.println("null" + stb.toString());
					if ((int) str1.charAt(i + 1) - (int) str1.charAt(i) == 1) { //(int) char gives you ASCII values
						if(i+1 == str1.length() -1){ // This is to make sure that we reached last character of string
							resultSet.add(str1);
					}
					}else{
						break;
					}
				}
			}
		}
		System.out.println(resultSet);

	}

	private static List<String> findAllSubString(String str) {
		// TODO Auto-generated method stub
		int strLength = str.length();
		List<String> subList = new ArrayList<String>();
		for (int i = 0; i < strLength; i++) {
			for (int j = i + 1; j <= strLength; j++) {
				String str1 = str.substring(i, j);
				subList.add(str1);
			}
		}
		return subList;
	}

}
