public class CToFTableDisplay
{
	public static void main(String[] args)
	{
        System.out.println("Celsius   Fahrenheit");
        for(double i = -100; i<= 100; i++)
        {
            System.out.printf("%-10.2f%-10.2f \n",i,CtoF(i));
        }
    }
    /**
     * @param Celsius degrees in celc to be converted to f
     */
    public static double CtoF(double Celsius)
    {
        //double Far = ((9/5) * Celsius) + 32;
        //double far = 9/5;
        //far *= Celsius;
        //far += 32;
        double far = (Celsius * (9/5)) + 32;
        return far;
    }
}

