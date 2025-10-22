import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int yourAge = SafeInput.getRangedInt(in,"How old are you?",0,122);
        System.out.println("You told me that you are " + yourAge + " years old.");
    }
}