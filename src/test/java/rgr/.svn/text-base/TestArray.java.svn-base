package rgr;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestArray {

	@Test
	public void test() {
		 Cover laminateCover =new Cover();
	        Cover parquetCover =new Cover();
	        Cover linoleumCover= new Cover();
	        
	        laminateCover.setName("Ламинат");
	        parquetCover.setName("Паркет");
	        linoleumCover.setName("Линолеум");
	        String[] box1 = { // добавление массива
	        		"",
					laminateCover.getName(),
					parquetCover.getName(),
					linoleumCover.getName()
			    };
	      String[] box2= {
	    		  "",
	    		  "Ламинат",
	    		  "Паркет",
	    		  "Линолеум"
	      };
 		assertArrayEquals(box1, box2); 
 
	}
	
}
