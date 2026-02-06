package SubtractionWithoutOperators;

import java.util.Scanner;
class Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int carry = 1;
        while (carry != 0) {
            int temp = num2 ^ carry;
            carry = (num2 & carry) << 1;
            num2 = temp;
        }
        while (num2 != 0) {
            int temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        System.out.println("Result = " + num1);
        sc.close();
    }
}