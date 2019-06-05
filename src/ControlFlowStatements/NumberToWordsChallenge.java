package ControlFlowStatements;

public class NumberToWordsChallenge {

    public static void main(String[] args) {
        numberToWords(1450);
    }

    public static void numberToWords (int number) {

        int n;

        if (number < 0 || reverse(number) < 0) {
            System.out.println("Invalid Value");
        }

        else if (getDigitCount(reverse(number)) != getDigitCount(number)) {
            int zeros = getDigitCount(number) - getDigitCount(reverse(number));

            number = reverse(number);

            while (number != 0) {

                n = number % 10;

                if (n == 1) {
                    System.out.println("One");
                }
                if (n == 2) {
                    System.out.println("Two");
                }
                if (n == 3) {
                    System.out.println("Three");
                }
                if (n == 4) {
                    System.out.println("Four");
                }
                if (n == 5) {
                    System.out.println("Five");
                }
                if (n == 6) {
                    System.out.println("Six");
                }
                if (n == 7) {
                    System.out.println("Seven");
                }
                if (n == 8) {
                    System.out.println("Eight");
                }
                if (n == 9) {
                    System.out.println("Nine");
                }

                number /= 10;
            }

            for (int i=0; i<zeros; i++) {
                System.out.println("Zero");
            }
        }

        else {

            number = reverse(number);

            if (number == 0) {
                System.out.println("Zero");
            }

            while (number != 0) {
                n = number % 10;

                if (n == 0) {
                    System.out.println("Zero");
                }
                if (n == 1) {
                    System.out.println("One");
                }
                if (n == 2) {
                    System.out.println("Two");
                }
                if (n == 3) {
                    System.out.println("Three");
                }
                if (n == 4) {
                    System.out.println("Four");
                }
                if (n == 5) {
                    System.out.println("Five");
                }
                if (n == 6) {
                    System.out.println("Six");
                }
                if (n == 7) {
                    System.out.println("Seven");
                }
                if (n == 8) {
                    System.out.println("Eight");
                }
                if (n == 9) {
                    System.out.println("Nine");
                }
                number /= 10;
            }
        }
    }

    public static int reverse(int number) {

        int lastDigit;
        int reverseNumber = 0;

        while (number != 0) {

            lastDigit = number % 10;
            reverseNumber += lastDigit;
            reverseNumber *= 10;
            number /= 10;
        }

        reverseNumber /= 10;

        return reverseNumber;
    }

    public static int getDigitCount(int number) {

        int n = 0;

        if (number < 0) {
            return -1;
        }
        else if (number == 0) {
            return 1;
        }
        else {
            while (number != 0) {
                n++;
                number /= 10;
            }
        }
        return n;
    }
}
