package rps.util.model;

import rps.util.coduo.RandomTool;

public class Computer {

    private RPS rspValue;

    public Computer() {
        String value = RandomTool.pickRSP();
        if (value.equals("scissors")) rspValue = RPS.SCISSOR;
        if (value.equals("rock")) rspValue = RPS.ROCK;
        if (value.equals("paper")) rspValue = RPS.PAPER;
    }
    public RPS peekRSP() {
        return rspValue;
    }
}
