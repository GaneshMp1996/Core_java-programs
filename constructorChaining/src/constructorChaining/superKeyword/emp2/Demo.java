package constructorChaining.superKeyword.emp2;

public class Demo {
	Demo(){
		this(80,90);
		System.out.println("Base class default called");
	}
	Demo(int x,int y){
		System.out.println("Base class parameterised constructor called");
	}
	
		
	}


