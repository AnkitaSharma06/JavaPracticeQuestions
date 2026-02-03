import java.util.Scanner;
class SmartBillingSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Smart Billing System");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item price:");
        float price = sc.nextFloat();
        System.out.println("Enter the quantity:"); 
        int quantity = sc.nextInt();
        float initialPrice = price * quantity;
        if(initialPrice >= 2000){
            initialPrice = initialPrice - (initialPrice*0.05f);
        }
        if(initialPrice >= 5000){
            initialPrice = initialPrice - (initialPrice*0.10f);
        }
        float finalPrice = initialPrice + (initialPrice*0.18f);
        System.out.println("Final amount is:" + finalPrice);
        sc.close();
    }

    
}
