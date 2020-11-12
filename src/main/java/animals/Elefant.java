package animals;


import sizeEnum.CageSize;

public class Elefant extends Herbivorous {

    public Elefant(int weight, String name) {
        super(weight, name);
    }

    @Override
    public CageSize getCageSize() {
        return CageSize.OVER_BIG_ANIMAL;
    }

    @Override
    protected String voice() {
        return "туруруруруру";
    }

}
