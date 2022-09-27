//Initialization of object through reference.
package Practice;
public class ReferenceObject{
	int id;
	String name;
	public static void main(String[] args){
		ReferenceObject s1 = new ReferenceObject();
		s1.id = 101;
		s1.name = "Vijay";
		System.out.println(s1.id+" "+s1.name);
	}
}