import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args)
    {
        PrettyHeader("hello");
    }
    public static void PrettyHeader(String msg)
    {
        for (int i = 0; i < 60; i++)
        {
            System.out.print("*");
        }
        System.out.println("\n");
        if (msg.length() % 2 == 1)
        {
            msg += " ";
        }

        int pad = (60 - msg.length())/2;

        System.out.printf("%-" + pad +"s" + msg + "%" + pad +"s \n","***","***");
        for(int i = 0; i < 60; i++)
        {
            System.out.print("*");
        }
    }
}
