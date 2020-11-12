package food;


public class AnimalOrigin extends Food {

    private int countFud;
    private int calories;

    protected AnimalOrigin(){}

    protected AnimalOrigin(int countFud){
        this.countFud = countFud;
    }
    public AnimalOrigin(int countFud, int calories){
        this.countFud = countFud;
        this.calories = calories;
    }


        @Override
    public int caloricity() {
        return calories*countFud;
    }

    public void setCountFud(int countFud){
        this.countFud = countFud;
    }

    protected void setCalories(int calories){
        this.calories = calories;
    }
}
