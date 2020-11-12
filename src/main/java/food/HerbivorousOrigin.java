package food;

public class HerbivorousOrigin extends Food{
    private int countFud;
    private int calories;

    protected HerbivorousOrigin(){}

    protected HerbivorousOrigin(int countFud){
        this.countFud = countFud;
    }


    @Override
    public int caloricity() {
        return calories*countFud;
    }


    protected void setCalories(int calories){
        this.calories = calories;
    }
}
