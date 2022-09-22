package string;

public class StrBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Creating StringBuilder");
		StringBuilder sb1= new StringBuilder("Welcome to");
		sb1.append(" java");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(0, "Laptop "));

		System.out.println(sb1.reverse());

	}

}
