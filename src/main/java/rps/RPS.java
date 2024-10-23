package rps;

import java.util.function.BiFunction;

public enum RPS {
    ROCK("바위", "rock", (user,computer)-> user.judge(computer)),
    PAPER("보", "paper",(user,computer)-> user.judge(computer)),
    SCISSORS("가위", "scissors",(user,computer)-> user.judge(computer));

    public static final int WIN = 1;
    public static final int LOSE = -1;
    public static final int DRAW = 0;

    private final String koreanRPS;
    private final String englishRPS;
    private final BiFunction<RPS, RPS, Integer> rpsFunction;

    private RPS(String korRPS, String engRPS, BiFunction<RPS, RPS, Integer> rpsFunction) {
        this.koreanRPS = korRPS;
        this.englishRPS = engRPS;
        this.rpsFunction = rpsFunction;
    }

    public String getKorRPS() {
        return koreanRPS;
    }
    public Integer judgement(RPS computer) {
        return rpsFunction.apply(this,computer);
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
