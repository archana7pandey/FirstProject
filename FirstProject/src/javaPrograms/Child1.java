package javaPrograms;

public class Child1 extends ParentClass {

	public int substract(int x,int y)
	{
		int z=x-y;
		return z;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 obj1=new Child1();
		int res = obj1.add(100, 200);
		
		System.out.println("Result in Child1 is : "+res);
		System.out.println("Value of parent class variable xx in Child1 is : "+obj1.xx);
	}

}
