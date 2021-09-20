package custom_Arrays_Atmexmp2;

public class ATMTest {
	public static void main(String[] args) {
		
		ATM atm =new ATM();
		int amount =30000;
		try {
			atm.draw(amount);
		} catch (ATMExp e) {
			if(amount>50000) {
			System.out.println(e);
		}
		else {
			System.out.println(e.getMessage());
			
		
		}
	}
	}
}


