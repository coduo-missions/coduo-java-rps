package rps.view;

import rps.util.coduo.Console;

public class InputView {
    public int readNumberOfWins() {
        System.out.print("승리를 위한 횟수를 입력하세요: ");
        try {
            String input = Console.input();
            System.out.println();
            int i = Integer.parseInt(input);
            return i;
        }catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] 승리횟수는 숫자여야 합니다.");
        }
    }

    public String readRPS() {
        System.out.print("가위, 바위, 보 중 하나를 입력하세요: ");
        String input = Console.input();
        input = input.trim();
        if(input.equals("가위")) return input;
        if(input.equals("바위")) return input;
        if(input.equals("보")) return input;
        throw new IllegalArgumentException("[ERROR] 가위, 바위, 보 중 하나를 입력하세요");
    }
}
