package collection;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		//add method
		list.add(34);
		list.add(344);
		list.add(32);
		list.add(344);
		list.add(32);
		System.out.println(list);
		
		//remove method
		list.remove(4);
		System.out.println(list);
		
		//get method 
		System.out.println(list.get(2));
		
		//add element at index position in list
		list.add(2, 56);
		System.out.println(list);

	}

}
