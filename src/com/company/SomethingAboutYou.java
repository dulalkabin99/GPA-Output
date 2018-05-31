package com.company;

import java.util.Scanner;

public class SomethingAboutYou { public static void main( String[] args )
{ Scanner keyboard = new Scanner(System.in);

    String firstName;
    int age;
    double height;
    double gpa;

    System.out.print( "What is your first name? " );
    firstName = keyboard.next();

    System.out.print( "How old are you? " );
    age = keyboard.nextInt();


    System.out.print( "How tall are you? " );
    height = keyboard.nextDouble();

    System.out.print( "What is your GPA? " );
    gpa = keyboard.nextDouble();

    System.out.println("Name: " + firstName );
    System.out.println("Age: " + age) ;
    System.out.println("Height: " + height);
    System.out.println("GPA: " + gpa) ;
}
}