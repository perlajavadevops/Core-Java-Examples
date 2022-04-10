public class EnumSwitchConDemo {

	public static void main(String[] args) {

		Season season = Season.SPRING;
		switch (season) {
		case WINTER:
			System.out.println("Winter Season");
			break;
		case FALL:
			System.out.println("Fall Season");
			break;
		case SPRING:
			System.out.println("Spring Season");
			break;
		case SUMMER:
			System.out.println("Summer Season");
			break;
		}
	}
}
