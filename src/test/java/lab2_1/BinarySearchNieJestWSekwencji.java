package lab2_1;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchNieJestWSekwencji {
	
	@Test
	public void test(){
		
		int key=1;
		int[] seq={2};
		int i;
		
		SearchResult searchResult = BinarySearch.search(key, seq);
		i=searchResult.getPosition();
		
		assertFalse(searchResult.isFound());
		assertEquals(-1,i);
	}

}
