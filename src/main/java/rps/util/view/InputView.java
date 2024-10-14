package rps.util.view;

import rps.util.coduo.Console;

public class InputView {

    private static final String USER_WIN_INPUT_QUESTION = "승리를 위한 횟수를 입력하세요: ";
    private static final String USER_CHOICE_INPUT_QUESTION = "가위, 바위, 보 중 하나를 입력하세요: ";

    public String input() {
        System.out.print(USER_WIN_INPUT_QUESTION);
        return Console.input();
    }

    public String userChoice() {
        System.out.print(USER_CHOICE_INPUT_QUESTION);
        return Console.input();
    }


}
