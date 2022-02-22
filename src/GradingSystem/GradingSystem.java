package GradingSystem;

import java.util.Scanner;

public class GradingSystem {

    public void gs(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student: ");
        double marks= sc.nextDouble();


        if (marks < 25){
            System.out.println("The Grade of the Student is F");
        }
        else if (marks >= 25 && marks < 45){
            System.out.println("The Grade of the Student is E");
        }
        else if (marks >= 45 && marks < 50){
            System.out.println("The Grade of the Student is D");
        }
        else if (marks >= 50 && marks < 60 ){
            System.out.println("The Grade of the Student is C");
        }
        else if (marks >= 60 && marks < 80){
            System.out.println("The Grade of the Student is B");
        }
        else {
            System.out.println("The Grade of the Student is A");
        }
        sc.close();
    }
}
