package javaExercises;

import io.cucumber.java.ro.Si;

import java.util.HashMap;
import java.util.Map;

public class SingleOutValue
{    public static void main(String args[]){
      SingleOutValue sov = new SingleOutValue();
      int[] ar = {2,2,1};
      int[] a2 = {4,1,2,1,2};
      int [] a3 = {1};
      System.out.println(sov.findNum(ar));
        System.out.println(sov.findNum(a2));
        System.out.println(sov.findNum(a3));
    }
    public int findNum(int[] ar1){
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i=0;i<ar1.length;i++){
            if(mp.containsKey(ar1[i])){
                mp.put(ar1[i],(mp.get(ar1[i]))+1);
            }
            else
            {
                mp.put(ar1[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> ent:mp.entrySet()){
            if(ent.getValue()==1){
                return ent.getKey();
            }
        }
        return 0;
    }
}
