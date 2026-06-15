// A spy agency encodes messages. Reverse a secret message, check if
// it is a palindrome, count vowels/consonants, and verify if two
// intercepts are anagrams. Extend: find the first non-repeating
// character in a surveillance log.
import java.util.*;
public class Spy_Scenario_Based {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Secret Message: ");
        String s=sc.nextLine();
        boolean isPalindrome=checkPalindrome(s);
        if(isPalindrome){
            System.out.println(s+" is Palindrome");
        }
        else{
            System.out.println(s+" is not Palindrome");
        }
        countVowel_and_Consonant(s);

        
    }
    static boolean checkPalindrome(String s){
        String rev="";
        for(int i=0;i<s.length();i++){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            return true;
        }
        return false;
    }

    static void countVowel_and_Consonant(String s){
        int vow=0,con=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> vow++;
                default -> {
                    if (Character.isLetter(ch)) {
                        con++;
                    }
                }
            };
        }
        System.out.println("Vowel = "+vow+" and Consonant = "+con);
    }
    
}
