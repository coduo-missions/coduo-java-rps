package rps.domain;

public class WinningCount {
    private static final int MIN_VALUE = 1;
    private static final String VALUE_ERROR_MESSAGE = "승리 횟수는 " + MIN_VALUE + "이상의 값만 입력가능합니다.";

    private final int winningCount;

    public WinningCount(final int winningCount) {
        validateValue(winningCount);
        this.winningCount = winningCount;
    }

    private void validateValue(final int winningCount) {
        if (winningCount < MIN_VALUE) {
            throw new IllegalArgumentException(VALUE_ERROR_MESSAGE);
        }
    }
}
