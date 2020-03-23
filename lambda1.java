// Java program to demonstrate lambda expressions 
// to implement a user defined functional interface. 
  
// A sample functional interface (An interface with 
// single abstract method 
interface FuncInterface 
{ 
    // An abstract function 
    void abstractFun(); 
  
    // A non-abstract (or default) function 
    /*default void normalFun() 
    { 
       System.out.println("Hello"); 
    }*/
} 
  
class lambda1
{ 
    public static void main(String args[]) 
    { 
        // lambda expression to implement above 
        // functional interface. This interface 
        // by default implements abstractFun() 
        FuncInterface fobj = ()->System.out.println("hi rohith"); 
  
        // This calls above lambda expression and prints 10. 
        fobj.abstractFun(); 
    } 
} 