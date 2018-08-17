package com.inapp.testjava.util;

public class ArraysInJava {
	
	
public void testing(){
	String arr[]={"sumesh","remesh","rakesh"};  
	Class c=arr.getClass();  
	String name=c.getName();  
	System.out.println(name);
	System.out.println(arr);
	
}	  
	

	public static void main(String[] args) {
		ArraysInJava obj=new ArraysInJava();
		obj.testing();
		
		

	}

}
