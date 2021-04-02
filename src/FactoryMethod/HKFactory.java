package FactoryMethod;

public class HKFactory extends AbstractWeaponFactory{
    @Override
    public Weapon getWeapon() {
        return new HK();
    }
}
