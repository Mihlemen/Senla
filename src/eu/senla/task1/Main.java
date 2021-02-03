package eu.senla.task1;

public class Main {

    static byte a;
    static short b;
    static int c;
    static double d;
    static float e;
    static char f;
    static long g;
    static boolean h;
    static String sString;
    static Byte aByte;
    static Short bShort;
    static Integer cInteger;
    static Double dDouble;
    static Float eFloat;
    static Character fChar;
    static Long gLong;
    static Boolean hBoolean;


    public static void main(String[] args) {
        Number number = new Number();
        number.setA((byte) 10);
        System.out.println("byte a = "+number.getA());

        number.setaByte((byte)99);
        System.out.println("aByte= "+number.getaByte());

        number.setB((short) 25555);
        System.out.println("short b = "+number.getB());

        number.setbShort((short)16666);
        System.out.println("bShort = "+number.getbShort());

        number.setC((int)111111);
        System.out.println("int c = "+number.getC());

        number.setcInteger((int)222222);
        System.out.println("cInteger = "+number.getcInteger());

        number.setD((long)54755745754755L);
        System.out.println("long d = "+number.getD());

        number.setdLong((long)77777777777777777L);
        System.out.println("dLong = "+number.getdLong());

        number.setE((float) 1.654658568564F);
        System.out.println("float c = "+number.getC());

        number.seteFloat((float) 2.574658456865486F);
        System.out.println("eFloat = "+number.getE());

        number.setF((double) 4.6574567465456);
        System.out.println("double f = "+number.getF());

        number.setfDouble((double)5.6754765654865);
        System.out.println("fDouble = "+number.getfDouble());

        number.setG((char) '9' );
        System.out.println("char g = "+number.getG());

        number.setgCharacter((char) 'G');
        System.out.println("gCharacter = "+number.getgCharacter());


        number.sethBoolean((boolean) true);
        System.out.println("hBoolean = "+number.gethBoolean());


        number.setH((boolean) false);
        System.out.println("boolean h = "+number.getH());


        byte j = 9;

        byte i = (byte) j;
        System.out.println("j = "+i);

        short k = (short) j;
        System.out.println("k = "+k);

        int l =(int) j;
        System.out.println("l = "+l);

        long m = (long) j;
        System.out.println("m = "+m);

        //char n = (char) j;                Не присваивается
        //System.out.println("n = "+n);

        float o = (float) j;
        System.out.println("o = "+o);

        double p = (double) j;
        System.out.println("p = "+p);

        String str = "1000";
        double q = Double.parseDouble(str);
        System.out.println("q = "+q);


        Integer int1 = 200;
        Integer int2 =200;
        System.out.println(int1 == int2);
        System.out.println(int1.equals(int2));

        int x =127;
        double y = Double.valueOf(x);
        System.out.println("y = "+y);

        String y1 = "321";
        int x1 = Integer.valueOf(y1);
        System.out.println("x1 = "+x1);

        int x2 = 12345;
        String y2 = String.valueOf(x2);
        System.out.println("y2 = "+y2);

        char x3 = 'X';
        int y3 = Integer.valueOf(x3);
        System.out.println("y3 = "+y3);


        int x4 = Integer.parseInt("56678");
        System.out.println("x4 = "+x4);

        String x5 = "345546";
        double y5 = Double.parseDouble(x5);
        System.out.println("y5 = "+y5);

        int x6 = 6;
        short y6 = (short) x6;
        System.out.println("y6 = "+y6);
        byte z6 = (byte) x6;
        System.out.println("z6 = "+z6);

        long x7 = 3654645646L;
        int y7 = (int) x7;
        System.out.println("x7 = "+x7);


        Integer z = null;
        System.out.println("z = "+z);


        Character zz = '1';
        System.out.println("char zz = "+zz);
    }

}