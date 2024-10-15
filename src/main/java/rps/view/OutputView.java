package rps.view;

import rps.domain.Rps;

public class OutputView {
    private static final String COMPUTER_RPS_MESSAGE = "상대방은 %s를 제출했습니다. ";
    private static final String LOSE_MESSAGE = "상대방이 승리했습니다!";
    private static final String DRAW_MESSAGE = "무승부입니다!";
    private static final String WIN_MESSAGE = "당신이 승리했습니다!";
    private static final String END_MESSAGE = "가위바위보 게임을 승리했습니다! 게임 종료";

    public OutputView() {
    }

    public static void printRpsResult(final Rps user, final Rps computer) {
        System.out.printf(COMPUTER_RPS_MESSAGE, computer.getRpsValue());
        printWinOrLose(user, computer);
    }

    private static void printWinOrLose(final Rps user, final Rps computer) {
        if (user.determineGameResult(computer) == 1) {
            System.out.println(WIN_MESSAGE);
        }
        if (user.determineGameResult(computer) == 0) {
            System.out.println(DRAW_MESSAGE);
        }
        if (user.determineGameResult(computer) == -1) {
            System.out.println(LOSE_MESSAGE);
        }
        System.out.println();
    }

    public static void printEndMessage() {
        System.out.println(END_MESSAGE);
    }
}
