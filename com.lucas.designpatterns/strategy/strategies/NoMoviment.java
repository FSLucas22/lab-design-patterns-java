package strategy.strategies;

import strategy.MovementStrategy;

/**
 * Sem movimento
 *
 * @author Lucas F.S.
 */
public class NoMoviment implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Cannot move...");
    }
}
