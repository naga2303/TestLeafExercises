package week3.day1;

public class MethodOverride {
    public static void main(String args[]){
        subClass sc = new subClass();
    sc.superMethod();
    superClass scp = new superClass();
    scp.superMethod();
    }
    
}
class superClass{
    public void superMethod(){
        System.out.println("Super Done");
    }
}
class subClass extends superClass{
    public  void superMethod(){
        System.out.println("Sub done");
    }
}