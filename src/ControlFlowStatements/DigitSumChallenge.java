package ControlFlowStatements;

public class DigitSumChallenge {

    public static void main(String[] args) {

        System.out.println("Sum of digits is " + sumDigits(121212));

    }

    public static int sumDigits (int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            // extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            // drop tle least-significant digit
            number /= 10; // same as number = number / 10;
        }

        return sum;
     }
}
