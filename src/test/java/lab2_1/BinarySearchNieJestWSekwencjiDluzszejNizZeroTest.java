package lab2_1;

import org.junit.Test;
import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class BinarySearchNieJestWSekwencjiDluzszejNizZeroTest {

	@Test
	public void test(){
		
		int key=4;
		int[] seq={1,2,3};
		int i;
		int value=-1;
		boolean wart=false;
		
		SearchResult searchResult = BinarySearch.search(key, seq);
		i=searchResult.getPosition();
		
		assertThat(wart,is(equalTo(searchResult.isFound())));
		assertThat(value,is(equalTo(i)));
	}
	
	
}
