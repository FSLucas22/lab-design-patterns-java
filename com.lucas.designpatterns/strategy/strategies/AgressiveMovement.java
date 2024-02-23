package strategy.strategies;

import strategy.MovementStrategy;

/**
 * Movimento agressivo
 *
 * @author falvojr
 */
public class AgressiveMovement implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Moving agressively...");
    }
}
