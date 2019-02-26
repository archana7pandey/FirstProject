package javaPrograms;

public abstract class AbstractClass {

	public abstract void login();
	public abstract void compose();
	public abstract int search();
	public abstract void delete();
	
	public void method1()
	{
		System.out.println("Concrete Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	/*An abstract method in an abstract class does not have an implementation in the abstract class definition.
	(Your .java file). It must be implemented in the concrete class which extends your abstract class. ...
	So an abstract class helps to make some default implementations for all classes which extends this class.
	*/
	
}
