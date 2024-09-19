import java.util.Scanner;  

public class password {  
    public static void main(String[] args) {  
        final String CORRECT_PASSWORD = "james"; // Set your desired password here  
        Scanner scanner = new Scanner(System.in);  

        int attempts = 0;  
        boolean isPasswordCorrect = false;  

        while (attempts < 3 && !isPasswordCorrect) {  
            System.out.print("Enter your password: ");  
            String userInput = scanner.nextLine();  

            if (userInput.equals(CORRECT_PASSWORD)) {  
                isPasswordCorrect = true;  
                System.out.println("Password accepted! Access granted.");  
            } else {  
                attempts++;  
                System.out.println("Incorrect password. You have " + (3 - attempts) + " attempt(s) left.");  
            }  
        }  

        if (!isPasswordCorrect) {  
            System.out.println("Too many incorrect attempts. Access denied.");  
        }  

        scanner.close();  
    }  
}