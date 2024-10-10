package rps.view;

import rps.util.coduo.Console;

public class InputView {
    public int readNumberOfWins() {
        try {
            String input = Console.input();
            int i = Integer.parseInt(input);
            return i;
        }catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] 승리횟수는 숫자여야 합니다.");
        }
    }
}
