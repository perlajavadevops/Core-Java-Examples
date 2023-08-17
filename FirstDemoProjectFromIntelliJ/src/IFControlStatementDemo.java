public class IFControlStatementDemo {
    public static void main(String[] args) {
        int a = 90;
        int b = 100;
        int c = 80;
                    //
       boolean flag =  (a>b)? true : false;
        System.out.println(flag);
        // true
        /*if(a>b){//90>100 -- false
            System.out.println("Condition is Satisfied");
        } else if(c>b){//c>b -- 100 -- true
            System.out.println("Condition is Satisfied: "+(a<b));
        } else{
            System.out.println("Condition is not Satisfied: ");
        }*/
    }
}
