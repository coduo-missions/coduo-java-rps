package rps;


import rps.view.InputView;
import rps.view.OutputView;

public class RPSController {
    private final InputView inputView;
    private final OutputView outputView;
    private RPSGameService gameService;

    public RPSController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void start() {
        outputView.printStartMessage();
        NumberOfWinsInTheGame numberOfWinsInTheGame = readWinCount();
        gameService = new RPSGameService(numberOfWinsInTheGame);

        while (gameService.isOver()) {
            playRPS();
        }

        outputView.printEndMessage();
    }

    private NumberOfWinsInTheGame readWinCount() {
        int readNumberOfWins = inputView.readNumberOfWins();
        NumberOfWinsInTheGame numberOfWinsInTheGame = gameService.readWinCount(readNumberOfWins);
        if(numberOfWinsInTheGame == null){
            throw new IllegalArgumentException("[ERROR] 승리횟수는 숫자여야 합니다.");
        }

        return numberOfWinsInTheGame;
    }

    private void playRPS() {
        try {
            RPS selectedByUserRPS = inputView.readRPS();
            RPS selectedByComputerRPS = gameService.getRandomRPS();
            int result = gameService.getResult(selectedByUserRPS, selectedByComputerRPS);
            outputView.printResult(selectedByComputerRPS, result);
        }catch (Exception e) {
            outputView.printException(e.getMessage());
        }
    }
}
