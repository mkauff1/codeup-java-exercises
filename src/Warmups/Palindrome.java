package Warmups;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        userInput();
    }

    private static boolean isPalindrome(String pali) {
        int a = 0;
        int b = pali.length() -1;

        while (a < b) {
            if (pali.charAt(a) != pali.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }

    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a palindrome: ");
        String userInput = scanner.nextLine();

        if (isPalindrome(userInput.toLowerCase(Locale.ROOT))) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
