package rps;

public class NumberOfWinsInTheGame {
    private static final int MINNMUM_NUMBER_OF_WINS = 1;
    private static final int MAXNMUM_NUMBER_OF_WINS = 5;

    private int numberOfWins;
    private int count;

    public NumberOfWinsInTheGame(int number) {
        validateNumberOfWinsRange(number);
        numberOfWins = number;
        count = 0;
    }

    private void validateNumberOfWinsRange(int number) {
        if (number < MINNMUM_NUMBER_OF_WINS || number > MAXNMUM_NUMBER_OF_WINS) {
            throw new IllegalArgumentException("[ERROR] 승리횟수는" + MINNMUM_NUMBER_OF_WINS + "~" + MAXNMUM_NUMBER_OF_WINS + "사이 숫자여야 합니다.");
        }
    }

    public void addCount() {
        count++;
    }

    public boolean isOver() {
        return numberOfWins != count;
    }
}
