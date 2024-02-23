package strategy;

import strategy.strategies.NoMoviment;

public class Robot {
    private MovementStrategy movementStrategy = new NoMoviment();

    public void move() {
        movementStrategy.move();
    }

    public void setMovementStrategy(MovementStrategy strategy) {
        movementStrategy = strategy;
    }
}
