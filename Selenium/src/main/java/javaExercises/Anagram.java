package javaExercises;

import java.util.Arrays;

public class Anagram
{
    public static void main(String args[]){
        System.out.println(Anagram.isAnagram("Naga","Naga"));
    }
    public static boolean isAnagram(String input1, String input2){
        if(input1.length()!=input2.length()){
            return false;
        }
        char[] ch1 = input1.toCharArray();
        char[] ch2 = input2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}
