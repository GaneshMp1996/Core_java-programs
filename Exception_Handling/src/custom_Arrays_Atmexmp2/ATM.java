package custom_Arrays_Atmexmp2;

public class ATM {
void draw(int amount) throws ATMExp {
	
	if (amount>50000||amount%100 !=0){
		ATMExp atmExp=new ATMExp ();
		throw atmExp;
		}
	else {
		System.out.println("collect cash...!");
	}
		
		
	
		
	}
	
}

