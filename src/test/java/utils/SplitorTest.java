package utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SplitorTest {

    @DisplayName(",기준으로 name split 테스트")
    @ParameterizedTest
    @CsvSource(value = {"a,b,car|a|b|car", "a, bad,be |a|bad|be"}, delimiterString = "|")
    void name(String names, String result1, String result2, String result3) {
        List<String> split = Splitor.split(names);

        Assertions.assertThat(split.get(0)).isEqualTo(result1);
        Assertions.assertThat(split.get(1)).isEqualTo(result2);
        Assertions.assertThat(split.get(2)).isEqualTo(result3);
    }
}