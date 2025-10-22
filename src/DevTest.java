import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String color = SafeInput.getNonZeroLenString(in,"What is your favorite color?");
        System.out.println("Your favorite color is " + color);
    }
}