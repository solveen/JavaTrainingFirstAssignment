package ShopDiscount;

import java.util.Scanner;

public class ShopDiscount {
    double priceOfIceCream = 100d;
    double discountPercentage = 10d;
    double totalCost, discountPrice;

    public void costOfTheIceCream(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of IceCream you want to purchase: ");
        double quantityOfIceCream = sc.nextDouble();

        System.out.println("Price of one bucket of IceCream is: " + priceOfIceCream);

        System.out.println("Number of IceCream purchased is: " + quantityOfIceCream );



        totalCost = priceOfIceCream * quantityOfIceCream;
        System.out.println("Your total cost is: " + totalCost);


        if(totalCost > 1000){
          discountPrice = ( totalCost * discountPercentage / 100 );
          totalCost = totalCost - discountPrice;
          System.out.println("Since the total cost of the IceCream is more than 1000, you will get 10 percent of discount");
          System.out.println("So, the total cost is: " + totalCost);
        }

        sc.close();


    }
}
