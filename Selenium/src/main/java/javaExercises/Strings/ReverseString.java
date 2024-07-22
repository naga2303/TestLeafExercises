package javaExercises.Strings;

public class ReverseString
{
    public static void main(String args[]){
        ReverseString rst = new ReverseString();
        System.out.println(rst.reverseCheck("testleaf"));
    }
    public String reverseCheck(String str){
        //String str = "testleaf";
        String revStr = "";
        if(str==""){
            return null;
        }
        else
        {
            for(int i=str.length()-1;i>=0;i--){
                revStr=revStr+str.charAt(i);
            }
        }
        return revStr;
    }
}
