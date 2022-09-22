package mypackage;

class EmpDetails {
	String name;
	int age;
	String address;
	String designation;
	double salary;
	
	EmpDetails(String name,int age, String address, String designation, double salary){
		this.name = name;
		this.age = age;
		this.address = address;
		this.designation = designation;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(name + " , " +  age + " , " + address + " , " + designation + " , " + salary);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDetails emp = new EmpDetails("Himanshu",23,"Bhopal","Student",50000);
		emp.display();


	}

}
