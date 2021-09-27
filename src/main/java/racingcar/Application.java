package racingcar;

import inputview.InputView;
import utils.Splitor;

import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        String carNames = InputView.inputCarNames();
        int tryCount = InputView.inputTryCount();

        List<String> names = Splitor.split(carNames);
        List<Car> cars = names.stream()
                .map(Car::new)
                .collect(Collectors.toList());

        CarGame carGame = new CarGame(tryCount, cars);
        carGame.run();
    }
}
