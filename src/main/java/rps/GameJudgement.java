package rps;

public class GameJudgement {
    public static int judge(RPS left, RPS right) {
        if (left.equals(right)) {
            return 0;
        }
        if (left.equals(RPS.SCISSORS)) {
            if (right.equals(RPS.ROCK)) return -1;
        }
        if (left.equals(RPS.ROCK)){
            if (right.equals(RPS.PAPER)) return -1;
        }
        if (left.equals(RPS.PAPER)){
            if (right.equals(RPS.SCISSORS)) return -1;
        }
        return 1;
    }
}
