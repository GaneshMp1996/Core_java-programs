package custom_Arrays;

public class Ganesh {
	public static void main(String args[])  {
		
		Dmart dmart=new Dmart();
		try {
			dmart.searchItem("speaker");
		} catch (DmartExp e) {
		System.out.println(e);
		}

		}
		
	}


