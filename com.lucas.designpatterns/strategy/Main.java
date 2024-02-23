package strategy;

import strategy.strategies.AgressiveMovement;
import strategy.strategies.DefensiveMovement;
import strategy.strategies.NormalMovement;

public class Main {
    public static void main(String ... args) {
        var robot = new Robot();
        robot.move();
        robot.setMovementStrategy(new NormalMovement());
        robot.move();
        robot.setMovementStrategy(new DefensiveMovement());
        robot.move();
        robot.setMovementStrategy(new AgressiveMovement());
        robot.move();
    }
}
