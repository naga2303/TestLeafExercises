package javaExercises.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RotateArray
{
    public static void main(String args[]){
        String[] ar = new String[]{"one","two","three","four","five","six"};
        List<String> listA = new LinkedList<String>(Arrays.asList(ar));
        System.out.println(RotateArray.listRotate(listA,1));
        //System.out.println(Collections.rotate(listA,1));
       // Collections.rotate(listA,1);
        System.out.println(listA);
    }
    public static List<String> listRotate(List<String> list, int num){

        Collections.rotate(list,num);
        return list;

    }
}
