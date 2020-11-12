package cages;

import exception.WrongCageSizeException;
import exception.WrongCageContainException;

import animals.Herbivorous;

import food.Seed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HerbivorousCage<T extends Herbivorous> extends Cage  {

    private static Logger logger = LoggerFactory.getLogger(HerbivorousCage.class);

    public HerbivorousCage(int length, int width) {
        super(length, width);
    }


    public void moveIn(T animal) {

        if (!animal.getKill()) {
            if (containsAnimal(animal)) {
                try {
                    in(animal);
                    logger.info(animal.name() + " живет теперь тут");
                    System.out.println(animal.name() + " живет теперь тут");
                } catch (WrongCageSizeException e) {
                    e.printStackTrace();
                }
            } else {
                logger.warn("Это животное уже в клетке");
                System.out.println("Это животное уже в клетке");
            }
        } else {
            logger.error("Это животное мертво");
            System.out.println("Это животное мертво");
        }
    }

    public void moveOut(T animal) {

        try {
            out(animal);
            logger.info(animal.name() + " выселен из клетки");
            System.out.println(animal.name() + " выселен из клетки");
        } catch (WrongCageContainException e) {
            e.printStackTrace();
        }

    }
    public void feedAll() {
        feedAll(new Seed(1));
   }
}
