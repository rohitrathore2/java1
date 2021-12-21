// Fibonacci series program:

// class Code{
//     public static void main(String[] args){
//         int a = 0 ,b = 1;
//         System.out.print(a + " "+ b);
//         int c;
//         for(int i =1 ; i<=5; i++){
//             c = a+b;
//             System.out.print( " " + c);
//             a = b;
//             b = c;
//         }
//     }
// }

// class Code{
//     public static void main(String[] args){
//         int a =0,b=1;
//         System.out.print(a + " " + b );
//         int c;
//         for(int i =1; i<6; i++){
//             c = a + b;
//             System.out.print(" " + c);
//             a = b;
//             b = c;
//         }
//     }
// }

// class Code{
//     public static void main(String[] args){
//         int a = 0, b =1;
//         System.out.print(a + " " + b);
//         int c;
//         for(int i =1; i <=5; i++){
//             c = a + b;
//             System.out.print(" " + c);
//             a = b;
//             b = c; 
//         }
//     }
// }


// palindrome number program:
// public class Code{
//     public static void main(String[] args){
//         int n = 121 , r , s = 0;
//         int t = n;
//         while(n>0){
//             r = n % 10;
//             n = n / 10;
//             s = s * 10 + r;
//         }
//         if(t == s){
//             System.out.println("this is a palindrome number ");
//         }else{
//             System.out.println("try another number , this is not a palindrome number ");
//         }
//     }
// }
 

// leap year program :
// class code{
//     public static void main(String[] args){
//         int year = 1904;
//         if( (year % 400 == 0 ) || ( year % 4 == 0 && year % 100 != 0) ){
//             System.out.println("leap year");
//         }else{
//             System.out.println("not a leap year ");
//         }
//     }
// }



// factorial program:
public class Code{
    public static void main(String[] args){
        int num = 5;
        int fact = 1;
        for(int i = 1; i < 6; i++){
            fact = fact * i ;
        }
        System.out.print("factorial of "+ num + " is "+ fact );
    }
}