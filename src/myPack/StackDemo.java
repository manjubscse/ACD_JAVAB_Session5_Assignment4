//Included the class in the package called myPack
package myPack;
// Declaring the public class Stack Demo
public class StackDemo {
	// main method defined for the class StackDemo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initializing the Fixed Stack Class
		FixedStack fs=new FixedStack(3);
		//Initializing the variable stack
		VariableStack vs=new VariableStack(5);
		//Initializing the Interface
		StackInterface mystk;
		// Pushing the Records to Fixed Stack 
		// Pushing more than stack Size show stack overflows
		for(int i=0;i<4;i++)
			fs.push(i);//Pushing records to Stack
			System.out.println("Fixed length Stack Contents are.");
			for(int i=0;i<4;i++)
				System.out.println(fs.pop());// Popping records from Stack
		//Pushing records into Variable Stack
		for(int i=0;i<7;i++)
				vs.push(i);//Pushing records to Stack
			System.out.println("Dynamic length Stack Contents are");
			for(int i=0;i<7;i++)
				System.out.println(vs.pop());// Popping records from Stack
		// Push and pop method using the Interface to Fixed Stack 
		mystk=fs;
		for(int i=0;i<3;i++)
			mystk.push(i);//Pushing records to Stack
		System.out.println("Fixed length Stack Contents using interface reference");
		for(int i=0;i<3;i++)
			System.out.println(mystk.pop());// Popping records from Stack
		// Push and pop method using the Interface to Variable Stack 
		mystk=vs;
		for(int i=0;i<7;i++)
		mystk.push(i); //Pushing records to Stack
		System.out.println("Dynamic length Stack Contents using interface reference");
		for(int i=0;i<7;i++)
			System.out.println(mystk.pop()); // Popping records from Stack
	
	}

}
