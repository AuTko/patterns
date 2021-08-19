import AbstractFactory.AKFactory.AKFactory;
import AbstractFactory.Bullet;
import AbstractFactory.M16Factory.M16Factory;
import AbstractFactory.Weapon;
import AbstractFactory.WeaponFactory;
import Facade.Facade;
import FactoryMethod.AbstractWeaponFactory;
import FactoryMethod.AkFactory;
import FactoryMethod.HKFactory;
import Strategy.Context;
import Strategy.Strategies.Beer;
import Strategy.Strategies.CheapVodka;
import Strategy.Strategies.EliteAlcohol;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Facade

        /*Facade facade = new Facade();
        facade.upgradeVideo("My_video.mp4");*/

        //Abstract Fabric

       /* WeaponFactory firstFactory = new AKFactory();
        Weapon firstWeapon = firstFactory.getWeapon();
        ArrayList<Bullet> firstBullets = firstFactory.getBullets();

        WeaponFactory secFactory = new M16Factory();
        Weapon secWeapon = secFactory.getWeapon();
        ArrayList<Bullet> secBullets = secFactory.getBullets();*/

        //Factory Method

        /*AbstractWeaponFactory firstFactory = new AkFactory();
        firstFactory.getWeapon();
        AbstractWeaponFactory secFactory = new HKFactory();
        secFactory.getWeapon();*/

        //AlcoholStrategy

        Context context = new Context();

        context.setStrategy(new Beer());
        context.calculateResult(125);

        context.setStrategy(new CheapVodka());
        context.calculateResult(125);

        context.setStrategy(new EliteAlcohol());
        context.calculateResult(125);



    }

}