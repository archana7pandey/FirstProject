package javaPrograms;


import java.util.Random;

public class ExRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int uLimit=999;
		Random rand=new Random();
//		
//		int i= rand.nextInt(uLimit);
//		System.out.println(i);
//		
//		//*************************************
//		//Generate 4 digit of random number
//		// Range : 1000 to 9999
//		//*************************************
//		
//		int min=1000;
//		int max=9999;
//		
//		int val=min+rand.nextInt(max-min);
//		System.out.println("4 digit random number is "+ val);
//		
//		//*************************************
//		//Generate Unique number *********************************
//		//*************************************
//		System.out.println(Calendar.getInstance().getTimeInMillis());
//		
//		System.out.println(Calendar.getInstance().getTimeInMillis()%1000); /// for last three digit 
//		
//		//*************************************
//		// Generating Random Ascii Characters
//		//*************************************
//		char ch='a';
//		int i1=ch;
//		System.out.println(i1);
//		char ch1=(char)(65+rand.nextInt(26));
//		System.out.println(ch1);
		
		
		
		//*************************************
		//Generate 8 digit of random number
		// Range : 10000000 to 99999999
		//*************************************
		
		int min=10000000;
		int max=99999999;
		
		int val=min+rand.nextInt(max-min);
		System.out.println("8 digit random number is "+ val);
		
		
		
	}

}
