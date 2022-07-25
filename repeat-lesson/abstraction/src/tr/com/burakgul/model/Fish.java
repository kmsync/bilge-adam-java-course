package tr.com.burakgul.model;

import tr.com.burakgul.model.base.Animal;

public class Fish extends Animal {

    public Fish(){
        super(0);
    }

    @Override
    public void eat(){
        System.out.println("Fish is eating.");
    }
}
