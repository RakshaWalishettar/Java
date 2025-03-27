package Assign.parameter.com;

public class Cup {
    void won(India india) {
        if (india != null) {
            india.playMatch();
            india.practice();
            System.out.println("India won the Cup!");
        } else {
            System.out.println("No India team available to play.");
        }
    }
}
