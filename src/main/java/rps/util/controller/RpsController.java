package rps.util.controller;

import rps.util.ErrorMessage;
import rps.util.coduo.RandomTool;
import rps.util.model.Computer;
import rps.util.model.Judge;
import rps.util.model.User;
import rps.util.view.InputView;
import rps.util.view.OutputView;

public class RpsController {

    private final InputView inputView = new InputView();

    public void game() {
        int userRound = validateWinValue(inputView.input());

        while (userRound != 0) {
            User user = new User(inputView.userChoice());
            Computer com = comChoice();
            int winner = Judge.judge(com, user);
            if (winner >= 1) {
                userRound--;
            }
            OutputView.showWinner(user, com, winner);
        }
    }

    private Computer comChoice() {
        return new Computer(RandomTool.pickRSP());
    }

    public int validateWinValue(String value) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.USER_WRONG_WIN_INPUT);
        }
        if (Integer.parseInt(value) > 5 || Integer.parseInt(value) <= 0) {
            throw new IllegalArgumentException(ErrorMessage.USER_WRONG_WIN_INPUT);
        }
        return Integer.parseInt(value);
    }
}
