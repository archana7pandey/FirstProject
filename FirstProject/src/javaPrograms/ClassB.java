package javaPrograms;

public class ClassB extends AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Abstraction Concept");
		ClassB obj=new ClassB();
		System.out.println(obj.search());
		
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Login Funcationality");
	
	}

	@Override
	public void compose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int search() {
		// TODO Auto-generated method stub
		System.out.println("Search Funcationality");
		return 0;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
