package javaExercises.Strings;

public class SquareRoot
{
    public static void main(String args[]){
        SquareRoot st = new SquareRoot();
        System.out.println(st.sqrt(626)); }
    public int sqrt(int a){
        int num=0;
        for(int i=1;i<a;i++){
            if((i*i)==a){
                return i;
            }
        }
        for (int i=1;i<a;i++){
            if((i*i)>a){
                num = i-1;
                break;
            }
        }
      return num; }

}
