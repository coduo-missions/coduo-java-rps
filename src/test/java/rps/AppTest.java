package rps;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import rps.util.model.Computer;
import java.util.Arrays;
import java.util.List;

public class AppTest {

    @Test
    public void 컴퓨터_생성_테스트() {
        Computer com = new Computer();
        List<String> list = Arrays.asList("가위", "바위", "보");
        Assertions.assertThat(list).contains(com.peekRSP().getKorRsp());
    }
}
