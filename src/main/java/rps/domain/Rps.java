package rps.domain;

public class Rps {
    private static final String ROCK = "바위";
    private static final String PAPER = "보";
    private static final String SCISSORS = "가위";
    private static final String INCORRECT_PRS_ERROR = "가위,바위,보 만 입력하세요";

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
}
