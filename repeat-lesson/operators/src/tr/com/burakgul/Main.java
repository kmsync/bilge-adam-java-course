package tr.com.burakgul;

public class Main {

    public static void main(String[] args) {
        System.out.print("Toplama: ");
        System.out.println(5+6);
        System.out.print("Çıkarma: ");
        System.out.println(5-4);
        System.out.print("Çarpma: ");
        System.out.println(15*15);
        System.out.print("Bölme: ");
        System.out.println(15/3);
        System.out.print("Mod: ");
        System.out.println(15%6);

        System.out.println("-----------------------------------------------------------------------------------");

        int a = 9_001;
        int b = 180_000;

        System.out.print("Toplama: ");
        System.out.println(a+b);
        System.out.print("Çıkarma: ");
        System.out.println(a-b);
        System.out.print("Çarpma: ");
        System.out.println(a*b);
        System.out.print("Bölme: ");
        System.out.println(b/a);
        System.out.print("Mod: ");
        if(a>b){
            System.out.println(a%b);
        }else {
            System.out.println(b%a);
        }

        int c = -a;

        System.out.println(c);

        int d = ++a;

        System.out.println(d);

        int e = --a;

        System.out.println(e);

        System.out.println(!true);

        System.out.println("-------------------------------------------------------------------------------------------");

        double doubleA = 79d;
        double doubleB = 65d;

        System.out.println(doubleA++);
        System.out.println(doubleB--);

        System.out.println(doubleA);
        System.out.println(doubleB);

        double doubleC = 99d;
        double doubleD = 79;

        System.out.println(++doubleC);
        System.out.println(--doubleD);


        System.out.println("-------------------------------------------------------------------------------------------");

        int count = 1;

        count += 5; // count = count+5;

        System.out.println(count);

        int count2 = 1;

        count2 -= 5; // count = count-5;

        System.out.println(count2);

        System.out.println("-------------------------------------------------------------------------------------------");

        float floatA = 14;

        floatA += 3;

        System.out.println(floatA);

        floatA -= 5;

        System.out.println(floatA);

        floatA *= 4;

        System.out.println(floatA);

        floatA /= 2;

        System.out.println(floatA);

        System.out.println("-------------------------------------------------------------------------------------------");

        int y = 50;

        int x = 50;

        System.out.println(x > y);

        System.out.println(x >= y);

        System.out.println(x <= y);

        System.out.println(x == y);

        System.out.println(x != y);


        System.out.println("-------------------------------------------------------------------------------------------");


        System.out.println(true & 0==0 & false);
        System.out.println(true && false && true);
        System.out.println(true | false | true);
        System.out.println(true || false || true);
        System.out.println(!true | !true);

        if(0 > 5 && 10 == 10){
            System.out.println("Girdi.");
        } else {
            System.out.println("Girmedi.");
        }

        System.out.println("-------------------------------------------------------------------------------------------");

        int count5 = 50;
        int count6 = 50;

        System.out.println(count5 < count6 && count5 != count6);
        System.out.println(count5 < count6 || count5 != count6);

        // 0011 => 1 + 2 = 3
        // 1110 => 1 * 0 + 2*1 + 4*1 + 8*1 = 14


        System.out.println(3&14);

        byte p = ~3;
        byte g = ~14;

        System.out.println(p);
        System.out.println(g);

        System.out.println("-------------------------------------------------------------------------------------------");

        byte myLargeValueByte = (byte) 130;

        char myLargeValueChar = (char) myLargeValueByte;

        int myLargeValueInteger = myLargeValueChar;

        System.out.println(myLargeValueByte);

        System.out.println(myLargeValueChar);

        System.out.println(myLargeValueInteger);

        char myLargeValueSmileChar = 65410;

        char AChar = 65;

        System.out.println(myLargeValueSmileChar);
        System.out.println(AChar);

        byte myOtherByte = (byte) myLargeValueInteger;

        System.out.println(myOtherByte);

        System.out.println("-------------------------------------------------------------------------------------------");

        int myIntegerPrimitive = 10;

        Integer myIntegerWrapper = myIntegerPrimitive;
        int myOtherIntegerPrimitive = myIntegerWrapper;

        System.out.println(myOtherIntegerPrimitive);


        System.out.println("-------------------------------------------------------------------------------------------");

        String myString = myIntegerWrapper.toString();
        byte myNewByte = Byte.parseByte(myString);
        short myNewShort = Short.parseShort(myString);
        int myNewInt = Integer.parseInt(myString);
        long myNewLong = Long.parseLong(myString);
        float myNewFloat = Float.parseFloat(myString);
        double myNewDouble = Double.parseDouble(myString);
        boolean myNewBoolean = Boolean.parseBoolean(myString);
        char myNewChar = myString.charAt(0);

        System.out.println(myString);
        System.out.println(myNewByte);
        System.out.println(myNewShort);
        System.out.println(myNewInt);
        System.out.println(myNewLong);
        System.out.println(myNewFloat);
        System.out.println(myNewDouble);
        System.out.println(myNewBoolean);
        System.out.println(myNewChar);

    }
}
