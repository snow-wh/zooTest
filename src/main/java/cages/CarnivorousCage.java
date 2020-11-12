package cages;


import exception.WrongCageSizeException;
import exception.WrongCageContainException;

import animals.Carnivorous;

import food.Chicken;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CarnivorousCage <T extends Carnivorous>  extends Cage{

    private static Logger logger = LoggerFactory.getLogger(CarnivorousCage.class);

    public CarnivorousCage(int length, int width) {
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

    public void feedAll(){
        feedAll(new Chicken(1));
    }

}
