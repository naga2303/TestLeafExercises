package week3.day1;

public class PolymorphismStaticEx {
    public static void main(String args[]){
        Reports rp = new Reports();
        rp.reportStep("completed","Done");
        rp.reportStep("Pending", "Failed", true);
    }
}
class Reports{
    public void reportStep(String msg, String status)
    {
        System.out.println(msg+":"+status);
    }
    public void reportStep(String msg, String status, boolean snap){
        System.out.println(msg+":"+status+":"+snap);
    }
}
