package utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.Car;
import racingcar.Position;

import java.util.ArrayList;
import java.util.Arrays;
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

        GameResult gameResult = new GameResult(carList);
        List<Car> winnerList = gameResult.getWinner();

        Assertions.assertThat(winnerList.get(0).getName()).isEqualTo(car2Name);
    }

    @DisplayName("우승자를 스트링으로 변환하는 기능 테스트")
    @Test
    void name() {
        //given
        List<Car> cars = Arrays.asList(
                new Car("name1",new Position(3)),
                new Car("name2",new Position(5)),
                new Car("name3",new Position(5)),
                new Car("name4",new Position(5)),
                new Car("name5",new Position(1))
        );
        GameResult gameResult = new GameResult(cars);

        //when
        String actual = gameResult.toStringWinner();

        //then
        Assertions.assertThat(actual).isEqualTo("name2, name3, name4");
    }
}