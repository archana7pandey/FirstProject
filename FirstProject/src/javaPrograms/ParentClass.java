package javaPrograms;

public class ParentClass {
public int xx=50;
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass obj= new ParentClass();
		System.out.println("Result in Parentclass is : "+obj.add(10, 20));
		
	
		
	}

}
