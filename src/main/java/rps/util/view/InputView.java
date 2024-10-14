package rps.util.view;

import rps.util.coduo.Console;
import rps.util.model.User;

public class InputView {

    private final String USER_WRONG_INPUT = "잘못된 입력입니다.";
    private final String USER_WIN_INPUT_QUESTION = "승리를 위한 횟수를 입력하세요: ";
    private final String USER_CHOICE_INPUT_QUESTION = "가위, 바위, 보 중 하나를 입력하세요: ";

    public int input() {
        System.out.print(USER_WIN_INPUT_QUESTION);
        return validateWinValue(Console.input());
    }

    public User userChoice() {
        System.out.print(USER_CHOICE_INPUT_QUESTION);
        return new User(validateRspValue(Console.input()));
    }

    public int validateWinValue(String value) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(USER_WRONG_INPUT);
        }

        if (Integer.parseInt(value) > 5) {
            throw new IllegalArgumentException(USER_WRONG_INPUT);
        }

        return Integer.parseInt(value);
    }

    public String validateRspValue(String value) {
        if (!(value.equals("가위") || value.equals("바위") || value.equals("보"))) {
            throw new IllegalArgumentException(USER_WRONG_INPUT);
        }

        return value;
    }
}
