package tr.com.burakgul;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5){
            System.out.println(++i);
        }

        if(i < 5){
            System.out.println(i);
        }else {
            System.out.println("Olmadı.");
        }

        System.out.println("-----------------------------------------------------------------------");

        int j = 1;

        do {
            System.out.println(j);
            j += 1;
        } while (j < 6);

        System.out.println("-----------------------------------------------------------------------");


        for(int k = 0; k < 10 ; k++){
            System.out.println(k);
        }
    }
}
