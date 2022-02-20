package FieldOfInterest;

import java.util.Scanner;

public class UserInput {

    public void UI(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String Name = sc.nextLine();
        System.out.println("Enter your roll number: ");
        int RollNumber = sc.nextInt();
        // we have to use sc.nextLine() after the integer input otherwise the string won't be read
        sc.nextLine();
        System.out.println("Enter you Field of interest: ");
        String FieldOfInterest = sc.nextLine();

        System.out.println("Hey my name is " + Name + "and my roll number is " + RollNumber + "."+ " My field of interest are " + FieldOfInterest);

    sc.close();
    }
}
