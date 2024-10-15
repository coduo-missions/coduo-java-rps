package rps.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RpsTest {
    @ParameterizedTest
    @ValueSource(strings = {"가위", "바위", "보"})
    void 가위바위보_생성(String value) {
        Rps rps = new Rps(value);
        assertThat(rps).isNotNull();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "다른값", "이건어때"})
    void 가위바위보_검증(String value) {
        assertThatThrownBy(() -> new Rps(value))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 가위바위보_승리_확인() {
        Rps rps = new Rps("바위");
        Rps computer = new Rps("가위");
        assertThat(rps.determineGameResult(computer)).isEqualTo(1);
    }

}