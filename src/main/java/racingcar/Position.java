package racingcar;

import java.util.stream.IntStream;

public class Position {

    private int position;

    public Position(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        StringBuilder posi = new StringBuilder();
        IntStream.range(0,position)
                .forEach(x -> posi.append("-"));

        return posi.toString();
    }
}
