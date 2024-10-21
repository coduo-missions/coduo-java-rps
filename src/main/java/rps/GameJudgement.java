package rps;

public class GameJudgement {
    public static final int WIN = 1;
    public static final int LOSE = -1;
    public static final int DRAW = 0;
    public static final int judge(RPS user, RPS computer) {
        if (user.equals(computer)) {
            return DRAW;
        }
        if (user.equals(RPS.SCISSORS)) {
            if (computer.equals(RPS.ROCK)) return LOSE;
        }
        if (user.equals(RPS.ROCK)){
            if (computer.equals(RPS.PAPER)) return LOSE;
        }
        if (user.equals(RPS.PAPER)){
            if (computer.equals(RPS.SCISSORS)) return LOSE;
        }
        return WIN;
    }
}
