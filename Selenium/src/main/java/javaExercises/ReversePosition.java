package javaExercises;

public class ReversePosition
{
    public static void main(String args[])
    {
        Solution.reverseEvenWords("I am a Software Tester")
        Solution.reverseEvenWords("Selenium Expert")
    }
    public static String reverseEvenWords(String str) {
        // Write your code here
        String revName="";
        for(int i=1;i<=str.length();i++)
        {
            if(i%2==0){
                for(int j=str.length()-1;j>=0;j--)
                {
                    revName=revName + str.charAt(i);
                }
                else
                {
                    revName = revName+;
                }
            }
        }

    }
}
