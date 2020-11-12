package animals;

import exception.WrongKillAnimalException;
import food.AnimalOrigin;
import food.Food;
import sizeEnum.CageSize;


public class Duck extends Herbivorous {

    private int weight;

    public Duck(int weight, String name) {
        super(weight, name);
        this.weight = weight;
    }

    @Override
    public CageSize getCageSize() {
        return CageSize.SMALL_ANIMAL;
    }

    @Override
    protected String voice() {
        if (!getKill())
            return "крякря";
        else
            return "убили";
    }


    public Food kill()  {
        if (!getKill()) {
            setKill(true);
            return new AnimalOrigin(1, 308 * weight);
        } else {
            try {
                throw new WrongKillAnimalException();
            } catch (WrongKillAnimalException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
