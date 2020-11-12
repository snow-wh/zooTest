package food;

public class Meat extends AnimalOrigin {

    private final int calories = 1300;

    public Meat (){
        setCalories(calories);
    }

    public Meat (int countFud ){
        super(countFud);
        setCalories(calories);
    }


}
