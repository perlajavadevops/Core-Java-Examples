
public interface FlightOperations {
 
	int a=90;
	void getAllAvailableFlights();
	void booking(BookingObject bookingObj);
	
	
}

class AirIndia implements FlightOperations{

	@Override
	public void getAllAvailableFlights() {
	
		System.out.println("Air India Flights Details ");
	}

	@Override
	public void booking(BookingObject bookingObj) {
		System.out.println("Air India Flight Booking ");
	}
	
}



class BritishAirways implements FlightOperations{

	@Override
	public void getAllAvailableFlights() {
	
		System.out.println("BritishAirways Flights Details ");
	}

	@Override
	public void booking(BookingObject bookingObj) {
		System.out.println("BritishAirways Flight Booking ");
	}
	
}
/*
 * class - class = extends
 * interface - interface = extends
 * interface - class = implemnts
 * class - interface = not possible
 */
class AbstractionDemo1 {
	public static void main(String[] args) {
		FlightOperations flightOperations = new AirIndia();
		flightOperations.getAllAvailableFlights();
		
		FlightOperations flightOperations1 = new BritishAirways();
		flightOperations1.getAllAvailableFlights();

		/*
		 * Packages
		 * 
		 * Access Modifiers
		 * Encapsulation
		 * Arrays
		 * 
		 */
	}
}


