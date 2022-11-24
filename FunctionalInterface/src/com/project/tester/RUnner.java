package com.project.tester;
//any interface consistes of only single method (Including abstract()) we call as functional interface
//lambda expressions will reduce more lines of code even we need to instantiate class also
//exmples are below

import com.project.demo.Addable;
import com.project.demo.Office;
import com.project.demo.Playable;
import com.project.demo.Sleepable;
import com.project.demo.Walkable;
import com.project.demo.Workable;

public class RUnner {
	public static void main(String[] args) {
		Office gdc = new Office();
		gdc.work();
		Office gdc1 = new Office();
		gdc.work();
		System.out.println("********************");
		Office ganesh = new Office() {
			public void work() {
				System.out.println("If employee works on sunday,pay is double on normal pay");
			}

		};
		ganesh.work();

		Workable w = () -> {
			System.out.println("Employee should attend every meeting");
		};
		w.work();

		Playable p = (sport) -> {
			System.out.println("Most valuable game in india is: " + sport);
		};
		p.play("Cricket");

		Addable a1 = (a, b) -> {
			return a + b;
		};
		int sum = a1.add(30, 50);
		System.out.println("The addition of two numbers is: " + sum);
		Walkable walk = () -> {

			return "We can walk daily";
		};
		System.out.println(walk.walk());
		
		Sleepable s=()->( "i will sleep for 8 hrs daily");
		System.out.println(s.sleep());
	}

}
