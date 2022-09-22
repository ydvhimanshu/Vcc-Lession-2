package mypackage;

public class MethodOverloading {
	public double AreaofTraingle(int base, int height) {
		double result = 0.5 * base * height;
		return result;
	}
	
	public double AreaofCircle(int radius) {
		double result = 3.14 * radius * radius;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading overloading = new MethodOverloading();
		
		double AOT = overloading.AreaofTraingle(6, 4);
		System.out.println("Using MethodOverloding Area of Traingle is: " + AOT +"\n");
		
		double AOC = overloading.AreaofCircle(5);
		System.out.println("Using MehodOverloading Area of Circle is: " + AOC );
		

	}

}
