package HierarticalInheritence;

public class TestHierartical {
	public static void main(String args[]) {
		Ipl ipl=new Ipl();
		ipl.overs();
		
		RoyalChallengersBangalore royalchallengersbangalore=new RoyalChallengersBangalore();
		royalchallengersbangalore.overs();
		royalchallengersbangalore.caption();
		
		MumbaiIndians mumbaiindians=new MumbaiIndians();
		mumbaiindians.overs();
		mumbaiindians.caption();
		
		DelhiCapitals delhicapitals=new DelhiCapitals();
		delhicapitals.overs();
		delhicapitals.Caption();
		
		
		
		
	}
}
