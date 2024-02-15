package com.daytwo.loopingstatement;

public class foreach {

	public static void main(String[] args) {
		int arr[]= { 10,20,40,70,80 };
		for(int i:arr)
		{
			System.out.println(i);
		}
		
       int charArr[]= {'X','Y','Z'};
       for(int c:charArr)
       {
    	   System.out.println(c);
       }
	}
}