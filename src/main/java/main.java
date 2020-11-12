import animals.*;
import cages.*;
import food.*;



public class main {


    public static void main(String[] args) throws InterruptedException {

        Lion lion = new Lion("Lion", 280);
        Lion lion2 = new Lion("Lion2", 210);

        Elefant elefant = new Elefant(2000, "Elefant");
        Duck duck = new Duck(3,"Duck");
        Duck duck2 = new Duck(3,"Duck2");
        Camel camel = new Camel(1000, "Camel");


        CarnivorousCage<Carnivorous> cage = new CarnivorousCage(7,10);
        HerbivorousCage<Herbivorous> cage1 = new HerbivorousCage(10,10);
        HerbivorousCage<Herbivorous> cage2 = new HerbivorousCage(10,12);


        lion.eat(new Meat(3));
        lion.eat(new MixedFeed(2)); // просит мясо, а не комбикорм
        lion.eat(new Chicken(1));
        lion.eat(new Chicken(1));
       // Thread.sleep(120000); // нельзя кормить 5 часов "игровых" 2 минуты реальных
        lion.eat(new Chicken(1));

        // такая же система с другими животными

        elefant.eat(new MixedFeed(21));
        elefant.eat(new Meat(5)); // просит спец корм вместо мяса

        //утку можно убить и скормить льву, либо обращяться как с обычным животным

        duck.eat(new Seed(1));

        lion2.eat(duck.kill());

        lion2.eat(duck.kill());

        // клетки делятся по размеру и по опасности жизни там

        //cage.moveIn(duck2); // Ошибка нельзя подселить животных с разным питанием
        cage.moveIn(lion);
        cage.moveIn(lion2); //без проблем селим льва
        cage.moveIn(lion); // это животное уже есть в клетке
        // львы в клетке
        cage.feedAll(); // покормили всех животных
        cage.moveOut(lion2);//выселили льва

        cage1.moveIn(elefant);
        cage1.moveIn(duck2); // нехватило места для утки в клетке
        cage1.moveIn(duck); // предупредит, что утку мы убили

        cage2.moveIn(camel);
        cage2.moveIn(duck2); // а вот с ним можно


    }
}
