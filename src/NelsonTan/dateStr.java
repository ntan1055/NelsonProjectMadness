package NelsonTan;

public class dateStr {
    public static String dateString(String dateInput)
    {
      String output = "";
      output = dateInput.substring(3,5) + '-' +dateInput.substring(0,2) + '-' +dateInput.substring(6, dateInput.length());
      return output;
    }
}
