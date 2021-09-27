package racingcar;

import utils.RandomUtils;

import java.util.List;

public class CarGame {
    private int tryCount;
    private List<Car> cars;

    public CarGame(int tryCount, List<Car> cars) {
        this.tryCount = tryCount;
        this.cars = cars;
    }

    public void run() {
        for (int i = 0; i < tryCount; i++) {
            loop();
        }
    }

    private void loop() {
        cars.forEach(car -> car.move(RandomUtils.nextInt(0, 9)));
    }
}
