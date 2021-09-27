package racingcar;

import java.util.stream.IntStream;

public class Position {

    private int position;

    public Position() {
        this.position = 0;
    }

    public Position(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        this.position++;
    }

    @Override
    public String toString() {
        StringBuilder posi = new StringBuilder();
        IntStream.range(0, position)
                .forEach(x -> posi.append("-"));

        return posi.toString();
    }
}
