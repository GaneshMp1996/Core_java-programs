package BranchingStatements;

public class Continue {
	public static void main (String[] args) {  
		for (int i=0 ; i<=10 ; i++)
		{         
		if(i%2==0)                   //*if(i%2!==0) print even number
		{
		continue;
		}
		System.out.print( i);
		}
		}

}
