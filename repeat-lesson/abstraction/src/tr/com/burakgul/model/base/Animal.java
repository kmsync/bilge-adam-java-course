package tr.com.burakgul.model.base;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs = legs;
    }

    public void walk(){
        System.out.println("Animal is walking...");
    }

    public abstract void eat();

    /*protected void sound(){
        System.out.println("Animal has not sound.");
    }*/
}
