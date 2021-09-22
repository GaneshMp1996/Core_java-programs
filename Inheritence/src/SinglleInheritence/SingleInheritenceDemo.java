package SinglleInheritence;

public class SingleInheritenceDemo {
	   public static void main(String args[])
	   {  
	    Animal animal=new Animal ();
	     animal.speechless();	           // if we need only cow properties then no          need to create object for animal and these 4 lines of codes we can put inside  // so they will not execute
	   animal.eatGrass();
	   animal. feedbaby();

	 Cow cow= new Cow();
	 cow.speechless();
	 cow.eatGrass();
	 cow.feedbaby();
	 cow.provideMilk();
	 cow.agression();
	 }

}
