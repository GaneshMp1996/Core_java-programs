
public class Runtimepolymorphysm {
	public static void main(String args[]) {
		
		Axis axis=new Axis();
		axis.getInterestRate();
		
		Hdfc hdfc=new Hdfc();
		hdfc.getInterestRate();
		
		System.out.println("AXIS Interest Rate : "+ axis.getInterestRate());
		System.out.println("HDFC Interest Rate : "+ hdfc.getInterestRate());
		
	}

}
