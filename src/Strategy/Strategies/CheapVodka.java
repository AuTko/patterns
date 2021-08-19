package Strategy.Strategies;

import Strategy.AlcoholStrategy;

public class CheapVodka implements AlcoholStrategy {
    @Override
    public int getPeople(int money) {
        return money / 7;
    }
}
