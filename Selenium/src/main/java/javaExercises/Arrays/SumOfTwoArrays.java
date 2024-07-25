package javaExercises.Arrays;
/* sum of two values should be equal to target value*/
public class SumOfTwoArrays {
    public static void main(String args[]){
        int a[] = new int[]{2,7,11,15};
        int target = 9;
        int results[] = SumOfTwoArrays.twoSums(a,target);
       if(results!=null){
           for(int result:results){
               System.out.println(result);
           }
       }
    }
    public static int[] twoSums(int nums[], int target)
    {
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j< nums.length;j++)
            {
                int sum1 = nums[i] + nums[j];

                if(sum1==target){
                    arr[0]=nums[i];
                    arr[1]= nums[j];
                    return arr;
                }
            }
        }
    return null;

    }
}
