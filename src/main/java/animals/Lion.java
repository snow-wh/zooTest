package animals;

import sizeEnum.CageSize;

public class Lion extends Carnivorous {

    public Lion(String name, int weight) {
        super(weight,name);
    }

    @Override
    public CageSize getCageSize() {
        return CageSize.MID_ANIMAL;
    }

    @Override
    public String voice() {
        return "rrrrr";
    }

}
