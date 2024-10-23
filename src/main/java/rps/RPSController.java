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
        gameService = new RPSGameService();
        readWinCount();

        while (gameService.isOver()) {
            playRPS();
        }

        outputView.printEndMessage();
    }

    private void readWinCount() {
        outputView.printReadNumberOfWinsMessage();
        int readNumberOfWins = inputView.readNumberOfWins();
        NumberOfWinsInTheGame numberOfWinsInTheGame = gameService.readWinCount(readNumberOfWins);
        if(numberOfWinsInTheGame == null){
            throw new IllegalArgumentException("[ERROR] 승리횟수는 숫자여야 합니다.");
        }
    }

    private void playRPS() {
        outputView.printReadRPSMessage();
        try {
            String readRPS = inputView.readRPS();
            RPS selectedByUserRPS = gameService.getRPS(readRPS);
            RPS selectedByComputerRPS = gameService.getRandomRPS();
            String result = gameService.getResult(selectedByUserRPS, selectedByComputerRPS);
            outputView.printResult(selectedByComputerRPS, result);
        }catch (Exception e) {
            outputView.printException(e.getMessage());
        }
    }
}
