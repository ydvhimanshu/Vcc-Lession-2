package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();  
		set.add("Himanshu");  
		set.add("Shefali");  
		set.add("Ritu");  
		set.add("Gagan");  
		
		//set.clear(); [clear all the element in set]
		
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}

	}

}
