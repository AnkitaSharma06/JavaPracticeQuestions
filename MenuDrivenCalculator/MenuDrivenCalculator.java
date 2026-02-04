package MenuDrivenCalculator;

import java.util.Scanner;
class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");       
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Addition of " + num1 + " and " + num2 + " is: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + (num1 - num2));
                break;  
            case 3:
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed");
                    break;
                }
                System.out.println("Division of " + num1 + " and " + num2 + " is: " + (num1 / num2));
                break;
            case 5:
                System.out.println("Modulus of " + num1 + " and " + num2 + " is: " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();
    }
}
