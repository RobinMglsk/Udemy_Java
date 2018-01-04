package be.mglsk;

public class Main {

    public static void main(String[] args) {

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char switchValue = 'E';

        switch (switchValue){

            case 'A':
                System.out.println("It's an A!");
                break;

            case 'B':
                System.out.println("It's an B!");
                break;

            case 'C':
                System.out.println("It's an C!");
                break;

            case 'D': case 'E':
                System.out.println("It's an "+switchValue+"!");
                break;

            default:
                System.out.println("Not found");
                break;

        }

    }
}
