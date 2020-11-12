package animals;

import FeedAll.FeedAll;
import exception.WrongFoodException;
import food.Food;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sizeEnum.CageSize;



public abstract class Animal implements FeedAll {

    protected Animal(String name){
        this.name =name;
    }

    private static Logger logger = LoggerFactory.getLogger(Animal.class);

    protected String name;
    private boolean kill = false;

    public String name(){
        return name;
    }

    public abstract CageSize getCageSize();

    protected abstract String voice();

    protected abstract int amountOfFood(Food food) throws WrongFoodException;

    public boolean getKill(){
        return kill;
    }

    protected void setKill(boolean kill){
        this.kill=kill;
    }

    public void eat(Food food) {
        int returnAmount = 0;
        try {
            returnAmount = amountOfFood(food);
            switch (returnAmount) {
                case 0:
                    logger.info(name() + "'a пока нельзя кормить");
                    System.out.println(name() + "'a пока нельзя кормить");
                    break;
                case 1:
                    logger.info(name() + " наелся, повторите через 5 часов");
                    System.out.println(name() + " наелся, повторите через 5 часов");
                    break;
                default:
                    if (returnAmount > 0){
                        logger.info(name() + "'y не хватило " + returnAmount + " кКалорий, добавьте порцию");
                        System.out.println(name() + "'y не хватило " + returnAmount + " кКалорий, добавьте порцию");
                    }
                    else{
                        logger.info(name() + "'у многовато, уменьшите порцию на  " + Math.abs(returnAmount) + " кКалорий");
                        System.out.println(name() + "'у многовато, уменьшите порцию на  " + Math.abs(returnAmount) + " кКалорий");
                    }

            }
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void feedAll(Food food){
        eat(food);
    }

}

