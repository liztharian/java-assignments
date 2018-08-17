package com.inapp.testjava.util;

//import javax.swing.SingleSelectionModel;

public class AcessModifiers {
	
	private int mark1; private int mark2;
	 
	
	 AcessModifiers() {
		String name = "john";
		int age = 26;
		System.out.println("name="+ name);
		System.out.println( "age="+age);
		
	}
	 
	 protected void  marksOfStudentInTwoSub (int mark1, int mark2){
		this.mark1= mark1;
		this.mark2=mark2;
		System.out.println("mark1="+mark1);
		System.out.println("mark2="+mark2);
	 }
	
	
	

	public static void main(String[] args) {
		System.out.println("Readyfortest");
	}

}



