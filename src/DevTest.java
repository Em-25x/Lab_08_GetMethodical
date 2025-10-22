import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favNum = SafeInput.getInt(in,"Enter your favorite number");
        System.out.println("Your favorite number is " + favNum);
    }
}