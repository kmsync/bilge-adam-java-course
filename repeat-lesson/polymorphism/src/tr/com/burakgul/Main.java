package tr.com.burakgul;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Object a = "213123123";

        String b = "Burak,Meriç,Burcu";

        System.out.println(a);

        System.out.println(b.toLowerCase());

        MathematicalOperation math = new Math();

        System.out.println(math.divide(5,6));

        Math math1 = new Math();

        MathematicalOperation mathematicalOperation;

        mathematicalOperation = math1;

        System.out.println(mathematicalOperation.divide(99,65));

        MathematicalOperation mathematicalOperation1 = new Math();

        //?? Exception in thread "main" java.lang.ClassCastException: tr.com.burakgul.MathematicalOperation cannot be cast to tr.com.burakgul.Math
        Math math2 = (Math) mathematicalOperation1;

        System.out.println(math2.divide(999,656));

        MathematicalOperation mathematicalOperation2 = new Math2();

        Math math3 = null;
        Math2 math21 = null;

        if(mathematicalOperation2 instanceof Math){
            System.out.println("Objenin tipi Math.");
            math3 = (Math) mathematicalOperation2;
        }else if(mathematicalOperation2 instanceof Math2){
            System.out.println("Objenin tipi Math2");
            math21 = (Math2) mathematicalOperation2;
        }

        System.out.println(math21.divide(999,456));
        System.out.println(math3.divide(999,456));
    }
}
