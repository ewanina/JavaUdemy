package ControlFlowStatements;

public class PerfectNumberChallenge {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));

    }

    public static boolean isPerfectNumber (int number) {

        int n = 0;
        boolean result = false;

        if (number < 1) {
            return false;
        }

        else {
            for (int i=1; i<number; i++) {
                if (number % i == 0) {
                    n += i;
                }
            }

            if (n == number) {
                result = true;
            }
        }

        return result;
    }
}
