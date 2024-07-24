package javaExercises.Strings;

import org.checkerframework.checker.units.qual.C;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseOnlyEnglish {
    public static void main(String args[]) {
        System.out.println(ReverseOnlyEnglish.reverseEnglish("ab-cd"));
        System.out.println(ReverseOnlyEnglish.reverseEnglish("Testleaf-Software=Great-Value!"));
    }

    public static String reverseEnglish(String str) {
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();
        boolean bool=false;
        int len = 0;
        if (!Character.isLetter(str.charAt(str.length()-1))) {
            len = str.length() - 2;
            bool=true;
        }
        else
        {
            len = str.length()-1;
        }
        for (int i = len; i >= 0; i--) {
            sb = sb.append(str.charAt(i));
        }
        if(bool)
        {
           sb= sb.append(str.charAt(str.length()-1));
        }
        return sb.toString();

    }
}

