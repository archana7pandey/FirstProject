package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class ExArray {

	public static void main(String[] args) {
		
		//******datatype arrayname[]=new datatype[size]**************
		
		//int a[]=new int[5];
		//String names[]= new String[10];
		
		//WebDriver driver=new FirefoxDriver();//new ChromeDriver(); new IEDriver()
		//List namesList=new ArrayList(); it will throws exeption if we will add different datatype values 
		List<String> namesList=new ArrayList<String>();
		namesList.add("John");
		namesList.add("James");
		namesList.add("John");
		namesList.add("James");
		System.out.println(namesList.size());
		System.out.println(namesList.get(3).length());
	 	
	  // or  System.out.println(((String)namesList.get(3)).length());
		
	}

}
