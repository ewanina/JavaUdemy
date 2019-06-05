package ControlFlowStatements;

public class SharedDigitChallenge {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(-12, 12));

    }

    public static boolean hasSharedDigit (int n1, int n2) {

        boolean result = false;

        if (n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99) {
            return false;
        }
        else {
            while (n1 > 10 && n2 > 10) {
                int remainder1 = n1 % 10;
                n1 /= 10;
                int remainder3 = n2 % 10;
                n2 /= 10;
                int remainder2 = n1;
                int remainder4 = n2;

                if (remainder1 == remainder3 || remainder2 == remainder3 ||remainder1 == remainder4 || remainder2 == remainder4) {
                    result = true;
                }
            }
        }

        return result;
    }
}
