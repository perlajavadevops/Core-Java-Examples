public class ForLoopDemo {

    //i want 0 to 10
    public static void main(String[] args) {

        int i =0;
        ++i;//1
        ++i;//2
        ++i;//3

        --i;//2
        --i;//1
        --i;//0
        --i;//-1
        int x = i;// -2

        System.out.println(x);
        /*for (int i = 0; i<=10; ++i){//0+1 = i =1+1 = 2+1=3
            System.out.println(i);//0 to 10
        }*/
    }
}
