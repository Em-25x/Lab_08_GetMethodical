import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String phoneNumber = SafeInput.getRegExString(in,"Enter your phone number","^1-\\d{3} \\d{3}-\\d{4}");
        System.out.println("Your phone number is " + phoneNumber);

    }
}