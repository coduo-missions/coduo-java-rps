package rps.view;

import rps.util.coduo.Console;

public class InputView {
    private static final String GAME_START_MESSAGE = "가위바위보 게임을 시작합니다.";
    private static final String INPUT_WINNING_COUNT_MESSAGE = "승리를 위한 횟수를 입력하세요: ";
    private static final String NUMBER_VALUE_ERROR_MESSAGE = "숫자값만 입력하세요.";
    private static final String INPUT_RPS_MESSAGE = "가위, 바위, 보 중 하나를 입력하세요: ";

    public InputView() {
    }

    public static int inputWinningCount() {
        System.out.println(GAME_START_MESSAGE);
        System.out.println();
        System.out.print(INPUT_WINNING_COUNT_MESSAGE);
        String inputValue = Console.input();
        validateNumber(inputValue);
        return Integer.parseInt(inputValue);
    }

    private static void validateNumber(final String inputValue) {
        try {
            Integer.parseInt(inputValue);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NUMBER_VALUE_ERROR_MESSAGE);
        }
    }

    public static String inputRps() {
        System.out.print(INPUT_RPS_MESSAGE);
        String inputValue = Console.input();
        System.out.println();
        return inputValue;
    }

}
