package rps;

import rps.util.coduo.RandomTool;

public class RPSGameService {
    private NumberOfWinsInTheGame numberOfWinsInTheGame;

    public RPSGameService() {
        numberOfWinsInTheGame = null;
    }

    public boolean isOver() {
        return numberOfWinsInTheGame.isOver();
    }

    public String getResult(RPS selectedByUserRPS, RPS selectedByComputerRPS) {
        int judged = selectedByUserRPS.judgement(selectedByComputerRPS);
        addNumberOfWinsInTheGame(judged);
        if(judged == RPS.WIN) {
            return "당신이 승리했습니다!";
        }
        if(judged == RPS.DRAW) {
            return "무승부입니다!";
        }
        if(judged == RPS.LOSE) {
            return "상대방이 승리했습니다!";
        }
        return "";
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
            numberOfWinsInTheGame = new NumberOfWinsInTheGame(readNumberOfWins);
        }catch (Exception e) {
            throw e;
        }
        return numberOfWinsInTheGame;
    }

    public RPS getRPS(String input){
        if(input.equals("가위")) return RPS.SCISSORS;
        if(input.equals("바위")) return RPS.ROCK;
        if(input.equals("보")) return RPS.PAPER;
        throw new IllegalArgumentException("[ERROR] 가위, 바위, 보 중 하나를 입력하세요");
    }
}
