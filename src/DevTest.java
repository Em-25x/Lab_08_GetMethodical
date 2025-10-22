import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tempToday = SafeInput.getDouble(in,"What is the temp today in C?");
        System.out.println("the temperature today is: " + tempToday);

    }
}