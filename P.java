// prime number program:
// import java.util.Scanner;
// public class P{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your number: ");
//         int n = sc.nextInt();
//         int temp = 0;
//         for(int i = 2; i<n; i++){
//             if(n%i == 0){
//                 temp++;
//             }
//         }
//         if(temp == 0){
//             System.out.println("the given number is a prime number ");
//         }
//         else{
//             System.out.println("not a prime number , try another number ");
//         }
//     }
// }

// fabonacci series program:

// public class P{
//     public static void main(String[] args){
//         int a = 0,b =1;
//         System.out.print(a + " " + b );
//         int c;
//         for(int i = 1; i<=10; i++){
//             c = a+b;
//             System.out.print(" " + c);
//             a = b;
//             b = c;
//         }
//     }
// }



// swipe two number program:

// public class P{
//     public static void main(String[] args){
//         int a = 5 , b = 8;
//         int t;
//         t = a;
//         a = b;
//         b = t;
//         System.out.println(" a is:" + a);
//         System.out.println(" b is:" + b);
//     }
// }

import java.util.Scanner;
// public class P{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the value of a: ");
//         int a = sc.nextInt();
//         System.out.println("enter the value of b: ");
//         int b = sc.nextInt();
//         System.out.println(" before swapping the value of a is "+ " " + a + " " + " and the value of b is "+ " "+ b);
//         a = a + b;
//         b = a - b;
//         a = a - b;
//         System.out.println(" after swapping the value of a is "+ " "+ a + " "+ " and the value of b is "+ " "+ b);
//     }
// }



// program for palindrome number

// public class P{
//     public static void main(String[] args){
//         int n = 454 , r , s = 0;
//         int t = n;
//         while (n>0){
//             r = n % 10;
//             n = n / 10;
//             s = s* 10 + r;
//         }
//         if (t == s){
//             System.out.println("this is a palindrome number ");
//         }else{
//             System.out.println("try another number , this is not a palindrome number ");
//         }
//     }
// }


// public class P{
//     public static void main(String[] args){
//         int n = 45 , r , s = 0;
//         int t = n ;
//         while( n > 0){
//             r = n % 10;
//             n = n / 10 ;
//             s = s * 10 + r;
//         }
//         if(t == s){
//             System.out.println("this is a palindrome number ");
//         }else{
//             System.out.println("not a palindrome number ");
//         }
//     }
// }



// leap year program :
// public class P{
//     public static void main(String[] args){
//         int year = 2020;
//         if ( (year % 400 == 0 ) || ( year % 4 == 0 && year % 100 != 0 )){
//             System.out.println("leap year ");
//         }else{
//             System.out.println("not a leap year ");
//         }
//     }
// }




// add three program through method:

// prime number program:
// public class P{
//     public static int primeNumber( int n){                                         // 1st method
//         int temp = 0;
//         for( int i = 2; i < n ; i++ ){
//             if( n % i == 0){
//                 temp++;
//             }         
//         }
//         if(temp == 0 ){
//             System.out.println("prime number ");
//         }else{
//             System.out.println("not a prime number ");
//         }
//     return n ;
//     }

//     public static int palindrome( int a ){                                          // 2nd method
//         int r , s = 0;
//         int t = a;
//         while( a > 0){
//             r = a % 10 ;
//             a = a / 10 ;
//             s = s * 10 + r ;
//         }
//         if( t == s ){
//             System.out.println("palindrome number ");
//         }else{
//             System.out.println("not a palindrome number ");
//         }
//     return a ;
//     }

//     public static void main(String[] args ){
//         // P myObj1 = new P();
//         // myObj1.primeNumber(17);
//         // myObj1.palindrome(12121);
//         primeNumber(87);
//         palindrome(43);
//         swapNumber(5,7);
       
//     }

//     public static int swapNumber(int x , int y ){                                   // 3rd method
//         x = x + y;
//         y = x - y;
//         x = x - y;
//         System.out.println("x is:" + x + " and y is: "+ y);
//         return y ;
//     }
      
// }







// prime number program:
// class P{
//     public static void main(String[] args ){
//         int n = 41;
//         int temp = 0 ;
//         for(int i = 2; i<n ; i++){
//             if( n % i==0 ){
//                 temp++;
//             }
//         }
//         if(temp == 0){
//             System.out.println("prime number ");
//         }else{
//             System.out.println("not a prime number ");
//         }
//     }
// }





// fibonacci series program:
// class P {
//     public static void main(String[] args){
//         int a = 0 , b = 1;
//         System.out.print(a + " " + b );
//         int c = 0;
//         for( int i = 1; i < 7 ; i++){
//             c = a + b;
//             System.out.print(" " + c );
//             a = b;
//             b = c;
//         }
//     }
// }

// class P{
//     public static void main(String[] args){
//         int a = 0, b = 1;
//         System.out.print(a + " " + b );
//         int c = 0;
//         for(int i = 0; i < 7; i++){
//             c = a + b;
//             System.out.print(" " + c );
//             a = b;
//             b = c;
//         }
//     }
// }

// class P{                                                            // palindrome number program 
//     public static void main(String[] args){
//         int n = 45454 , r , s = 0;
//         int t = n;
//         while(n>0){
//             r = n % 10;
//             n = n / 10;
//             s = s * 10 + r;

//         }
//         if( t == s){
//             System.out.println("palindrome number ");
//         }else{
//             System.out.println("not a palindrome number ");
//         }
//     }
// }



// public class P{                                                                        // factorial program:
//     public static void main(String[] args){
//         int num = 5;
//         int fact = 1;
//         for(int i =1; i<6; i++){
//             fact = fact * i;
//         }
//         System.out.println("factorial of "+ num + " is " + fact );
//     }  
// }






// public class P{                                                                     // prime number program:
//     public static void main(String[] args){
//         int num = 115;
//         int temp = 0;
//         for(int i = 2; i<num; i++){
//             if(num % i == 0 ){
//                 temp++;
//             }
//         }
//         if(temp == 0){
//             System.out.println("this is a prime number ");
//         }else{
//             System.out.println("not a prime number ");
//         }
//     }
// }



// public class P{                                                             // swapping two number:
//     public static void main(String[] args){
//         int a = 5;
//         int b = 4;
//         a = a + b;
//         b = a - b;
//         a = a - b;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }



// public class P{                                                         // factorial number:
//     public static void main(String[] args){
//         int fact = 1;
//         for(int i = 1; i <= 5; i++){
//             fact = fact * i;
//         }
//         System.out.println(fact);
//     }
// }




// public class P{
//     public static void main(String[] args ){
//         int a = 0 , b = 1;
//         System.out.print(a + " "+ b );
//         int c;
//         for(int i = 1; i < 6; i++){
//             c = a + b;
//             System.out.print( " " + c );
//             a = c;
//             b 
            
//         }
//     }
// }






import java.util.Scanner;
public class P
{
   public static void main(String args[])
   {   
   int i=1;
        Scanner s = new Scanner(System.in);
        while(i==1)
        {
            System.out.println("");
            System.out.println("Enter the two numbers to perform operations ");
            System.out.print("Enter the first number : ");
            int x = s.nextInt();
            System.out.print("Enter the second number : ");
            int y = s.nextInt();
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 1 for ADDITION");
            System.out.println("Choose 2 for SUBTRACTION");
            System.out.println("Choose 3 for MULTIPLICATION");
            System.out.println("Choose 4 for DIVISION");
            System.out.println("Choose 5 for MODULUS");
            System.out.println("Choose 6 for EXIT");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                int add;
                add = x + y;
                System.out.println("Result : "+add);
                break;
 
                case 2:
                int sub;
                sub = x - y;
                System.out.println("Result : "+sub);
                break;
 
                case 3:
                int mul;
                mul = x * y;
                System.out.println("Result : "+mul);
                break;
 
                case 4:
                float div;
                div = (float) x / y;
                System.out.print("Result : "+div);
                break;
 
                case 5:
                int mod;               
                mod = x % y;
                System.out.println("Result : "+mod);
                break;
 
                case 6:
                System.exit(0);
            }
	     System.out.println(" Do you want to continue press 1 for yes,0 for no");
            i = s.nextInt();
        }
		
    }
}

