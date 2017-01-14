package lab2_1;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class BinarySearchPustaSekwencjaWejsciowa {

	@Test(expected=IllegalArgumentException.class)
	public void test(){
		
		int key=1;
		int[] seq={};
		 
		BinarySearch.search(key, seq);	
		
	}
	
	
}
