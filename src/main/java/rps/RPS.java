package rps;

import java.util.function.BiFunction;
import java.util.function.Function;

public enum RPS {
    ROCK("바위", "rock"),
    PAPER("보", "paper"),
    SCISSORS("가위", "scissors");

    public static final int WIN = 1;
    public static final int LOSE = -1;
    public static final int DRAW = 0;

    private final String koreanRPS;
    private final String englishRPS;

    private RPS(String korRPS, String engRPS) {
        this.koreanRPS = korRPS;
        this.englishRPS = engRPS;
    }

    public String getKorRPS() {
        return koreanRPS;
    }

    public Integer judge(RPS rps) {
        if(darwCheck(rps)){
            return DRAW;
        }
        if(winCheck(rps)){
            return WIN;
        }
        return LOSE;
    }

    private boolean darwCheck(RPS rps) {
        if (this.equals(rps)){
            return true;
        }
        return false;
    }
    private boolean winCheck(RPS rps) {
        if (this.equals(RPS.PAPER) && rps.equals(RPS.ROCK)) {
            return true;
        }
        if (this.equals(RPS.ROCK) && rps.equals(RPS.SCISSORS)) {
            return true;
        }
        if (this.equals(RPS.SCISSORS) && rps.equals(RPS.PAPER)) {
            return true;
        }
        return false;
    }
}
