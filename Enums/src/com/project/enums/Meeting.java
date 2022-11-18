package com.project.enums;

public class Meeting {
	
	public void performence(String taskCompleted) {
		if(taskCompleted.equals("1 day")) {
			System.out.println(Response.excellent);
		}
		else if(taskCompleted.equals("2 day")) {
			System.out.println(Response.moderate);
		}
		else if(taskCompleted.equals("3 day")) {
			System.out.println(Response.good);
		}
		else if(taskCompleted.equals("4 day")) {
			System.out.println(Response.medium);
		}
		else if(taskCompleted.equals("5 day")) {
			System.out.println(Response.low);
		}
	}
	
	
	}


