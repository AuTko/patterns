package AbstractFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface WeaponFactory {

    Weapon getWeapon();
    ArrayList<Bullet> getBullets();
}
