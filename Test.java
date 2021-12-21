// class Test{
// 	int x = 5 ;                                            // instance variable 
// 	public static void main(String[] args){
// 		Test t = new Test();
// 		// System.out.println(t.x);
// 		t.dispay();
// 	}
// 	public void dispay(){     				 				// instance method
	
// 		System.out.println(x);
// 	}
// }


// class Test{
// 	void kid_info(String name , int roll_number , int grade ){
// 		System.out.println(name + " " + " is in  " + grade + " grade " + " and his roll number is " + roll_number );
// 	}
// 	public static void main(String[] args ){
// 		Test s1 = new Test();
// 		s1.kid_info("rohit", 104 , 8);
// 	}
// }






//    mini calculator:

// import java.util.Scanner;
// public class Test{

// 	public static int sum(int num1 , int num2 ){
// 		System.out.println(num1 + num2 );
// 		return ( num1 + num2 ) ;
// 	}

// 	public static int diff(int num1 , int num2 ){
// 		System.out.println(num1 - num2 );
// 		return num1 ;
// 	}


// 	public static void main(String[] args){
// 		sum(4,6);
// 		diff(5,2);
// 	}

// }











import java.util.Scanner;												// mini calculator:
public class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Calculator");
		int num1 = sc.nextInt();
		while ( num1 == 0 ){
			System.out.println("enter number ");
			int num2 = sc.nextInt();
			System.out.println("enter number ");
			int num3 = sc.nextInt();

			switch(num1){
				case 1:
				System.out.println("addition");
			}
			
		}
			
	}
}