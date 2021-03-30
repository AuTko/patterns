package AbstractFactory.AKFactory;

import AbstractFactory.Bullet;
import AbstractFactory.Weapon;
import AbstractFactory.WeaponFactory;

import java.util.ArrayList;

public class AKFactory implements WeaponFactory {

    @Override
    public Weapon getWeapon() {
        return new AK();
    }

    @Override
    public ArrayList<Bullet> getBullets() {
        System.out.println("Creating 7.62 bullets");
        ArrayList<Bullet> bullets = new ArrayList<>(150);
        for (int i = 0; i < 90; i++) {
            bullets.add(new Cal7_62());
        }
        System.out.println();
        return bullets;

    }
}
