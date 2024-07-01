package javaExercises;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PalindromePhrase
{
    public static void main(String args[]){
        String str = "A man, a plan, a canal:Panama";
        String modifiedString = str.replaceAll("[^a-z A-Z 0-9]","").replace(" ", "").toLowerCase();
        String checkPanlin="";
        for(int i=modifiedString.length()-1;i>=0;i--){
            checkPanlin=checkPanlin+modifiedString.charAt(i);
        }
        if(checkPanlin.equals(modifiedString)){
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }

    }
    }

