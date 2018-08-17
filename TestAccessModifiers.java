package com.inapp.testjava.util;

public class TestAccessModifiers extends AcessModifiers {
	public int NoOfStudents (int number){
		return number;
		}
	
	public static void main(String[] args) {
		AcessModifiers obj = new AcessModifiers();
		obj.marksOfStudentInTwoSub(50, 100);
		TestAccessModifiers obj2= new TestAccessModifiers();
		
		
		System.out.println("number=" + obj2.NoOfStudents(60));
}
}
