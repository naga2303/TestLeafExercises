package week3.day2;

public class Amazon extends CanaraBank {
    public static void main(String[] args) {
        Amazon az = new Amazon();
az.cardPayments();
az.upiPayments();
az.cashOnDelivery();
az.internetBanking();
    }

    @Override
    public void cashOnDelivery() {
        System.out.println("Cash on Delivery");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void upiPayments() {
        System.out.println("Upi Payments");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cardPayments() {
        System.out.println("Card Payments");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void internetBanking() {
        System.out.println("Internet Banking");
        // TODO Auto-generated method stub
        
    }
    
}
