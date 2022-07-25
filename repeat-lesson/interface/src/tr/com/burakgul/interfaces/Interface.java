package tr.com.burakgul.interfaces;

public interface Interface{
    int a = 5;

    void testInterface();

    default void walk(){
        System.out.println("Walking.");
    }

    static void eat(){
        System.out.println("Eating");
    }

    void walk(String s);
}
