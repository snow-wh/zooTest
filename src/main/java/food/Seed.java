package food;

public class Seed extends HerbivorousOrigin{
    private final int calories = 100;

    public Seed(){
        setCalories(calories);
    }

    public Seed(int countFud ){
        super(countFud);
        setCalories(calories);
    }

}
