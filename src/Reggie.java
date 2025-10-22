import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String yourSSN = SafeInput.getRegExString(in,"Enter your SSN","^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN is: " + yourSSN);
        String yourMNumber = SafeInput.getRegExString(in,"Enter your UCID","^(M|m)\\d{5}$");
        System.out.println("Your UCID is: " + yourMNumber);

        String menu = "MENU -- O-Open -- S-Save -- V-View -- Q-Quit";
        System.out.println(menu);
        String choice = SafeInput.getRegExString(in,"Make your choice","^[OoSsVvQq]$");
        System.out.println("Your choice is: " + choice);
    }
}
