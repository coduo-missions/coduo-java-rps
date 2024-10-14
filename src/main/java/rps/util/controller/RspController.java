package rps.util.controller;

import rps.util.model.Computer;
import rps.util.model.User;
import rps.util.view.InputView;
import rps.util.view.OutputView;

public class RspController {

    InputView inputView = new InputView();
    Computer com;
    User user;

    public void game() {
        int userRound = inputView.input();

        while (userRound != 0) {
            user = inputView.userChoice();
            com = comChoice();
            int winner = whoIsWin();
            if (winner >= 1) {
                userRound--;
            }
            OutputView.showWinner(user, com, winner);
        }

        OutputView.gameEnd();
    }

    private Computer comChoice() {
        return new Computer();
    }

    private int whoIsWin() {
        if (com.peekRSP().getKorRsp().equals(user.peekRSP().getKorRsp())) {
            return 0;
        }
        if (com.peekRSP().getKorRsp().equals("가위") && user.peekRSP().getKorRsp().equals("보")) {
            return -1;
        }
        if (com.peekRSP().getKorRsp().equals("바위") && user.peekRSP().getKorRsp().equals("가위")) {
            return -1;
        }
        if (com.peekRSP().getKorRsp().equals("보") && user.peekRSP().getKorRsp().equals("바위")) {
            return -1;
        }
        return 1;
    }
}
