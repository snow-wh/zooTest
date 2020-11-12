package cages;

import animals.Animal;
import exception.WrongCageSizeException;
import exception.WrongCageContainException;
import food.Food;

import java.util.HashMap;
import java.util.Map;

public class Cage {

    private int length;
    private int width;

    private Map<String, Animal> neighbours = new HashMap<String, Animal>();


    public Cage(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Map in (Animal animal) throws WrongCageSizeException {

        int allSize = 0;

        for (Animal animals : neighbours.values()) {
            allSize += animals.getCageSize().getSize();
        }

        if ((allSize + animal.getCageSize().getSize()) <= (length * width)) {
            neighbours.put(animal.name(), animal);
            return neighbours;

        } else {
            throw new WrongCageSizeException();
        }

    }

    protected void feedAll( Food food){
        for (Animal animals: neighbours.values()) {
            animals.feedAll(food);
        }
    }

    protected boolean containsAnimal(Animal animal){
        return !neighbours.containsKey(animal.name());
    }

    protected Map out(Animal animal) throws WrongCageContainException {

        if (neighbours.containsKey(animal.name())) {
            neighbours.remove(animal.name());
            return neighbours;
        } else {
            throw new WrongCageContainException();
        }
    }

}