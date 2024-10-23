package rps;

import rps.util.coduo.RandomTool;

public class RPSGameService {
    private final NumberOfWinsInTheGame numberOfWinsInTheGame;

    public RPSGameService(NumberOfWinsInTheGame numberOfWinsInTheGame) {
        this.numberOfWinsInTheGame = numberOfWinsInTheGame;
    }

    public boolean isOver() {
        return numberOfWinsInTheGame.isOver();
    }

    public int getResult(RPS selectedByUserRPS, RPS selectedByComputerRPS) {
        int judged = selectedByUserRPS.judgement(selectedByComputerRPS);
        addNumberOfWinsInTheGame(judged);
        return judged;
    }

    private void addNumberOfWinsInTheGame(int judged) {
        if(judged == RPS.WIN) numberOfWinsInTheGame.addCount();
    }

    public RPS getRandomRPS() {
        String random = RandomTool.pickRSP();
        if (random.equals("rock")) return RPS.ROCK;
        if (random.equals("paper")) return RPS.PAPER;
        return RPS.SCISSORS;
    }

    public NumberOfWinsInTheGame readWinCount(int readNumberOfWins) {
        try {
            return new NumberOfWinsInTheGame(readNumberOfWins);
        }catch (Exception e) {
            throw e;
        }
    }

    public RPS getRPS(String input){
        if(input.equals("가위")) return RPS.SCISSORS;
        if(input.equals("바위")) return RPS.ROCK;
        if(input.equals("보")) return RPS.PAPER;
        throw new IllegalArgumentException("[ERROR] 가위, 바위, 보 중 하나를 입력하세요");
    }
}
