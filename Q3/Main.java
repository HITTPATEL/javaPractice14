package day14.Q3;


// Example of final keyword
final class Main {
	final String nameString="Hittu";
	final void printName() {
		System.out.println("Name is "+ nameString);
	}
	
	public static void main(String[] args) {
//		Example of try catch and finally
		try {
			System.out.println(100/10);
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			System.out.println("Program closed");
		}
	}

}
//Q3) Explain Finally and Final Keyword with an Example?
//Answer 3
//     Finally :- Finally keyword is used to irrespective of try and catch block,if we want to execute some code
//          then we can use finally block.If error come as StackOverFlowError,VirtualMachineError,OutOfMemoryError
//          then finally block will not execute.And we can also stop finally block to execute by writing System.exit(1)
//         in try block.If in our code try block is executing then finally will also be execute and if catch block is 
//      is executing then also finally be executed.


//Final :-Final is a type of Access Modifier. We can use final keyword at three places.
//  (i). We can apply final keyword before any variable. After applying final keyword to any variable we can't 
//        change that variable.
//  (ii). We can also apply final keyword before any class. After applying final keyword before any class we cant 
//   inherit or extend that class.
//   (iii). We can apply final keyword before any method. After applying final keyword to any method we can't 
//change that method.
  