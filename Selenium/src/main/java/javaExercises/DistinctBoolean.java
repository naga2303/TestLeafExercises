package javaExercises;

public class DistinctBoolean
{
    public static void main(String args[]){
        DistinctBoolean isBool = new DistinctBoolean();
        int[] ar = new int[]{1,2,3,1};
        int[] ar1 = new int[]{1,2,3,4};
        int[] ar2 = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(isBool.isDistinct(ar));
        System.out.println(isBool.isDistinct(ar1));
        System.out.println(isBool.isDistinct(ar2));
    }
    public Boolean isDistinct(int[] arr){
        int maxLimit = 2;
        boolean bool = false;
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=i;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }

            }
            if(count<=maxLimit){
                bool = true;
            }
            else {
                return bool;

            }


        }
        return bool;
    }
}
