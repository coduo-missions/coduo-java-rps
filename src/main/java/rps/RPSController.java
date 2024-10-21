package rps;

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
        while (numberOfWinsInTheGame.isOver()) {
            playRPS();
        }
        outputView.printEndMessage();
    }

    private void playRPS() {
        try {
            RPS selectedByUserRPS = inputView.readRPS();
            RPS selectedByComputerRPS = getRandomRPS();
            int judged = selectedByUserRPS.judge(selectedByComputerRPS);
            outputView.printResult(selectedByComputerRPS, judged);
            if(judged == RPS.WIN) numberOfWinsInTheGame.addCount();
        }catch (Exception e) {
            outputView.printException(e.getMessage());
        }
    }

    private RPS getRandomRPS() {
        String random = RandomTool.pickRSP();
        if (random.equals("rock")) return RPS.ROCK;
        if (random.equals("paper")) return RPS.PAPER;
        return RPS.SCISSORS;
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
