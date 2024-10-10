package rps;

import rps.domain.NumberOfWinsInTheGame;
import rps.util.coduo.RandomTool;
import rps.view.InputView;
import rps.view.OutputView;

public class RPSController {

    private InputView inputView;
    private OutputView outputView;

    private NumberOfWinsInTheGame numberOfWinsInTheGame;

    public RPSController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void start() {
        outputView.printStartMessage();
        readWinCount();
        playRPS();
    }

    private void playRPS() {
        try {
            String selectedByUserRPS = inputView.readRPS();
            String selectedByComputerRPS = RandomTool.pickRSP();
            int judged = Judgment.judge(selectedByUserRPS, selectedByComputerRPS);
            outputView.printResult(selectedByComputerRPS, judged);
        }catch (Exception e) {
            outputView.printException(e.getMessage());
        }

    }

    private void readWinCount() {
        int tmp;
        try {
            tmp = inputView.readNumberOfWins();
            numberOfWinsInTheGame = new NumberOfWinsInTheGame(tmp);
        }catch (Exception e) {
            outputView.printException(e.getMessage());
        }
    }
}
