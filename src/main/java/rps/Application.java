package rps;

import rps.domain.Rps;
import rps.domain.WinningCount;
import rps.view.InputView;
import rps.view.OutputView;

public class Application {

    public static void main(String[] args) {
        final WinningCount winningCount = new WinningCount(InputView.inputWinningCount());
        int winCount = 0;

        while (!winningCount.isEnd(winCount)) {
            final Rps user = new Rps(InputView.inputRps());
            final Rps computer = Rps.computerRps();
            if (user.isWin(computer)) {
                winCount++;
            }
            OutputView.printRpsResult(user, computer);
        }
        OutputView.printEndMessage();
    }
}
