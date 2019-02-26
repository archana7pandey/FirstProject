package javaPrograms;

public class Child2 extends Child1{

	public int multiply(int i,int j)
	{
		int k=i*j;		
		return k;
	}
	
	
	   //Method Overloading concept///////////////////////////////////
		  //we can write method with same name (sum) with different parameter is called method Overloading/// 
		public int sum(int a,int b,int c)
		{
			int d=a+b+c;
			return d;
		}
		public int sum(int a,int b,int e,int f)
		{
			int g=a+b+e+f;
			return g;
		}

		public int sum(int a,int b)
		{
			int d=a+b;
			return d;
		}
		
		//Method Overriding//////////////////////////////////////////
		// substract method is same in home class (Child2) and in parent class (child1) than priority will be given to select home class methods
		
		public int substract(int x,int y)
		{
			int z=1;
			return z;
			
		}
		
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//inheritance Concept///////////////////////////////////////////
		
		Child2 obj2=new Child2();
		
		System.out.println("Value of parent class variable xx in Child2 is : "+obj2.xx);
		System.out.println("Result from add method of Parent Class is : "+obj2.add(20, 40));
		System.out.println("Result from substract method of Child1 Class is : "+obj2.substract(50, 25));
		System.out.println("Result from multiply method of Child2 Class is : "+obj2.multiply(10, 20));
		
		System.out.println("Result from sum method of Child2 Class with 3 variables is : "+obj2.sum(10, 20, 30));
		System.out.println("Result from sum method of Child2 Class with 4 variables is : "+obj2.sum(10, 20, 30,40));
		System.out.println("Result from sum method of Child2 Class with 2 variables is : "+obj2.sum(10, 20));
		System.out.println("Value of variable z is : "+obj2.substract(10, 20));
		
	}
	
	
	
}
