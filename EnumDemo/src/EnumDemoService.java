
public class EnumDemoService {

	public enum WEEKS {
		
		SUNDAY(2),MONDAY(3),TUESDAY(4),WEDNESDAY(5), THURSDAY(6), FRIDAY(7), SATURDAY(8);
		
		private int data;
		WEEKS(int data){
			this.data = data;
		}
	
	};
	
	public static void main(String[] args) {
		//System.out.println(WEEKS.SUNDAY.name());
		
		for (WEEKS week : WEEKS.values()) {
			System.out.println(week.data);
		}
	}
	
}
