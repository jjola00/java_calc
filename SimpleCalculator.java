//Using Switch Case
import java.util.Scanner;
 
public class SimpleCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 

        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
 

        System.out.print("Operation? (+, -, *, /): ");
        String operation = sc.next();
        int result = performOperation(firstNumber, secondNumber, operation);
        System.out.println("Your answer is: " + result);
    }
 
    public static int performOperation(int firstNumber, int secondNumber, String operation)
    {
        int result = 0;
        switch (operation) {
            case "+":result = firstNumber + secondNumber;
                //implement addition
                break;
            case "-":result = firstNumber - secondNumber;
                //implement subtraction
                break;
            case "*":result = firstNumber * secondNumber;
                //implement multiplication
                break;
            case "/":result = firstNumber / secondNumber;
                //implement division
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        return result;
    }
}