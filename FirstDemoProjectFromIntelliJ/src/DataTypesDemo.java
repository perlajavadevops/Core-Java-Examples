public class DataTypesDemo {

    static int i;//0
    static byte b;//0
    static short s;//0
    static long l;//0
    static float f;//0.0
    static double d;//0.0
    static char ch = 90;//' ';
    static boolean flag;// false

    //instance variables
    int in;//0
    byte bb;//0

    public static void main(String[] args) {
        System.out.println("byte default value is - "+DataTypesDemo.b);
        System.out.println("short default value is - "+DataTypesDemo.s);
        System.out.println("int default value is - "+i);
        System.out.println("long default value is - "+l);
        System.out.println("float default value is - "+f);
        System.out.println("double default value is - "+d);
        System.out.println("char default value is - "+ch);
        System.out.println("boolean default value is - "+flag);


        //instance varialbes
        DataTypesDemo demo = new DataTypesDemo();//creating object

        System.out.println("char default value is - "+demo.in);
        System.out.println("boolean default value is - "+demo.bb);
    }
}
