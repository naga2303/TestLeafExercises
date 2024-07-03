package javaExercises;

public class PalindromeString {

    public static void main(String args[])
    {
        PalindromeString.checkPalindrome("MADAM");
        PalindromeString.checkPalindrome("RACECAR");
    }
    public static boolean checkPalindrome(String str) {
        // Write your code here
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        return rev.equals(str);

    }
}
