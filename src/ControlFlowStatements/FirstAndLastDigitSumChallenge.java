package ControlFlowStatements;

public class FirstAndLastDigitSumChallenge {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(22323));

    }

    public static int sumFirstAndLastDigit (int number) {

        if (number < 0) {
            return -1;
        }

        else {
            int lastDigit = number % 10;
            int firstDigit = number;

            while (firstDigit >= 10) {
                firstDigit /= 10;
            }

            return lastDigit + firstDigit;
        }
    }
}
