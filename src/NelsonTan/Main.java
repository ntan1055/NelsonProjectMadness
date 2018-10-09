package NelsonTan;

public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println("reverse of \'reverse\' is "+NelsonTanLib.reverse("reverse"));
        System.out.println("The date is \'03/17/2001\' is "+dateStr.dateString("03/17/2001"));
        System.out.println("If you cut out the first cat from \'catatonic cat\' you get "+cutOut.cutOutWord("catatonic cat","cat"));
        System.out.println("The sum up to (10)= "+(sumUpTo.sumTo(10)));
        System.out.println("(21) "+(isFibonnaci.fibonnaci(21)));
        System.out.println("The fact that the word \'racecar\' is a palindrome is "+isPalindrome.palindrome("racecar"));
    }
}


