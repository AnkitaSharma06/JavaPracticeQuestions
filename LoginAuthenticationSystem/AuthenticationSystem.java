package LoginAuthenticationSystem;

import java.util.Scanner;
class AuthenticationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "admin";
        String correctPassword = "1234";
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } 
            else {
                attempts++;
                System.out.println("Invalid credentials.");
                if (attempts < 3) {
                    System.out.println("Attempts left: " + (3 - attempts));
                }
            }
        }
        if (attempts == 3) {
            System.out.println("Account locked due to 3 failed login attempts.");
        }
        sc.close();
    }
}