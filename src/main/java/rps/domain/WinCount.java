package rps.domain;

public class WinCount {
    private final int MINNMUM_NUMBER_OF_WINS = 1;
    private final int MAXNMUM_NUMBER_OF_WINS = 5;

    private int numberOfWins = 0;

    public WinCount(int number) {
        validateNumberOfWinsRange(number);
        numberOfWins = number;
    }

    private void validateNumberOfWinsRange(int number) {
        if (number < MINNMUM_NUMBER_OF_WINS || number > MAXNMUM_NUMBER_OF_WINS) {
            throw new IllegalArgumentException("[ERROR] 승리횟수는" + MINNMUM_NUMBER_OF_WINS + "~" + MAXNMUM_NUMBER_OF_WINS + "사이 숫자여야 합니다.");
        }
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }
}
