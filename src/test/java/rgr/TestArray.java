package rgr;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestArray {

	@Test
	public void test() {
		 Cover laminateCover =new Cover();
	        Cover parquetCover =new Cover();
	        Cover linoleumCover= new Cover();
	        
	        laminateCover.setName("�������");
	        parquetCover.setName("������");
	        linoleumCover.setName("��������");
	        String[] box1 = { // ���������� �������
	        		"",
					laminateCover.getName(),
					parquetCover.getName(),
					linoleumCover.getName()
			    };
	      String[] box2= {
	    		  "",
	    		  "�������",
	    		  "������",
	    		  "��������"
	      };
 		assertArrayEquals(box1, box2); 
 
	}
	
}
