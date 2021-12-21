import java.util.Scanner; 
// for loop 
// class Loop {
//     public static void main(String args[]) {
//         for (int i =0; i<11; i = i+1){
//             System.out.println(i);
//         }
//    }
// }


// class Loop{
//     public static void main(String[] args) {
//         for (int i = 0; i<11; i++){
//             System.out.print(i);
//         }
//     }
// }


// while loop
// class Loop{
//     public static void main(String[] args){
//         int i = 0;
//         while(i<11){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// print the sum of first n natural number when n = 4 ?
// class Loop {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int sum = 0;
//         for(int i =1; i<=n; i++){
//             sum = sum + i;
//         }
//         System.out.println(sum);
//     }
// }

// print the table of a number input by the user:
// class Loop{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number: ");
//         int n = sc.nextInt();

//         for(int i =1; i<11; i++){
//             System.out.println(n*i);
//         }
      

//     }
// }


// prime number program
class Loop{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number: ");
        int n = sc.nextInt();
        
        for(int i = 2; i<=n; i++){
            if (n%i==0);
            System.out.println("not a prime number");
        break;
        }
        System.out.println("prime");

       
    }
        
}
