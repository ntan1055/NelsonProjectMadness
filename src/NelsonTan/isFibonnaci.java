package NelsonTan;

public class isFibonnaci
{
    public static String fibonnaci(int number)
    {
        String statement = "";
        int a = 0;
        int b = 1;
        int c = 0;
        while (c < number)
        {
            c = a + b;
            a = b;
            b = c;
        }
        if (c == number)
        {
            statement = "It is a fibonnaci number.";
        }
        else
        {
            statement = "It is not a fibonnaci number.";
        }
        return statement;
    }
}
