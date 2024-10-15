package rps;

import rps.domain.WinningCount;
import rps.view.InputView;

public class Application {

    public static void main(String[] args) {
        final WinningCount winningCount = new WinningCount(InputView.inputWinningCount());
    }
}
