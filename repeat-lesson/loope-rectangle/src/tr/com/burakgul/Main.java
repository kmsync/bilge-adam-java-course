package tr.com.burakgul;

public class Main {

    public static void main(String[] args) {
        printRectangle(4,10);
    }

    public static void printRectangle(int row, int column){

        /*
        **********
        *        *
        *        *
        **********
         */

        int a = 1;

        while (a <= row){
            int b = 1;
            while (b <= column){
                if(a==1 || a == row || b == 1 || b == column){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

                b++;
            }
            System.out.println();
            a++;
        }
    }
}
