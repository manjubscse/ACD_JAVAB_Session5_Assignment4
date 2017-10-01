//Included the Class in myPack package
package myPack;
// Declared the variable stack which implements the interface
public class VariableStack implements StackInterface {
	 private int stk[ ]; // Declared the array of type integer
     private int tos;   // Declared the variable type of integer

     //Constructor of class Variable stack
     VariableStack(int size)
     {
             stk=new int[size]; // array is initialized with required size
             tos=-1; // set stack pointer to -1
     }
     // Defining the push method
     public void push(int item)
     {
    	 	// check if stack pointer reached the stack length or not
             if(tos==stk.length-1)
             {
            	 // if Stack pointer reached end display below message
//                     System.out.println("Stack Overflows.");
                     int t[ ]=new int[stk.length * 2];// defines the new stack with double size 
                     for(int i=0;i<stk.length;i++) // pushes all the records new stack
                             t[i]=stk[i];
                     stk=t; // reassign to old stack
                     stk[++tos]=item; // push the new record
             }
             else
                     stk[++tos]=item; // push the new record
     }
     // defining the pop function
     public int pop()
     {		// if Stack pointer goes below 0  then show below message	
             if(tos<0)
             {
                     System.out.println("Stack Underflows.");
                     return 0;
             }
             // other wise pop the value from stack
             else
                     return stk[tos--];
     }
}
