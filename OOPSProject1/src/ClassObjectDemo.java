class Customer{
    int customerId;
    String name;//null

    //Constructor Public c
    //0-argumnets or 0-paramertterized constr
    Customer(){//private, public, protected, defualt

    }
}
public class ClassObjectDemo {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();

        System.out.println(customer.name);
        System.out.println(customer.customerId);
    }
}
