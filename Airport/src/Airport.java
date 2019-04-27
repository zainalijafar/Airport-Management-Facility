import java.util.*;

public class Airport {
	
	private HashMap<String,Aeroplane> aeroList;
	private ArrayList<Flights> flightList;
	
	public Airport() {
		
		this.flightList = new ArrayList<>();
		this.aeroList = new HashMap<>();
	}
	
	public void createAirplane(String iD, int capacity) {
		
		Aeroplane airplane = new Aeroplane();
		airplane.setId(iD);
		airplane.setCapacity(capacity);
		aeroList.put(iD,airplane);
	}
	
	public void addFlight(String iD,String depAirport,String arrAirport) {
		
		Aeroplane newPlane = getPlanebyId(iD);
		Flights newFlight = new Flights(newPlane,depAirport,arrAirport);
		flightList.add(newFlight);
		newPlane.addFlight(newFlight);
	}
	
	public Aeroplane getPlanebyId(String iD) {
		
		return this.aeroList.get(iD);
	}
	
	public void printPlanes() {
		
		for (String key : aeroList.keySet()) {
			
			System.out.println("The id " + key + " is associated with " + aeroList.get(key) + " capacity" );
		}
	}
	
	public void printFlights() {
		
		for (Flights f : flightList) {
			
			System.out.println(f);
		}
	}
}