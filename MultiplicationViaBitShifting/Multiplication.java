package MultiplicationViaBitShifting;

import java.util.Scanner;
class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int result = 0;
        boolean negative = false;
        if (num1 < 0) {
            num1 = ~num1 + 1;  
            negative = !negative;
        }
        if (num2 < 0) {
            num2 = ~num2 + 1;
            negative = !negative;
        }
        while (num2 > 0) {
            if ((num2 & 1) == 1) {
                result = result + num1;  
            }
            num1 = num1 << 1;
            num2 = num2 >> 1;
        }
        if (negative) {
            result = ~result + 1;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}