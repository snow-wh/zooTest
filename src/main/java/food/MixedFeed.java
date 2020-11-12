package food;

public class MixedFeed extends HerbivorousOrigin{
    private final int calories = 800;

    public MixedFeed(){
        setCalories(calories);
    }

    public MixedFeed(int countFud ){
        super(countFud);
        setCalories(calories);
    }
}
