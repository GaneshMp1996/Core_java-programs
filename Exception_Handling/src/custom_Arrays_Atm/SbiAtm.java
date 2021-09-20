package custom_Arrays_Atm;

import java.util.Arrays;

import custom_Arrays.DmartExp;

public class SbiAtm {
	String[]atmMachine= {"100","200","500",};
	void withdraw(String amount)throws DmartExp, SbiAtmExp {
		if(Arrays.binarySearch(atmMachine,amount)!= -1) {
			System.out.println("amount is available,withdraw it");
	}
		else
			{
			SbiAtmExp sbiatmexp=new SbiAtmExp ();
			throw sbiatmexp;
		}
	
	}
}


