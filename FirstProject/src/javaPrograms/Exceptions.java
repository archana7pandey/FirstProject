package javaPrograms;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20;
		int b=0;
		
		//Arthemetic Exceptions
		try
		{
		int result=a/b;
		System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("handlingException");
		}
		
		System.out.println("hello");
		System.out.println("World");
		System.out.println("Selenium");
		
		//Null Pointer Exception
		
		String s=null;
		try
		{
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			String a1="Selenium";
			System.out.println(a1.length());
		}
        String s1="substring test monday";
		System.out.println(s1.substring(3, 15));
		
		//Number Format Exception
		
		String s2="selenium";
		try
		{
		double a2=Integer.parseInt(s2);
		}
		catch(NumberFormatException n)
		{
			System.out.println("exceptioncode");
		}
		System.out.println("test");
		//System.out.println(a2);
		

	
		
		
	}

}
