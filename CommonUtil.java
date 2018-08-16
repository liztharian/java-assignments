package com.inapp.firstjava.util;

public  class CommonUtil {
	public CommonUtil(String name) {
		      // This constructor has one parameter, name.
		      System.out.println("Passed Name is :" + name );
		   }

		   public static void main(String []args) {
		      // Following statement would create an object myPuppy
		      CommonUtil myPuppy = new CommonUtil( "tommy" );
		   }
		}
		
