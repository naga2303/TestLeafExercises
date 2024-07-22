package javaExercises.Strings;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseOnlyEnglish
{
    public static void main(String args[]){
       System.out.println( ReverseOnlyEnglish.reverseEnglish("ab-cd"));
        System.out.println(ReverseOnlyEnglish.reverseEnglish("Testleaf-Software=Great-Value"));
    }
    public static String reverseEnglish(String chars){
        String rev="";
        String match = "";

        String regex = "[a-zA-Z]*";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(chars);

        boolean isMatch = matcher.matches();
        if(isMatch) {
            while (matcher.find()) {
                match = matcher.group();
                System.out.println(match);

            }
            rev = rev + match;
        }
        else
            {
                rev = rev+ chars;
            }


        return rev;
    }
}
