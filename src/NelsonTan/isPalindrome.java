package NelsonTan;

public class isPalindrome {
    public static String palindrome(String word)
    {
        String statement = "";
        String backwards = "";
        int i = word.length() - 1;
        while (i >= 0)
        {
            backwards = backwards + word.substring(i, i + 1);
            i--;
        }
        String forward = word.substring(0, word.length());
        if (forward.equals(backwards))
        {
            statement = "true";
        }
        else
        {
            statement = "false";
        }
        return statement;
    }
}
