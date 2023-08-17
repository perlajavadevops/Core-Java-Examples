public class AccessDemo {

    public static void main(String[] args) {
        System.out.println("byte default value is - "+DataTypesDemo.b);
        System.out.println("short default value is - "+DataTypesDemo.s);
        System.out.println("int default value is - "+DataTypesDemo.i);
        System.out.println("long default value is - "+DataTypesDemo.l);
        System.out.println("float default value is - "+DataTypesDemo.f);
        System.out.println("double default value is - "+DataTypesDemo.d);
        System.out.println("char default value is - "+DataTypesDemo.ch);
        System.out.println("boolean default value is - "+DataTypesDemo.flag);

        //instance varialbes
        DataTypesDemo demo = new DataTypesDemo();//creating object

        System.out.println("char default value is - "+demo.in);
        System.out.println("boolean default value is - "+demo.bb);
    }
}
