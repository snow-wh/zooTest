package animals;

import exception.WrongFoodException;
import food.AnimalOrigin;
import food.Food;
import timer.Timer;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Carnivorous extends Animal implements Timer {

    private int weight;
    private int counterCalories;
    private int timeToEat;

    protected Carnivorous(int weight, String name) {
        super(name);
        this.weight = weight;
    }


    @Override
    protected int amountOfFood(Food food) throws WrongFoodException {

        int dayNorm = 45 * weight + 70;
        int returnCount;


        if (food instanceof AnimalOrigin) {
            if (timeToEat == 0 || timeToEat <= timerRun(0)) {
                if (counterCalories + food.caloricity() >= dayNorm / 3 - 250 && counterCalories + food.caloricity() < dayNorm / 3 + 250) {
                    returnCount = 1;
                    timeToEat = timerRun(300);
                    counterCalories = 0;

                } else if (counterCalories + food.caloricity() <= dayNorm / 3) {
                    counterCalories += food.caloricity();
                    returnCount = dayNorm / 3 - counterCalories;
                } else {
                    returnCount = dayNorm / 3 - (counterCalories + food.caloricity());
                }
            } else {
                returnCount = 0;
            }
        } else {
            throw new WrongFoodException();
        }


        return returnCount;
    }

    @Override
    public int timerRun(int waitTime) {

        Date timeNow = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH,mm");
        String s = sdf.format(timeNow);
        String[] str = s.split(",");
        return (int) Math.round((Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1])) + waitTime * 0.0056);
    }


}
