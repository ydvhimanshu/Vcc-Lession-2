package mypackage;

public class SimpleMethod {
	int Addition(int a, int b) {
	int c = a + b;
	return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleMethod obj = new SimpleMethod();
		//System.out.println(obj.Addition(45, 450));
		int result = obj.Addition(34, 340);
		System.out.println("Addition of Two Numbers Result is: " + result);

	}

}
