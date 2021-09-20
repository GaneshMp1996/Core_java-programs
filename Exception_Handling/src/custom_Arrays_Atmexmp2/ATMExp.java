package custom_Arrays_Atmexmp2;

@SuppressWarnings("serial")
public class ATMExp extends Exception{

	@Override
	public String toString() {
		return "the amount you entered is excideeing limit";
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Invalid amount";
	}
	
  

	}
	


