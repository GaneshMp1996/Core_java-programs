package custom_Arrays;

import java.util.Arrays;

public class Dmart {
	String[] dmartStore= {"dall","oil","chaco","dry fruits","mobile"};
	
	void searchItem(String itemName)throws DmartExp {
		System.out.println(Arrays.binarySearch(dmartStore, itemName));
		if(Arrays.binarySearch(dmartStore, itemName)!= -1) {
			
			System.out.println("Item is available please buy it");
		}
		else {
			 DmartExp dmartExp = new DmartExp();
			throw dmartExp;
	}
			
		
	}
}
	


