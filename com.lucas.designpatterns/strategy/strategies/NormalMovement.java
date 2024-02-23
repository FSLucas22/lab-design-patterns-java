package strategy.strategies;

import strategy.MovementStrategy;

/**
 * Movimento normal
 *
 * @author falvojr
 */
public class NormalMovement implements MovementStrategy {

    @Override
    public void move() {
        System.out.println("Moving normally...");
    }
}
