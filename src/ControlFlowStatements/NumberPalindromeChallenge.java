package ControlFlowStatements;

public class NumberPalindromeChallenge {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-12321));

    }

    public static boolean isPalindrome (int number) {

        int reverse = 0;
        boolean comparison = false;
        int originalInput = number;

        while (originalInput != 0) {

            int lastDigit = originalInput % 10;

                reverse += lastDigit;
                reverse *= 10;
                originalInput /= 10;

        }

        reverse /= 10;
        if (reverse == number ) {
            comparison = true;
        }

        return comparison;
    }
}
