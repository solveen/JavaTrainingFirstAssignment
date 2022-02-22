package ConvertingVariable;

public class NarrowingCasting {
    double myDouble = 100.235d;
    int  myInt;

    public void nc(){
        // Changes the double value to integer
        myInt = (int) myDouble;
        System.out.println("Double value changed to integer: " + myInt);
    }

}
