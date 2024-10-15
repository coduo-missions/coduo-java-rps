package rps.domain;

import java.util.Objects;

public class Rps {
    private static final String ROCK = "바위";
    private static final String PAPER = "보";
    private static final String SCISSORS = "가위";
    private static final String INCORRECT_PRS_ERROR = "가위,바위,보 만 입력하세요";
    private static final int WIN_VALUE = 1;
    private static final int DRAW_VALUE = 0;
    private static final int LOSE_VALUE = -1;

    private final String rpsValue;

    public Rps(final String rpsValue) {
        validateRps(rpsValue);
        this.rpsValue = rpsValue;
    }

    private void validateRps(final String rpsValue) {
        if (!rpsValue.equals(ROCK) && !rpsValue.equals(PAPER) && !rpsValue.equals(SCISSORS)) {
            throw new IllegalArgumentException(INCORRECT_PRS_ERROR);
        }
    }

    public int determineGameResult(final Rps computer) {
        if (this.rpsValue.equals(computer.rpsValue)) {
            return DRAW_VALUE;
        }
        if (this.rpsValue.equals(ROCK) && computer.rpsValue.equals(PAPER)) {
            return LOSE_VALUE;
        }
        if (this.rpsValue.equals(SCISSORS) && computer.rpsValue.equals(ROCK)) {
            return LOSE_VALUE;
        }
        if (this.rpsValue.equals(PAPER) && computer.rpsValue.equals(SCISSORS)) {
            return LOSE_VALUE;
        }
        return WIN_VALUE;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Rps rps = (Rps) object;
        return Objects.equals(rpsValue, rps.rpsValue);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rpsValue);
    }
}
