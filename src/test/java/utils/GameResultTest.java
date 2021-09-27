package utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.Car;
import racingcar.Position;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameResultTest {

    @Test
    @DisplayName("Car리스트중 maxPosition값 구하기")
    void extractMaxPositionTest() {
        List<Car> carList = new ArrayList<>();
        String car1Name = "car1";
        Position position1 = new Position(3);
        Car car1 = new Car(car1Name, position1);

        String car2Name = "car2";
        Position position2 = new Position(8);
        Car car2 = new Car(car2Name, position2);
        carList.add(car1);
        carList.add(car2);

        List<Car> winnerList = GameResult.outputMaxPosition(carList);

        Assertions.assertThat(winnerList.get(0).getName()).isEqualTo(car2Name);
    }
}