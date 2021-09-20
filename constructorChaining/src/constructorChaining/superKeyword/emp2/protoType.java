package constructorChaining.superKeyword.emp2;

public class protoType extends Demo {
	protoType(){
		this("java","python");
		System.out.println("Derived class default constructor called");
	}
       protoType(String str1,String str2){
    	   super();
    	   System.out.println("Derived class parameterised constructor called");
    	   
       }
	
		
	}

