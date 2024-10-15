package rps.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class WinningCountTest {
    @Test
    void 승리횟수_생성() {
        WinningCount winningCount = new WinningCount(2);
        assertThat(winningCount).isNotNull();
    }

    @Test
    void 승리횟수_검증() {
        assertThatThrownBy(() -> new WinningCount(-1))
                .isInstanceOf(IllegalArgumentException.class);
    }

}