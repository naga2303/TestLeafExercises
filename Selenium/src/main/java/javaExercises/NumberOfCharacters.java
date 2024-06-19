package javaExercises;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCharacters
{
    public static void main(String args[]){
        String txt = "My Name is Nagarajan";
        String txtLowerCase = txt.replace(" ","").toLowerCase();
        System.out.println(txtLowerCase);
        Map<Character,Integer> mp = new HashMap<Character,Integer>();
        for(int i=0;i<txtLowerCase.length();i++){
            if(mp.containsKey(txtLowerCase.charAt(i))){
                mp.put(txtLowerCase.charAt(i),(mp.get(txtLowerCase.charAt(i)))+1);
            }
            else
            {
                mp.put(txtLowerCase.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> ent : mp.entrySet()){
            System.out.println(ent.getKey()+" : "+ent.getValue());
        }
    }
}
