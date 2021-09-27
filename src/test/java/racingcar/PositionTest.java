package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @ParameterizedTest
    @CsvSource(value = {"2,--", "4,----"})
    @DisplayName("자동차 포지션 테스트")
    void positionTest(int currentPostion, String result) {

        Position position = new Position(currentPostion);

        Assertions.assertThat(position.toString()).isEqualTo(result);
    }
}