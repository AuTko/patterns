import AbstractFactory.AKFactory.AKFactory;
import AbstractFactory.Bullet;
import AbstractFactory.M16Factory.M16Factory;
import AbstractFactory.Weapon;
import AbstractFactory.WeaponFactory;
import Facade.Facade;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Facade

        /*Facade facade = new Facade();
        facade.upgradeVideo("My_video.mp4");*/

        //Abstract Fabric

        WeaponFactory firstFactory = new AKFactory();
        Weapon firstWeapon = firstFactory.getWeapon();
        ArrayList<Bullet> firstBullets = firstFactory.getBullets();

        WeaponFactory secFactory = new M16Factory();
        Weapon secWeapon = secFactory.getWeapon();
        ArrayList<Bullet> secBullets = secFactory.getBullets();



    }

}