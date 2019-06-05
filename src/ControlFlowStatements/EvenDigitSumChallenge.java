package ControlFlowStatements;

public class EvenDigitSumChallenge {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(0));

    }

    public static int getEvenDigitSum (int number) {

        int sum = 0;

        if (number < 0) {
            return -1;
        }
        else {

            while (number > 0) {
                if (number % 2 != 0) {
                    number /= 10;
                }
                else {
                    int evenDigit = number % 10;
                    sum += evenDigit;
                    number /= 10;
                }
            }
        }

        return sum;
    }
}
