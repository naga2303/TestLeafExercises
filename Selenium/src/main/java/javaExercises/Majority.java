package javaExercises;

public class Majority
{
    public static void main(String args[])
    {
        int[] ar = new int[]{3,2,3};
        int[] ar1 = new int[]{2,2,1,1,1,2,2};
        Majority mj = new Majority();
       System.out.println( mj.returnMajor(ar));
        System.out.println( mj.returnMajor(ar1));
    }
    public int returnMajor(int[] mj){
        int count=0;
        int majorEle =0;
        for(int i=0;i<=mj.length;i++){
            int temp=0;
            for(int j=i;j<mj.length;j++){
                if(mj[i]==mj[j]){
                    temp++;
                }
            }
            if(temp>count){
                count = temp;
                majorEle = mj[i];
            }
        }
        return majorEle;

    }
}

