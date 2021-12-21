 // 4.	Write a program to create a class called Rectangle, that contains two methods to find the area and perimeter of a Rectangle respectively, using objects.

import java.util.Scanner;
public class Rectangle{
    void area(int lenght , int width ){                                             // 1st method
        System.out.println("Area of a Rectangle is " + ( lenght * width ));
    }
    void perimeter( int len , int widt ){                                           // 2nd method
        int c = len + widt;
        System.out.println("Perimeter of a Rectangle is " + ( 2 *  c));
    }
    public static void main(String[] args){                                        // main method
        Rectangle s1 = new Rectangle();
        s1.area( 10,20 );
        s1.perimeter( 10,20 );
    }
}                                                                               