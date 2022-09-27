//Initialization of object through method.
package Practice;
public class MethodObject{
	int id;
	String name;
	void insertRecord(int r, String n){
		id = r;
		name = n;
	}
	void displayInformation(){
		System.out.println(id+" "+name);
	}
	public static void main(String[] args){
		MethodObject s1 = new MethodObject();
		MethodObject s2 = new MethodObject();
		/*creating multiple objects by one type only
		 *MethodObject s1 = new MethodObject(), s2 = new MethodObject();
		 */
		s1.insertRecord(124, "Vijay");
		s2.insertRecord(125, "Kumar");
		s1.displayInformation();
		s2.displayInformation();
	}
}