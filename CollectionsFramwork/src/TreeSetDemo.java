import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		/*Employee emp1 = new Employee(101,"Reddy",8080808080L,3030.00F);
		Employee emp2 = new Employee(102,"Dhatrika",707070707070L,2000.5f);
		Employee emp3 = new Employee(103,"Abhi",707070707070L,4000.5f);

		TreeSet<Employee> set = new TreeSet<Employee>();
		set.add(emp2);
		set.add(emp1);
		set.add(emp3);*/
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Reddy");
		set.add("Mahesh");
		set.add("Karthik");
		set.add("Dhatrika");//entry <k,v>
		set.add("Dhatrika");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			//Employee e = itr.next();
			//e.displayEmplyee();
			//itr.next().displayEmplyee();
		}
	}
}
