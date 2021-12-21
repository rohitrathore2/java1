// prime number program:

// public class N{
// 	public static void main(String[] args){
// 		int n = 43;
// 		int temp = 0;
// 		for(int i =2; i<n; i++){
// 			if(n%i == 0){
// 				temp = temp +1;
// 			}
// 		}
// 		if(temp == 0){
// 			System.out.println("this is prime number ");
// 		}else{
// 			System.out.println("this is not a prime number ");
// 		}
// 	}
// }


// public class N{
// 	public static void main(String[] args){
// 		int n = 27;
// 		int temp = 0;
// 		for(int i = 2; i < n; i++){
// 			if(n % i == 0){
// 				temp++;
// 			}
// 		}
// 		if(temp == 0){
// 			System.out.println("this is a prime number ");
// 		}else{
// 			System.out.println("this is not a prime number ");
// 		}
// 	}
// }


// public class N{
// 	public static void main(String[] args){
// 		int n = 113;
// 		int temp = 0;
// 		for(int i = 2; i<n; i++){
// 			if(n % i == 0){
// 				temp++;
// 			}
// 		}
// 		if(temp == 0){
// 			System.out.println("this is a prime number ");
// 		}else{
// 			System.out.println("not prime");
// 		}
// 	}
// }

// public class N{
// 	public static void main(String[] args){
// 		int n = 17;
// 		int temp = 0 ;
// 		for(int i =2; i<n; i++){
// 			if(n%i==0){
// 				temp++;
// 			}
// 		}
// 		if(temp == 0){
// 			System.out.println("prime number ");
// 		}else{
// 			System.out.println(n + " ," + "this is not a prime number ");
// 		}
// 	}
// }



// public class N{
// 	public static void main(String[] args){
// 		int n = 13;
// 		int temp = 0;
// 		for(int i=2; i<n; i++){
// 			if(n%i==0){
// 				temp++;
// 			}
// 		}
// 		if(temp == 0){
// 			System.out.println(n + " ," + " is a prime number ");
// 		}else{
// 			System.out.println(n + " ," + " is not a prime number ");
// 		}
// 	}
// }


// public class N{
// 	public static void main(String[] args){
// 		int n =115;
// 		int temp =0;
// 		for(int i =2; i<n; i++){
// 			if(n%i==0){
// 				temp++;
// 			}
// 		}
// 		if(temp == 0){
// 			System.out.println(n + " , " + " is  a prime number ");
// 		}else{
// 			System.out.println(n + " , " + " is not a prime number ");
// 		}
// 	}
// }
// import java.util.Scanner;
// public class N{
// 	public static void main(String[] args){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("enter your number: ");
// 		int n = sc.nextInt();
// 		int temp = 0;
// 		for(int i =2; i<n; i++){
// 			if(n % i == 0){
// 				temp++;
// 			}
// 		}
// 		if(temp == 0){
// 			System.out.println("this is a prime number ");
// 		}else{
// 			System.out.println("this is not a prime number ");
// 		}
// 	}
// }



import java.util.Scanner;
class N{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		int temp = 0;
		for(int i = 2; i<n ; i++){
			if(n%i==0){
				temp++;
			}
		}
		if(temp == 0){
			System.out.println("the given number is prime number ");
		}
		else{
			System.out.println("not prime , enter another number ");
		}
	}
}