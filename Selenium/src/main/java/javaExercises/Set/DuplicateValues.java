package javaExercises.Set;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValues
{
    public static void main(String args[])
    {
        int[] ar = new int[]{1,2,3,4,5,4,4,4,6,7,8,5};
        Set<Integer> st = new HashSet<>();
        Set<Integer> stDuplicate = new HashSet<>();
        for(int num:ar){
            if(!st.add(num)){
               stDuplicate.add(num);
            }
        }
        System.out.println(stDuplicate);
    }
}
