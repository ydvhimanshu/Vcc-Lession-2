package collection;

import java.util.TreeSet;
import java.util.Iterator;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		set.add("himanshu");
		set.add("himanshu");
		set.add("himanshu"); //duplicate not allowed its print only once
		
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
