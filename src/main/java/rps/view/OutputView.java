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

    public void printResult(RPS selectedByComputerRPS, String  judge) {
        String result = "상대방은 "+selectedByComputerRPS.getKorRPS()+"를 제출 했습니다. " + judge;
        System.out.println(result);
        System.out.println();
    }

    public void printEndMessage() {
        System.out.println(END_MESSAGE);
    }

    public void printReadNumberOfWinsMessage() {
        System.out.print("승리를 위한 횟수를 입력하세요: ");
    }

    public void printReadRPSMessage() {
        System.out.print("가위, 바위, 보 중 하나를 입력하세요: ");
    }
}
