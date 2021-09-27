package utils;

import racingcar.Car;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class GameResult {

    public static List<Car> outputMaxPosition(List<Car> carList) {
        int maxPosition = carList.stream().mapToInt(x -> x.getPosition()).max().getAsInt();
        return carList.stream().filter(x -> x.getPosition() == maxPosition).collect(Collectors.toList());
    }
}
