package rps;

import rps.util.controller.RspController;
import rps.util.view.OutputView;

public class Application {

    private static RspController controller = new RspController();

    public static void main(String[] args) {
        // TODO : 기능 구현
        OutputView.gameStart();
        controller.game();
    }
}