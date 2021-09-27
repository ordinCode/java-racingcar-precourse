package utils;

import racingcar.Car;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class GameResult {
    private List<Car> winner;

    public GameResult(List<Car> winner) {
        this.winner = outputMaxPosition(winner);
    }

    public List<Car> outputMaxPosition(List<Car> carList) {
        int maxPosition = carList.stream().mapToInt(x -> x.getPosition()).max().getAsInt();
        return carList.stream().filter(x -> x.getPosition() == maxPosition).collect(Collectors.toList());
    }

    public String toStringWinner() {
        List<String> names = winner.stream()
                .map(Car::getName)
                .collect(Collectors.toList());
        return String.join(", ", names);
    }

    public List<Car> getWinner() {
        return winner;
    }
}
