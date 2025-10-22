import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = SafeInput.getYNConfirm(in,"Are you done?");
        if(done == true)
        {
            System.out.println("You are done");
        }
        else
        {
            System.out.println("You are not done");
        }
    }
}