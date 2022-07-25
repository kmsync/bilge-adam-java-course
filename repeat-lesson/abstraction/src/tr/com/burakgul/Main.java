package tr.com.burakgul;

import tr.com.burakgul.model.Cat;
import tr.com.burakgul.model.Fish;
import tr.com.burakgul.model.Spider;
import tr.com.burakgul.model.base.Animal;

public class Main {

    public static void main(String[] args) {
        /*Animal animal = new Animal(10) {
            @Override
            public void eat() {
                System.out.println("Eating.");
            }
        };

        animal.sound();*/

        //Fish animal = new Fish();
        Cat animal = new Cat();
        //Spider animal = new Spider();

        animal.eat();
        animal.walk();
        animal.invokeSuperWalk();
    }
}
