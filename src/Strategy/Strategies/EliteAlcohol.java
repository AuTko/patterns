package Strategy.Strategies;

import Strategy.AlcoholStrategy;

public class EliteAlcohol implements AlcoholStrategy {
    @Override
    public int getPeople(int money) {
        return money / 50;
    }
}
