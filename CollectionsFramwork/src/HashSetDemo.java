import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Perla");
		set.add("Reddy");
		set.add("Mahesh");
		set.add("Karthik");
		set.add("Dhatrika");//entry <k,v>
		set.add("Dhatrika");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
