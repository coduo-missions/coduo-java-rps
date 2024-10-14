package rps.util.model;

public class User {

    private RPS rspValue;

    public User(String rspValue) {
        if (rspValue.equals("가위")) this.rspValue = RPS.SCISSOR;
        if (rspValue.equals("바위")) this.rspValue = RPS.ROCK;
        if (rspValue.equals("보")) this.rspValue = RPS.PAPER;
    }

    public RPS peekRSP() {
        return rspValue;
    }
}
