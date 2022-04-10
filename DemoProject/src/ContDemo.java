/*
 * 
 */
public class ContDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if(i==4){
				System.out.println("2");
				continue;
			}
			System.out.println(i);
			//break;
		}
	}
}
