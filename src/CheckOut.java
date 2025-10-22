import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double totalCost = 0.0;
        do
        {
            totalCost += SafeInput.getRangedDouble(in,"Enter the price of your item",.5,10);
            done = !SafeInput.getYNConfirm(in,"Do you have any more items?");
        }while(!done);
        System.out.printf("Your total cost is %.2f", totalCost);
    }
}
