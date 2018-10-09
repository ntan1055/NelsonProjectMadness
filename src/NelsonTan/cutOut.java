package NelsonTan;

public class cutOut
{
    public static String cutOutWord(String mainStr, String subStr)
    {
        String output = "";
        int subStrPosition = mainStr.indexOf(subStr);
        String front = mainStr.substring(0, subStrPosition);
        String back = mainStr.substring(subStrPosition + subStr.length(), mainStr.length());
        output = front + back;
        return output;
    }
}
