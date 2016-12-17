package lab2_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
public class BinarySearchJestSrodkowymElementem {
	
	
	@Test
	public void test(){
	int key = 2;
	int[] seq = {1,2,3};
	int i;
	
	SearchResult searchResult = BinarySearch.search(key, seq);
	i=searchResult.getPosition();
	
	assertTrue(searchResult.isFound());
	assertEquals(key, seq[i-1]);
}

}
