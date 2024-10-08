package rps;

import static org.assertj.core.api.Assertions.assertThat;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;

import org.junit.jupiter.api.Test;

import camp.nextstep.edu.missionutils.test.NsTest;

class ApplicationTest extends NsTest {

    @Test
    void 게임_규칙_테스트() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("2", "보", "바위", "가위", "보", "바위", "가위", "보", "바위", "가위");
                    assertThat(output()).contains(
                            "무승부입니다!",
                            "무승부입니다!",
                            "무승부입니다!",
                            "상대방이 승리했습니다!",
                            "상대방이 승리했습니다!",
                            "상대방이 승리했습니다!",
                            "당신이 승리했습니다!",
                            "당신이 승리했습니다!",
                            "당신이 승리했습니다!",
                            "가위바위보 게임을 승리했습니다! 게임 종료"
                    );
                },
                3, 1, 2, 2, 3, 1, 1, 2, 3
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
