import java.util.Scanner;

public class FavNumbers
{
    public static void main(String args[])
    {
        /**
         * Prompt the user to enter their favorite integer and then their favorite double.
         * Use the unconstrained getInt and getDouble methods for this.
         * Really you only have two tests here, non-numeric input and
         *      valid numeric input for each method.
         */
        Scanner in = new Scanner(System.in);
        int favInt = SafeInput.getInt(in,"Enter your favorite integer");
        double favDouble = SafeInput.getDouble(in,"Enter your favorite double");
        System.out.println("Your favorite integer is " + favInt);
        System.out.println("Your favorite double is " + favDouble);
    }
}
