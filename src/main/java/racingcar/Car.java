package racingcar;

public class Car {
    public static final int MIN_NUMBER_TO_MOVE = 4;

    private final String name;
    private final Position position;

    public Car(String name) {
        this.name = name;
        this.position = new Position();
    }

    public Car(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public void move(int randomNumber) {
        if (randomNumber >= MIN_NUMBER_TO_MOVE) {
            position.move();
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position.getPosition();
    }
}
