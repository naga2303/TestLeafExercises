package javaExercises;

public class AmstrongNum
{
    public static void main(String args[]){
        System.out.println(AmstrongNum.isArmstrong(153));
    }
    public static boolean isArmstrong(long num){
        long revNum=0;
        long num1 = num;
        while(num > 0){
           long div = num%10;
            revNum = revNum + (div*div*div);
            num=num/10;
            System.out.println(num);
        }
        return num1==revNum;
    }
}
