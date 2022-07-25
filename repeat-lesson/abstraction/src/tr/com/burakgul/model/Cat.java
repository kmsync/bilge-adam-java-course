package tr.com.burakgul.model;

import tr.com.burakgul.model.base.Animal;

public class Cat extends Animal {
    public Cat(){
        super(4);
    }

    public void eat(){
        System.out.println("Cat is eating.");
    }

    @Override
    public void walk(){
        System.out.println("Cat is walking.");
    }

    public void invokeSuperWalk(){
        super.walk();
    }
}
