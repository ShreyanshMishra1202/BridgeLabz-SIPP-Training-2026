// 1. Username Validator 
// A company wants to validate usernames entered by users.
// Write a program that:
// Accepts a username.
// Checks whether it contains any spaces.
// Counts the total number of characters.
// Converts the username to uppercase.
// Displays whether the username is a palindrome.

import java.util.Scanner;

public class UsernameValid {

    static boolean isPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return s.equals(rev);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username=sc.nextLine();
        if(username.contains(" ")){
            System.out.println("Username should not contain spaces.");
        } else {
            System.out.println("Total characters: " + username.length());
            String upperUsername = username.toUpperCase();
            System.out.println("Username in uppercase: " + upperUsername);
            if (isPalindrome(username)) {
                System.out.println("The username is a palindrome.");
            } else {
                System.out.println("The username is not a palindrome.");
            }
        }
    }
}
