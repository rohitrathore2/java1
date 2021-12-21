import java.util.Scanner;
// solid rectangle program:

// public class Pattern{
//     public static void main(String[] args){
//         for (int i =1; i<5; i++){
//             // /System.out.println("*");
            
//             for (int j =1; j<6; j++){
//                 System.out.print("*") ;
//             }
//             System.out.println();
            
//         }
       
//     }
// }


// hollow rectangle program:

// class Pattern{
//     public static void main(String[] args){
//         int x = 5;
//         int y = 4;
//         for (int i=1; i<6; i++){
//             for (int j = 1; j<5; j++){
//                 if (i==1||j==1 || i==x||j==y){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println(" ");
//         }


//     }
// }


// half pyramid program:

// class Pattern{
//     public static void main(String[] args ){
//         int n = 4;
//         for (int i = 1; i<=n; i++){
//             for (int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }



// half pyramid program:
// class Pattern{
//     public static void main(String[] args){
//         int n = 4;
//         for (int i = 1; i<=n; i++){
//             for (int j= 1; j<=i; j++){
//                 System.out.print("*");
            
//             }
//             System.out.println(" ");
//         }

//     }
// }


// invert of pyramid:

// class Pattern{
//     public static void main(String[] args){
//         int n = 4;
//         for (int i=n; i>=1; i--){
//             for (int j=1; j<=i; j++){
//                 System.out.print("*");

//             }
//             System.out.println(" ");
//         }
//     }
// }


// class Pattern{
//     public static void main(String[] args){
//         int n =4;
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                  System.out.print("*"); 
//             }
//           System.out.println(" ");   
//         }
       
//     }
// }



//inverted and rotated hald pyramid
// class Pattern{
//     public static void main(String[] args){
//         int n = 4;
//         //outer for loop
//         for(int i=1; i<=n; i++){

//             // inner for loop --> print space
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             // inner for loop --> print star
//             for (int j=1; j<=i; j++){
//                 System.out.print("*");
//             }

//             System.out.println("");

//         }
       
//     }
// }



// half pyramid with number program:

// class Pattern{
//     public static void main(String[] args ){
//         int n = 4;
//         for (int i = 1; i<=n; i++){
//             for (int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println(" ");
//         }
//     }
// }


// class Pattern{
//     public static void main(String[] args ){
//         int n =5;
//         for(int i =1; i<=n; i++){
//             for(int j =1; j<=i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// inveted half pyramid with number:
// class Pattern{
//     public static void main(String[] args){
//         int n =5;
//        for (int i = 1; i<=n; i++){
//            for (int j =1; j<=n-i+1; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println(" ");
        
//        }
//     }
// }



// floyd's triangle program:
// class Pattern{
//     public static void main(String[] args){
//         int n = 5;
//         int number =1;
//         for (int i =1; i<=n; i++){
//             for(int j =1; j<=i; j++){
//                 System.out.print(number + " "); 
//                 number++;     
//             }
//             System.out.println(" ");
//         }
//     }
// }



// print the pattern 0-1 triangle:
// class Pattern{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i = 1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 int sum = i+j;
//                 if (sum%2==0){
//                     System.out.print("1 ");
//                 }else{
//                     System.out.print("0 ");
//                 }

//             }
//             System.out.println(" ");
            
//         }
//     }
// }




// next pattern lecture:

// butterfly pattern:

// class Pattern{
//     public static void main(String[] args ) {
//         int n =4;

//         //upper half
//         for(int i =1; i<=n; i++){

//             // 1st part
//             for(int j =1; j<=i; j++){
//                 System.out.print("*");
//             }

//             //  space

//             int space = 2*(n-i);
//             for(int j=1; j<=space; j++){
//                 System.out.print(" ");
//             }

//             // 2nd part
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }

//             System.out.println(" ");
//         }

//         // lower half

//         for(int i =n; i>=1; i--){

//             for(int j =1; j<=i; j++){
//                 System.out.print("*");
//             }

//             int space = 2*(n-i);
//             for(int j=1; j<=space; j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }

//             System.out.println(" ");
//         }


//     }
// }


// solid rhombus program:

// class Pattern{
//     public static void main(String[] args ){
//         int n=5;
//         for(int i =1; i<=n; i++){

//             // spaces
//             for(int j =1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             // stars
//             for(int j=1; j<=n; j++){
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }



// number pyramid program:

// class Pattern{
//     public static void main(String[] args){
//         int n = 4;
//         for(int i=1; i<=n; i++){

//             // spaces 
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             // number
//             for(int j=1; j<=i; j++){
//                 System.out.print(i + " ");
//             }

//             System.out.println();
//         }
//     }
// }



// palindromic pyramid

// class Pattern{
//     public static void main(String[] args){
//         int n =4;
//         for(int i =1; i<=n; i++){

//             //space
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             // numbers bckwrd
//             for(int j=i; j>=1; j--){
//                 System.out.print(j);
//             }

//             // numbers frwrd
//             for(int j=1; j<=i;j++){
//                 System.out.print(j);
//             }

//             System.out.println();
           
//         }
//     }
// }



// write a program to print Diamond pattern.

class Pattern{
    public static void main(String[] args){
        int n=4;

        //upper half
        for(int i=1; i<=n; i++){

            // spaces 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //lower half
        for(int i=n; i>=1; i--){

            // spaces 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}