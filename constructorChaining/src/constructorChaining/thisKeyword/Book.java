package constructorChaining.thisKeyword;

public class Book {
	String name;
	int noOfpages;
	
	Book(){
		this("classmate",200);
		
		System.out.println("default cons");
		
		
		}
	Book(String name,int noOfpages){
		this.name=name;
		this.noOfpages = noOfpages;
		System.out.println("two parametrised cons");
	}
	Book(String name){
		this();
		System.out.println("default cons");
	}
		
		
	}
	


