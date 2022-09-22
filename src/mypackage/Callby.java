package mypackage;

public class Callby {
	int value = 200;
	
	int Operation(int value) {
		value = value*5/100;
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callby obj = new Callby();
		System.out.println("CallBy Value Result: " + obj.value);
		int opr = obj.Operation(400);
		System.out.println("Method Opeartion Value Result: " + opr);

	}

}
