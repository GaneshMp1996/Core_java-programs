package custom_Arrays_Atm;

import custom_Arrays.DmartExp;

public class Ganesh {
	public static void main(String args[]) throws DmartExp
	{
		SbiAtm sbiatm=new SbiAtm();
		
		try {
			sbiatm.withdraw("700");
		}catch (SbiAtmExp e) {
			System.out.println(e);
		}
	}

}
