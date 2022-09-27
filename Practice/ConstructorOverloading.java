package Practice;

public class ConstructorOverloading {

	int id;
	String name;
	int age;
	ConstructorOverloading(int i, String n)
	{
		id = i;
		name = n;
	}
	ConstructorOverloading(int i, String n, int a)
	{
		id = i;
		name = n;
		age = a;
	}
	void display(){
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) {
		ConstructorOverloading student = new ConstructorOverloading(123, "Vijay");
		ConstructorOverloading newStudent = new ConstructorOverloading(123, "Ajay", 26);
		student.display();
		newStudent.display();
	}

}
