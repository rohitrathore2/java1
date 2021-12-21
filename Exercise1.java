                                            //1.	Write a program to Calculate Area of a Circle.

// import java.util.Scanner;
// public class Exercise1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of radius of a circle: ");
//         int r = sc.nextInt();
//         float pi = 3.14f;
//         float area ;
//         area = ( pi * ( r * r));
//         System.out.println("Area of Circle is: " + area );
//     }
// }




                                                            //  2.	Write a program to Calculate Perimeter of a Circle
    
// import java.util.Scanner;
// public class Exercise1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of radius: ");
//         int r = sc.nextInt();
//         float pi = 3.14f;
//         float perimeter;
//         perimeter = ( 2 * (pi * r));
//         System.out.println("perimeter of a Circle is: " + perimeter);
//     }
// }




                                              //   3.	Write a program to check whether a given number is Even or Odd.
// import java.util.Scanner;
// public class Exercise1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int num = sc.nextInt();
//         if(num % 2 == 0 ){
//             System.out.println(num + "  is an Even number ");
//         }else{
//             System.out.println(num + "  is an Odd number ");
//         }
//     }
// }




                                  // 5.	Write a program to swap two numbers.5.	Write a program to swap two numbers.
import java.util.Scanner;
public class Exercise1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Before swapping, first number is "+ num1 + " and second number is " + num2 );
        System.out.println(" ");
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping, first number is "+ num1 + " and second number is " + num2 );
    }
}