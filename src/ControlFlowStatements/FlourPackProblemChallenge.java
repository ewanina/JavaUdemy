package ControlFlowStatements;

public class FlourPackProblemChallenge {

    public static void main(String[] args) {

        System.out.println(canPack(1,5,4));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        int result = 0;
        result += bigCount * 5;
        result += smallCount;
        while(result > goal){
            if(result - 5 >= goal && bigCount > 0){
                result -= 5;
                bigCount -= 1;
            }
            else if(smallCount > 0 && result - 5 < goal){
                result -= 1;
                smallCount -= 1;
            }
            else{
                break;
            }
        }
        return result == goal;
    }
}
