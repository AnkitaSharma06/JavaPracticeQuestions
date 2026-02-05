package ReverseNdigitAnalysis;

import java.util.Scanner;
public class DigitAnalysis {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int reverse = 0;
        int sum = 0;
        int count = 0;
        while (temp != 0) {
            int digit = temp % 10; 
            reverse = reverse * 10 + digit;
            sum = sum + digit;
            count++;
            temp = temp / 10;      
        }
        System.out.println("Reverse of digits: " + reverse);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Count of digits: " + count);
        sc.close();
    }
}

    

