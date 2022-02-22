package FactorialOfaNumber;

import java.util.Scanner;

public class FactorialOfaNumber {
    int factorial = 1;
    public void fon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to factorial of: ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i ++ ){
            factorial = factorial * i;
        }
        System.out.println("Factorial of a number is: " + factorial);
        sc.close();

    }

}
