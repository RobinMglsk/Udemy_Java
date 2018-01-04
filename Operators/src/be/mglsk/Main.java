package be.mglsk;

public class Main {

    public static void main(String[] args) {

        // 1. Create  a double variable with the value 20.
        double doubleValue = 20d;

        // 2. Create a second variable of type double with the value 80.
        double secondDoubleValue = 80d;

        // 3. Add both numbers up and multiply by 25.
        doubleValue = (doubleValue + secondDoubleValue) * 25;

        // 4. Use the remainder operator to figure out the remainder from the sum of #3 devided by 40.
        doubleValue = doubleValue % 40;

        // 5. Write an "if" statement that displays a message "Total was over the limit" if the remaining total (#4) is equal to 20 or less.

        if(doubleValue <= 20){
            System.out.println("Total was over the limit");
        }

    }
}
