public class Flights {

	private String depAirport; 
	private String arrAirport;
	private Aeroplane airplane;
	
	public Flights(Aeroplane airplane, String depAirport, String arrAirport) {
		
		this.airplane = airplane; 
		this.depAirport = depAirport; 
		this.arrAirport = arrAirport;
	}
	
	public String getDeparture() {
		
		return this.depAirport;
	}
	
	public String getArrAirport() {
		
		return this.arrAirport;
	}
	
	public String toString() {
		
		return  " The id of the plane is " +  this.airplane.getId() + " bound from " + depAirport + " to " + arrAirport;
	}
}