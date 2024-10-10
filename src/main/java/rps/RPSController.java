package rps;

import rps.domain.WinCount;
import rps.view.InputView;
import rps.view.OutputView;

public class RPSController {

    private InputView inputView;
    private OutputView outputView;

    private WinCount winCount;

    public RPSController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void play() {
        outputView.printStartMessage();
        readWinCount();
    }

    private void readWinCount() {
        int tmp;

        try {
            tmp = inputView.readNumberOfWins();
            winCount = new WinCount(tmp);
        }catch (Exception e) {
            outputView.printException(e.getMessage());
        }
    }
}
