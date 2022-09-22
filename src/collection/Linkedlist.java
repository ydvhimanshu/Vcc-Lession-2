package collection;

import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();  
		ll.add("Ravi");  
		ll.add("Vijay");  
		ll.add("Ravi");  
		ll.add("Ajay"); 
		ll.add("Ajay");
		ll.add("Ajay");
		ll.add("Ajay"); //allow duplicate element
		
		ll.addFirst("Himashu"); //add first position
		ll.addLast("Swati"); //add last position
		
		
		Iterator<String> itr=ll.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
