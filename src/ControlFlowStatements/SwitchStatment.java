package ControlFlowStatements;

public class SwitchStatment {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 4;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("It was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;
        }

        char switchChar = 'A';

        switch(switchChar) {

            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("It was A, B, C, D or E");
                System.out.println("Actually it was " + switchChar);
                break;

            default:
                System.out.println("It was not A, B, C, D or E");
                System.out.println("Actually it was " + switchChar);
                break;
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("jan");
                break;
            case "june":
                System.out.println("jun");
                break;

                default:
                    System.out.println("not sure");
                    break;

        }


    }

}

