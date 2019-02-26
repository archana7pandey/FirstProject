package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExMap {

	public static void main(String[] args) 
 {
	
		Map<Integer,String> hMap= new HashMap<Integer,String> ();
		
		hMap.put(1,"james");
		hMap.put(2,"John");
		hMap.put(3,"james");
		System.out.println(hMap.size());
		Set<Integer> set=hMap.keySet();
		
		for(Integer KeyValue : set)
		{
			System.out.println("Map key Values : " + KeyValue);
			System.out.println("value associated with the key : " +hMap.get(KeyValue));
		}
		
 }
 
 
}
