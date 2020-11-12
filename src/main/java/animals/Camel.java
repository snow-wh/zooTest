package animals;

import sizeEnum.CageSize;

public class Camel extends Herbivorous {

    public Camel(int weight, String name) {
        super(weight, name);
    }

    @Override
    public CageSize getCageSize() {
        return CageSize.BIG_ANIMAL;
    }

    @Override
    public String voice() {
        return "мумуму";
    }

}
