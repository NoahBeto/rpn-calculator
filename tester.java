import java.util.*; //package
/**
* Name: Noah Betoshana
* Tester
* This program asks the user to enter a valid RPN expression. The program will then take the data and put it through different methods before outputting something in the console.
*/
public class Project2Tester {
  public static void main(String[] args) {
    String expression; //variable where user input will be stored
    Scanner scan = new Scanner(System.in); //scanner
    Project2Evaluator evaluator = new Project2Evaluator(); //object
      System.out.println("Enter a valid rpn expression by typing one token at a time with a space between each token (e.g. 5 4 + 3 2 1 - + * p)");
      System.out.println("Each token must be an integer or an operator (+,-,*,/)");
      System.out.println("Press h if you need to know what tokens are applicable");
      System.out.println("It is recommended that you type an integer");
    while(true) { //while loop that allows for the user input to continue after initial input
      expression = scan.nextLine(); //takes user input through scanner
      if(expression.equals("q")) {
  		break; //terminates the program
      } //end of if statement
      evaluator.evaluate(expression); //through the object, the user input in variable expression is put through the evaluate method
    } //end of while loop
  } //end of main method
} //end of class
