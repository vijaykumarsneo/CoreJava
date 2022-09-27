//Initialization of object through constructor.
package Practice;
public class ConstructorObject{
	int id;
	String name;
	ConstructorObject(int r, String n){
		id = r;
		name = n;
	}
	void displayInformation(){
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		ConstructorObject s1 = new ConstructorObject(124, "Vijay");
		ConstructorObject s2 = new ConstructorObject(125, "Kumar");
		s1.displayInformation();
		s2.displayInformation();
	}
}