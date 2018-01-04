package be.mglsk;

public class Main {

    public static void main(String[] args) {

        // 1. Create a byte variable and set it to any valid byte number.
        byte myByteValue = 10;

        // 2. Create a short variable and set it to any valid short number.
        short myShortValue = 20;

        // 3. Create a int variable and set it to any valid int number.
        int myInValue = 50;

        // 4. Create a variable of type long, and make it equal to 5000 + 10 times the sum of the byte, plus the short plus int.
        long myLongValue = 50000L + 10L * (myByteValue+myShortValue+myInValue);

        //Extra
        short shortTotal = (short) (1000 + 10 * (myByteValue + myShortValue + myInValue));
        System.out.println(myLongValue);
        System.out.println(shortTotal);
    }
}
