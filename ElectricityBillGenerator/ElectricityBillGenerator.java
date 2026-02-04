package ElectricityBillGenerator;

import java.util.Scanner;
class ElectricityBillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed:");
        int units = sc.nextInt();
        int bill = 0;
        int fixedAmt = 150;
        if(units<=100){
            bill = (units*2) + fixedAmt;
        } 
        if(units>100 && units<=200){
            bill = (units*3) + fixedAmt;
        }
        if(units>200){
            bill = (units*5) + fixedAmt;
        }
        System.out.println("The total electricity bill is: " + bill);
        sc.close();

    }

        
    
}
