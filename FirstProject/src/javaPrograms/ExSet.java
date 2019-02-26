package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class ExSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> setEx=new HashSet<String>();
		setEx.add("John");
		setEx.add("James");
		setEx.add("John");
		setEx.add("James");
		System.out.println(setEx.size());

    // Printing the values from the Set
	// Enhanced For loop	
		for(String str :setEx)
		{
			System.out.println("Set Values : "+ str);
		}
		
	}

}
