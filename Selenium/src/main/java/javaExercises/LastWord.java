package javaExercises;

public class LastWord
{
    public static void main(String args[])
    {
        LastWord lw = new LastWord();
        System.out.println(lw.lengthLastWord("Hello World"));
        System.out.println(lw.lengthLastWord(" fly me to the moon "));
        System.out.println(lw.lengthLastWord("luffy is still joyboy"));
    }

    public int lengthLastWord(String str){
        String text = str.trim();
        String[] ar = new String[str.length()];
        ar = text.split(" ");
        int value;
        value = ar[ar.length-1].length();
        return value;
    }
}