import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in,"Enter your birth year",1950,2025);
        int month = SafeInput.getRangedInt(in,"Enter your birth month",1,12);
        int day = -1;
        switch (month)
        {
            case 2:
                day = SafeInput.getRangedInt(in,"Enter your birth day",1,29);
                break;
            case 4,6,9,11:
                day = SafeInput.getRangedInt(in,"Enter your birth day",1,30);
                break;
            case 1,3,5,7,8,10,12:
                day = SafeInput.getRangedInt(in,"Enter your brith day",1,31);
                break;
        }
        int minutes = SafeInput.getRangedInt(in,"Enter your birth minutes",1,59);
        System.out.println("You were born in " + year + " in month " + month + " on day " + day + " on minute " + minutes);
    }
}
