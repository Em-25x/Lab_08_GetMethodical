import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double yourTemp = SafeInput.getRangedDouble(in,"What is your temperature in degrees fahrenheit",94.0,106.0);
        System.out.println("You told me that you are " + yourTemp + " degrees fahrenheit");
    }
}