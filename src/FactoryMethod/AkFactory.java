package FactoryMethod;

public class AkFactory extends AbstractWeaponFactory{
    @Override
    public Weapon getWeapon() {
        return new Ak();
    }
}
