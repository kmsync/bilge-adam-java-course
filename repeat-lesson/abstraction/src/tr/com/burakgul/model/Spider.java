package tr.com.burakgul.model;

import tr.com.burakgul.model.base.Animal;

public class Spider extends Animal {

    public Spider(){
        super(10);
    }

    @Override
    public void eat(){
        System.out.println("Spider is eating.");
    }
}
