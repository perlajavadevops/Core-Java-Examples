public class LogicalOperatorsDemo {
    public static void main(String[] args) {

        double passPercentage  = 34.0;
        double distictionPercentage  = 75.0;
        // true                     true
        if(passPercentage>=35.0 && distictionPercentage<=75.0){
            System.out.println("Candidate pass");
            //  true                    true
        }
        // false                    true
        if(passPercentage>35.0 && distictionPercentage>=75.0){
            System.out.println("Candidate pass with dis");
        }else if((passPercentage<35.0)){//if true then i want make it as false
            System.out.println("Candidate failed");
            //          false                    true
        } else if(distictionPercentage>75.0 || distictionPercentage==75.0){
            System.out.println("Candidate is topper");
        }

    }
}
