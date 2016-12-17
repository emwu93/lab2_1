package lab2_1;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class BinarySearchJestWSekwencjiTest {
	
	int key=1;
	int[] seq ={1,2};
	
	
	@Test
	public void test(){		
		
		assertSame(1,BinarySearch.search(key, seq));
		
	}
	
	
}
