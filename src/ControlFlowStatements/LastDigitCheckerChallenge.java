package ControlFlowStatements;

public class LastDigitCheckerChallenge {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(11,1201,39));
        System.out.println(isValid(121));
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {

        boolean result = false;

        if (n1 <10 || n1 > 1000 || n2 < 10 || n2 > 1000 || n3 < 10 || n3 > 1000) {
            return false;
        }

        else {
            int r1 = n1 % 10;
            int r2 = n2 % 10;
            int r3 = n3 % 10;

            if (r1 == r2 || r2 == r3 || r1 == r3) {
                result = true;
            }
        }

        return result;
    }

    public static boolean isValid (int number) {
        boolean result = true;

        if (number < 10 || number > 1000) {
            result = false;
        }

        return result;
    }
}
