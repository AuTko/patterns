package AbstractFactory.M16Factory;

import AbstractFactory.Bullet;
import AbstractFactory.Weapon;
import AbstractFactory.WeaponFactory;

import java.util.ArrayList;

public class M16Factory implements WeaponFactory {
    @Override
    public Weapon getWeapon() {
        return new M16();
    }

    @Override
    public ArrayList<Bullet> getBullets() {
        System.out.println("Creating 5.45 bullets");
        ArrayList<Bullet> bullets = new ArrayList<>(200);
        for (int i = 0; i < 120; i++) {
            bullets.add(new Cal5_45());
        }
        System.out.println();
        return bullets;
    }
}
