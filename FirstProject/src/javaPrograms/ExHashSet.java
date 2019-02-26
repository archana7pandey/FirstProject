package javaPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class ExHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hset= new HashSet();
		hset.add("test");
		hset.add(123);
		hset.add(null);
		hset.add(55.22);
		System.out.println("Elements of the Set are : " +hset);
		
		Iterator  itr= hset.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("Elements of the Hashset are : " +itr.next());
		}
		
	}

}
