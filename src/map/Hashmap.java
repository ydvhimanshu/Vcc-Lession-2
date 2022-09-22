package map;

import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Icecream");  //Put elements in Map  
		   map.put(2,"Pizza");    
		   map.put(3,"Dosa");   
		   map.put(4,"chinese");   
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry<Integer,String> m : map.entrySet()){    
		    System.out.println(m.getKey()+" ---> "+m.getValue());
		   }
		   

	}
}
