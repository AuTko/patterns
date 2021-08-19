package Strategy;

public class Context {

    private AlcoholStrategy alcoholStrategy;

    public void setStrategy(AlcoholStrategy strategy) {
        this.alcoholStrategy = strategy;
    }

    public void calculateResult(int money) {
        System.out.println("For " + money + " money, you can get " + alcoholStrategy.getPeople(money) +
                " people drunk with " + alcoholStrategy.getClass().getSimpleName());
    }
}
