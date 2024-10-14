package rps.util.view;

import rps.util.model.Computer;
import rps.util.model.User;

public class OutputView {

    private static final String START_MESSAGE = "가위바위보 게임을 시작합니다.\n";
    private static final String END_MESSAGE = "\n가위바위보 게임을 승리했습니다! 게임 종료";

    public static void gameStart() {
        System.out.println(START_MESSAGE);
    }

    public static void showWinner(User user, Computer com, int winner) {
        String message = "상대방은 " + com.peekRSP().getKorRsp() + "를 제출했습니다. ";
        if (winner >= 1) {
            message += "당신이 승리했습니다!";
        }
        if (winner == 0) {
            message += "무승부입니다!";
        }
        if (winner <= -1) {
            message += "상대방이 승리했습니다!";
        }
        System.out.println(message);
    }

    public static void gameEnd() {
        System.out.println(END_MESSAGE);
    }
}
