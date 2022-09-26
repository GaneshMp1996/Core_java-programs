package com.project.abstractdemo;

public class Runner {
	public static void main(String[] args) {
	//we cannot create object for abstract class,,	
		Hero hero=new Hero() {
			
			@Override
			void body() {
				System.out.println("Body is devoloped by Hero Campany,,");
				
			}
		};
		hero.body();
		Honda honda=new Honda();
		honda.engine();
		honda.body();
	}

}
