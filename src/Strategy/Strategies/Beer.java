package Strategy.Strategies;

import Strategy.AlcoholStrategy;

public class Beer implements AlcoholStrategy {
    @Override
    public int getPeople(int money) {
        return money / 6;
    }
}
