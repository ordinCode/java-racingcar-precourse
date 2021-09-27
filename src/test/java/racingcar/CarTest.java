package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @DisplayName("주사위에 따른 move테스트")
    @Test
    void name() {
        Car car = new Car("car");

        car.move(1);
        car.move(2);

        Assertions.assertThat(car.getPosition()).isEqualTo(0);

        car.move(4);
        Assertions.assertThat(car.getPosition()).isEqualTo(1);

        car.move(9);
        Assertions.assertThat(car.getPosition()).isEqualTo(2);
    }

    @Test
    @DisplayName("실행결과 출력 테스트")
    void resultOutputTest() {
        String carName = "car";
        Position position = new Position(2);
        Car car = new Car(carName, position);

        Assertions.assertThat(car.toString()).isEqualTo("car : --");
    }
}