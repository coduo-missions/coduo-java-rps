package rps.view;

public class OutputView {
    private final String START_MESSAGE = "가위바위보 게임을 시작합니다.";

    public void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public void printException(String message) {
        System.out.println(message);
    }
}
