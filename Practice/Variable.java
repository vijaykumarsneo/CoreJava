/******************************************************************************
 Variable : 	Varying values
				Its value can be changed in the java code.
				What values can be changed in the variable?
				Constants - int, real, String, char, boolean.
				Memory in the RAM
				It can store values in the memory.
				Variable will have one name variable i.e, identifier
				We can declare a variable & initialize with constants or values.
*******************************************************************************/

package Practice;
public class Variable
{
	public static void main(String args[])
	{
		int age=21;	//variable declaration and initialization ==> datatype variablename = literal;
		
		int doorNumber;	//variable declaration ==> datatype variablename;
		
		doorNumber=101;	//assignment statement
		
		doorNumber=105;	//assignment statement
		
		System.out.println("Age :"+age); //21
		System.out.println("Door Number :"+doorNumber); //105
	}
}


/*
int is a data type, 
age is an integer variable,
name of the variable is age, 
the value stored in age variable is 21,
at any piont of time a variable can have only one value

Types of variables:

local
class
static
no-static
premitive
derived/reference
arguments
*/

