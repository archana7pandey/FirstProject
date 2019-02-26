package javaPrograms;

public class StringMethods {

	public static void main(String[] args) {
	
		//string methods //
    String s1="automation";		
    String s2="AUTOMATION";	
    String s3="AUtomation";	
    String s4="Automation123 ";	
  
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareTo(s3));
		
    System.out.println(s1.compareTo(s4));	
    
    System.out.println(s1.equals(s3));
    System.out.println(s1.concat(s4));
    
    System.out.println(s1.charAt(4));	
    System.out.println(s1.compareToIgnoreCase(s4));
    System.out.println(s1.equalsIgnoreCase(s3));
    System.out.println(s1.toUpperCase());
    System.out.println(s2.toLowerCase());
    System.out.println(s4.trim());
    System.out.println(s4.substring(2));
    System.out.println(s2.endsWith("N"));
    System.out.println(s2.length());
    
  //math methods //
    int i1 =5;
    int i2=6;
    int i3=6;
    double d=1.245;
    float f=1.245f;
    long l=124332453;
    
    System.out.println(i1==i2);
    
    System.out.println(i2==i3);
    System.out.println(Math.abs(d));
    System.out.println(Math.round(d));
    System.out.println(Math.round(f));
    System.out.println(Math.round(l));
    System.out.println(Math.random()); 
    System.out.println(Math.min(i1, i2));
    System.out.println(Math.max(i1, i2));
    //character methods //
    char c1='A';
    char c2='1';
    char c3='a';
    
    
    System.out.println(Character.isLetter(c1));
    System.out.println(Character.isLetter(c2));
    System.out.println(Character.isDigit(c1));
    System.out.println(Character.isDigit(c2));
    
    System.out.println(Character.isUpperCase(c3));
    System.out.println(Character.isLowerCase(c1));
    System.out.println(Character.isUpperCase(c1));
    System.out.println(Character.isLowerCase(c3));
    
    //Array//
    
    int [] a1={1,2,3,4,5,6,7,8,9,0};
    
    System.out.println(a1.length);
    
	}

}
