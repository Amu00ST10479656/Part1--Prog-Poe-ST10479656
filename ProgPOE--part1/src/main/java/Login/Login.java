/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 *
 * @author amuke
 */
public class Login {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String cellPhoneNumber;
    
    // constructer
    public Login(String firstName, String lastName, String username, String password, String cellPhoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;
    }
    
    // Check username contains underscore and no more than 5 chr
    
    public boolean checkUserName() {
        return username.contains("_")&& username.length()<= 5;
    }
     
    public boolean checkPasswordComplexity() {
        if (password.length()< 8) return false;
        boolean hasUpper = false, hasDigit = false, hasSpecial = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (!Character.isLetterOrDigit(c)) hasSpecial = true;
    }
    return hasUpper && hasDigit && hasSpecial;
    }
    
    //Checks cell phone number using regex + 10 chr total
    //Reference regex pattern for international phone numbers 
    
    public boolean checkCellPhoneNumber() {
        return cellPhoneNumber.matches("^\\+[0-9]{9,11}$");
        
    }
 
    // Return registration status message 
    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
          }
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
          }
        if (!checkCellPhoneNumber()) {
            return "Cell phone number incorrectly formatted  or does not contain international code.";
        }
        return "Username successfully captured.\nPassword successfully captured.\nCell phone number successfully added.";
    }
    
    // verifies login credentials match registered details 
    public boolean loginUser(String enteredUsername, String enteredPassword) {
            return this.username.equals(enteredUsername) && this.password.equals(enteredPassword);
    }
    
    // returns login status message
    public String returnLoginStatus(String enteredUsername, String enteredPassword) {
        if (loginUser(enteredUsername, enteredPassword)) {
            return "Welcome" + firstName + "" + lastName + " It is great to see you.";
        }else {
            return "Username or password incorrect, please try again.";
        }
    }
}
