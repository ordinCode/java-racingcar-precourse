package racingcar;

import utils.GameResult;
import utils.RandomUtils;

import java.util.List;

public class CarGame {
    private final int tryCount;
    private final List<Car> cars;

    public CarGame(int tryCount, List<Car> cars) {
        this.tryCount = tryCount;
        this.cars = cars;
    }

    public void run() {
        for (int i = 0; i < tryCount; i++) {
            loop();
        }

        printResult();
    }

    private void loop() {
        cars.forEach(car -> car.move(RandomUtils.nextInt(0, 9)));
        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : cars) {
            stringBuilder.append(car.toString()).append("\n");
        }
        System.out.println(stringBuilder);
    }

    private void printResult() {
        GameResult gameResult = new GameResult(cars);
        System.out.println("result: " + gameResult.toStringWinner());
    }
}
