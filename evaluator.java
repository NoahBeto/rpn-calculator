import java.util.*; //package
/**
* Name: Noah Betoshana
* Evaluator
* This program takes the data from the tester program and inputs the data into the methods in the evaluator program.
*/
public class Project2Evaluator { //class
  private static int result; //instance variable
  private Stack<Integer> stack; //stack
  public Project2Evaluator() { //constructor
    stack = new Stack<Integer>(); //initializing stack
  } //end of constructor
  public int evaluateSingleOperator(String operation) { //method
	  int op1 = 0, op2 = 0; //variables
      switch (operation) { //switch statement
      case "p":
    	System.out.println(stack.peek()); //outputs top of stack
        break;
      case "n":
        System.out.println(stack.peek()); //outputs top of stack
        op2 = stack.pop(); //removes top of stack
        break;
      case "d":
    	stack.push(stack.peek()); //duplicates top of stack
        break;
      case "r":
      	op1 = stack.pop(); //pops top of stack, but stores value in op1
      	op2 = stack.pop(); //pops top of stack, but stores value in op2
        stack.push(op1); //outputs value stored in op1
        stack.push(op2); //outputs value stored in op2
        break;
      case "f":
        System.out.println(stack); //outputs all the contents in the stack
        break;
      case "c":
        stack.clear(); //clears all the contents in the stack
        break;
      case "+":
    	op1 = stack.pop(); //pops top of stack, but stores value in op1
    	op2 = stack.pop(); //pops top of stack, but stores value in op2
        result = op2 + op1; //takes the values in op2 and op1 and adds them, the value is stored in the variable result
        stack.push(result); //pushes the variable result into the stack
        break;
      case "-":
    	op1 = stack.pop(); //pops top of stack, but stores value in op1
      	op2 = stack.pop(); //pops top of stack, but stores value in op2
      	result = op2 - op1; //takes the values in op2 and op1 and subtracts them, the value is stored in the variable result
        stack.push(result); //pushes the variable result into the stack
        break;
      case "*":
      	op1 = stack.pop(); //pops top of stack, but stores value in op1
      	op2 = stack.pop(); //pops top of stack, but stores value in op2
      	result = op2 * op1; //takes the values in op2 and op1 and multiplies them, the value is stored in the variable result
        stack.push(result); //pushes the variable result into the stack
        break;
      case "/":
      	op1 = stack.pop(); //pops top of stack, but stores value in op1
      	op2 = stack.pop(); //pops top of stack, but stores value in op2
      	result = op2 / op1; //takes the values in op2 and op1 and divides them, the value is stored in the variable result
        stack.push(result); //pushes the variable result into the stack
        break;
      case "%":
      	op1 = stack.pop(); //pops top of stack, but stores value in op1
      	op2 = stack.pop(); //pops top of stack, but stores value in op2
      	result = op2 % op1; //takes the values in op2 and op1 and performs modulo, the value is stored in the variable result
        stack.push(result); //pushes the variable result into the stack
        break;
      case "m":
    	op2 = stack.pop(); //pops top of stack, but stores value in op2
    	result = op2 * -1; //takes the value in op2, multiplies it by -1, and stores it in the variable result
    	stack.push(result); //pushes the variable result into the stack
        break;
      case "q":
    	break;
      case "h":
    	System.out.println("Press p to print top of stack, n to print top of stack and remove, d to duplicate top of stack, r to exchange top two items, f to print contents of stack, c to clear stack, + to add, - to subtract, * to multiply, / to integer divide, % to integer remainder, m to unary minus, q to quit, h to help message");
        break;
    }
    System.out.println(stack);
    return result;
  }
  public int evaluate(String expr) { //method
    String token; //variable that will be used to see if the user inputed an operator that is applicable
    Scanner parser = new Scanner(expr); //scanner
    while (parser.hasNext()) {
      token = parser.next();
      if (isOperator(token)) { //puts operators in here
    	  evaluateSingleOperator(token); //puts the token through the evaluateSingleOperator method
      }
      else
        stack.push(Integer.parseInt(token)); //puts integers in the stack
    }
    return result;
  }
  public boolean isOperator(String token) { //method that holds all the applicable operators
    return (token.equals("p") || token.equals("n") || token.equals("d") || token.equals("r") || token.equals("f") || token.equals("c") || token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("%") || token.equals("m") || token.equals("q") || token.equals("h"));
  }
} //end of class
