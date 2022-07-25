package tr.com.burakgul;

public class Math extends MathematicalOperation{

    @Override
    public double divide(double a, double b){
        System.out.println("Bu override edilen metot.");
        return a/b;
    }
}
