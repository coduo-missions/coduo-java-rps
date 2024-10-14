package rps;

import rps.util.controller.RpsController;
import rps.util.view.OutputView;

public class Application {

    private static final RpsController controller = new RpsController();

    public static void main(String[] args) {
        // TODO : 기능 구현
        OutputView.gameStart();
        controller.game();
        OutputView.gameEnd();
    }
}