package string;

public class StrBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
		//insert method
		sb.insert(0, 'w');
		System.out.println(sb);

		//replace method
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.replace(0, 3, "Eww");
		System.out.println(sb1);

		//delete method
		sb1.delete(0, 1);
		System.out.println(sb1);


	}

}
