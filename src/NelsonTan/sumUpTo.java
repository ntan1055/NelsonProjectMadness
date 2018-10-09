package NelsonTan;

public class sumUpTo
{
    public static int sumTo(int input)
    {
        int sum = 0;
        for (int x = 0; input >= x; x++)
        {
            sum = sum + x;
        }
        return sum;
    }
}
