import java.util.Scanner;

public class SafeInput
{
    /**
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }
    /**
     *
     *@param pipe Scanner object that you created in main in the usual way
     *@param prompt the message to display as the prompt for the input.
     *@return any integer
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        String trash = "";
        int newInt = 0;
        boolean done = false;
        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                newInt = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Please enter a valid integer, not: " + trash);
            }
        }while(!done);
        return newInt;
    }
    /**
     * @param pipe Scanner object that you created in main in the usual way
     * @param prompt the message to display as the prompt for the input.
     * @return any double
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        String trash = "";
        double newDouble = 0.0;
        boolean done = false;
        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                newDouble = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Please enter a valid double, not: " + trash);
            }
        }while(!done);
        return newDouble;
    }
}