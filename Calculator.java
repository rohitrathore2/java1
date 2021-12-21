import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the calculator \nenter two number for performing ");
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("select operation (+,-,*,/)");
        String operation = sc.next();
        int result;
        switch(operation){
            case "+":
            result = num1 + num2;
            System.out.println("Addition is "+result );
            break;

            case "-":
            result = num1 - num2;
            System.out.println("Substraction is "+result );
            break;

            case "*":
            result = num1 * num2;
            System.out.println("Multiplication is "+result );
            break;

            case "/":
            result = num1 / num2;
            System.out.println("Division is "+result );
            break;

            default:
            System.out.println("Invalid operation ");
            break;
        }

    }
}