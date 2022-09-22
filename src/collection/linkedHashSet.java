package collection;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class linkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();  
		lhs.add("Ravi");  
		lhs.add("Vijay");  
		lhs.add("Ravi");  
		lhs.add("Ajay"); 
		
		
		
		
		Iterator<String> itr=lhs.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
	}

}
