package rps.util.model;

public class Computer {

    private RPS rpsValue;

    public Computer(String rsp) {
        if (rsp.equals("scissors")) rpsValue = RPS.SCISSOR;
        if (rsp.equals("rock")) rpsValue = RPS.ROCK;
        if (rsp.equals("paper")) rpsValue = RPS.PAPER;
    }
    public RPS peekRSP() {
        return rpsValue;
    }
}
