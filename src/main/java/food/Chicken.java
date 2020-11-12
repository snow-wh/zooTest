package food;

public class Chicken extends AnimalOrigin {

    private final int calories = 400;

    public Chicken (int countFud ){
        super(countFud);
        setCalories(calories);
    }
}
