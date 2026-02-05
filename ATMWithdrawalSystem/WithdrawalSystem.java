package ATMWithdrawalSystem;

import java.util.Scanner;
class WithdrawalSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account balance:");
        int balance = sc.nextInt();
        System.out.println("Enter withdrawal amount:");
        int withdrawal = sc.nextInt(); 
        if(withdrawal > balance){
            System.out.println("Insufficient balance");
        } else {
            if(withdrawal % 100 == 0 && (balance - withdrawal >=1000)){
                balance = balance - withdrawal;
                System.out.println("Withdrawal successfull");
                System.out.println("Remaining balance: " + balance);
            }
            else{
                System.out.println("Withdrawal failed");
            }
            if(withdrawal % 100 != 0){
                System.out.println("Please enter the amount in multiples of 100");
            }
            if(balance - withdrawal < 1000){
                System.out.println("Minimum balance must be 1000");
            }
        }
        sc.close();
    }
    
}
