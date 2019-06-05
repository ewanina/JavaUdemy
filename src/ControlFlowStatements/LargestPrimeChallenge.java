package ControlFlowStatements;

public class LargestPrimeChallenge {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(7));

    }
    public static int getLargestPrime (int number) {
        if (number <= 1)
            return -1;
        else {
            int divisor = 2;

            while (number != 1) {
                if (number % divisor == 0) {
                    number /= divisor;
                    System.out.println(number);
                    System.out.println(divisor);
                }
                else {
                    divisor++;
                    System.out.println(divisor);
                }
            }
            return divisor;
        }
    }
}

