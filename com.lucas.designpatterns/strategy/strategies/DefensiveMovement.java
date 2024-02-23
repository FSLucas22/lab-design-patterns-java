package strategy.strategies;

import strategy.MovementStrategy;

/**
 * Movimento defensivo
 *
 * @author falvojr
 */
public class DefensiveMovement implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Moving defensively...");
    }
}
