package innerclasses;

abstract class AnonymousInnerClass {
	   public abstract void display();
	}


public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerClass any = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      any.display();


	}

}
