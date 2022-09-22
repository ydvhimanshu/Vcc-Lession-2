package innerclasses;

public class InnerClasses {
	private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+",\nLet us start learning Inner Classes");}  
	 }  



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClasses obj=new InnerClasses();
		InnerClasses.Inner in=obj.new Inner();  
		in.hello();  

		

	}

}
