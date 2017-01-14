package lab2_1;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
public class BinarySearchJestSrodkowymElementemTest {
	
	
	@Test
	public void test(){
	int key = 2;
	int[] seq = {1,2,3};
	int i;
	boolean wart = true;
	
	SearchResult searchResult = BinarySearch.search(key, seq);
	i=searchResult.getPosition();
	
	assertThat(wart,is(equalTo(searchResult.isFound())));
	assertThat(key,is(equalTo(seq[i])));
	
}

}
