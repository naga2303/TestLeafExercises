package week3.day2;

public class CountA {
    public static void main(String args[]){
        String name = "Nagarajan";
        int count=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='n'){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
