package lab2_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchNieJestWSekwencjiLong {

	@Test
	public void test(){
		
		int key=4;
		int[] seq={1,2,3};
		int i;
		
		SearchResult searchResult = BinarySearch.search(key, seq);
		i=searchResult.getPosition();
		
		assertFalse(searchResult.isFound());
		assertEquals(-1,i);
	}
	
	
}
