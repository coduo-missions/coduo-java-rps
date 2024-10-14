package rps.util.model;

import rps.util.ErrorMessage;

public class User {

    private RPS rpsValue;

    public User(String rpsValue) {
        String value = validateRspValue(rpsValue);
        if (value.equals("가위")) this.rpsValue = RPS.SCISSOR;
        if (value.equals("바위")) this.rpsValue = RPS.ROCK;
        if (value.equals("보")) this.rpsValue = RPS.PAPER;
    }

    public RPS peekRSP() {
        return rpsValue;
    }

    private String validateRspValue(String value) {
        if (!(value.equals("가위") || value.equals("바위") || value.equals("보"))) {
            throw new IllegalArgumentException(ErrorMessage.USER_WRONG_RPS_INPUT);
        }

        return value;
    }
}
