package rps;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import rps.util.coduo.RandomTool;
import rps.util.model.Computer;
import rps.util.model.Judge;
import rps.util.model.User;

import java.util.Arrays;
import java.util.List;

public class AppTest {

    @Test
    public void 컴퓨터_생성_테스트() {
        Computer com = new Computer(RandomTool.pickRSP());
        List<String> list = Arrays.asList("가위", "바위", "보");
        Assertions.assertThat(list).contains(com.peekRSP().getKorRsp());
    }

    @Test
    public void 유저_입력_예외_테스트() {
        Assertions.assertThatThrownBy(() -> {
                    User user = new User("거위");
                }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 유저_입력_정상_테스트() {
        Assertions.assertThat(new User("가위"))
                .isInstanceOf(User.class);
    }

    @ParameterizedTest
    @CsvSource(value = {"가위:paper", "바위:scissors", "보:rock"}, delimiter = ':')
    public void 유저_승() {
        User user = new User("가위");
        Computer com = new Computer("paper");

        Assertions.assertThat(Judge.judge(com, user)).isEqualTo(Judge.USER_WIN);
    }

    @ParameterizedTest
    @CsvSource(value = {"가위:rock", "바위:paper", "보:scissors"}, delimiter = ':')
    public void 컴퓨터_승(String userValue, String comValue) {
        User user = new User(userValue);
        Computer com = new Computer(comValue);

        Assertions.assertThat(Judge.judge(com, user)).isEqualTo(Judge.COMPUTER_WIN);
    }

    @ParameterizedTest
    @CsvSource(value = {"가위:scissors", "바위:rock", "보:paper"}, delimiter = ':')
    public void 비김(String userValue, String comValue) {
        User user = new User(userValue);
        Computer com = new Computer(comValue);
        Assertions.assertThat(Judge.judge(com, user)).isEqualTo(Judge.DRAW);
    }
}
