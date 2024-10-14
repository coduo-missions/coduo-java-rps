package rps;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import rps.util.model.Computer;
import rps.util.view.InputView;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;

public class AppTest {

    @Test
    public void 컴퓨터_생성_테스트() {
        Computer com = new Computer();
        List<String> list = Arrays.asList("가위", "바위", "보");
        Assertions.assertThat(list).contains(com.peekRSP().getKorRsp());
    }

    @Test
    public void 승리횟수_예외_입력_테스트() {
        InputView inputView = new InputView();
        System.setIn(new ByteArrayInputStream("32ㅇ".getBytes()));
        Assertions.assertThatThrownBy(() -> inputView.input()).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 승리횟수_정상_입력_테스트() {
        InputView inputView = new InputView();
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        org.junit.jupiter.api.Assertions.assertDoesNotThrow(() -> {
            inputView.input();
        });
    }

    @Test
    public void 가위바위보_예외_입력_테스트() {
        InputView inputView = new InputView();
        System.setIn(new ByteArrayInputStream("r위".getBytes()));
        Assertions.assertThatThrownBy(() -> inputView.userChoice()).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 가위바위보_정상_입력_테스트() {
        InputView inputView = new InputView();
        System.setIn(new ByteArrayInputStream("가위".getBytes()));
        org.junit.jupiter.api.Assertions.assertDoesNotThrow(() -> {
            inputView.userChoice();
        });
    }
}
