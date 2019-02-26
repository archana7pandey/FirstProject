package javaPrograms;

public class FlowControl {

	public static void main(String[] args) {
		
		//FOR LOOP TO PRINT NUMBERS 1 TO 10
		
		for(int i =1;i<=10;i++)
		{
			if(i==5)
			{
				
			System.out.println("value of variable I inside if condition in  for loop :"+ i);
				
			}
		}
		// while loop to print numbers 1 to 10
		int x=1;
		while(x<=10)
		{
			if(x==5)
			{
			System.out.println("value of variable X inside if condition in  while loop :"+x);
			
			}
		
			x++;
		}
			
		// do while loop to print number 1 to 10
		
		int a=1;
		do{
			if(a==5)
			{
			
			System.out.println("value of variable A inside if condition in do while loop :"+a);
					
			}
			a++;
		}
		while(a<=10);
		
		//System.out.println("outside loop");
		
		//Compare two strings by using relational operator (==)
		String s1="hello";
		String s2="World";
		
		System.out.println("Comparing  string s1 and s2 " +s1==s2);
		//System.out.println("Comparing  string s1 and s2 " +s1.equals(s2));
		
	}

}
