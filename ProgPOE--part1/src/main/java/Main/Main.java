/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Scanner;
import Login.Login;


public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to QuickChat \n");
        
        // Collect registration info
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter Username (must contain _ and be max 5 chars):");
        String username = scanner.nextLine();
        
        System.out.print("Enter Password (min 8 chars, 1 capital, 1 number, 1 special char): ");
        String password = scanner.nextLine();
        
        System.out.print("Enter Cell Phone Number (with international code e.g +278376251938): ");
        String cellPhone = scanner.nextLine();
        
        //Register user
        Login user = new Login(firstName, lastName, username, password, cellPhone);
        System.out.println("\n--- Registration Status ---");
        System.out.println(user.registerUser());
        
        //Login
        System.out.print("\n--- Login ---");
        System.out.print("Enter Username: ");
        String loginUsername = scanner.nextLine();
        
        System.out.print("Enter Password: ");
        String loginPassword = scanner.nextLine();
        
        System.out.println("\n--- Login Status ---");
        System.out.println(user.returnLoginStatus(loginUsername, loginPassword));
        
        scanner.close();
    }
             
                     
                
}
