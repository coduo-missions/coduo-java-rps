package rps.view;

import rps.RPS;

public class OutputView {
    private final String START_MESSAGE = "가위바위보 게임을 시작합니다.\n";
    private final String END_MESSAGE= "가위바위보 게임을 승리했습니다! 게임 종료";

    public void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public void printException(String message) {
        System.out.println(message);
    }

    public void printResult(RPS selectedByComputerRPS, int judge) {
        String result = "상대방은 "+selectedByComputerRPS.getKorRPS()+"를 제출 했습니다. ";
        if(judge == 1) {
            result = result + "상대방이 승리했습니다!";
        }
        if(judge == 0) {
            result = result + "무승부입니다!";
        }
        if(judge == -1) {
            result = result + "당신이 승리했습니다!";
        }
        System.out.println(result + "\n");

    }

    public void printEndMessage() {
        System.out.println(END_MESSAGE);
    }
}
