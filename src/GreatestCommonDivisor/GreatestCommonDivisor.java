package GreatestCommonDivisor;

public class GreatestCommonDivisor {
    int a = 3;
    int b = 7;
    int x = 1;

    public GreatestCommonDivisor(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public void GDCPrint() {
        for (int i = 1; i <= a && i <= b; i++) {

            if (a % i == 0 && b % i == 0) {
                x = i;
            }


        }
        System.out.println("GCD of " + a + " and " + b + " is: " + x);
    }
}




