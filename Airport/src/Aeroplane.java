import java.util.*;

public class Aeroplane {
	
	private String iD; 
	private int capacity;
	private ArrayList<Flights> aeroFlightList;
	
	public Aeroplane() {
		
		if (aeroFlightList==null) {
			
			aeroFlightList = new ArrayList<>();
		}
	}
	
	public void setId(String iD) {
		
		this.iD = iD; 
	}
	
	public void setCapacity(int capacity) {
		
		this.capacity = capacity;
	}
	
	public void addFlight(Flights flight) {
		
		this.aeroFlightList.add(flight);
	}
	
	public String getId() {
		
		return this.iD;
	}
	
	public int getCapactiy() {
		
		return this.capacity;
	}
	
	public String toString() {
		
		return "The iD of this plane is " + this.iD + " and the capacity is " + this.capacity + " passengers";
	}
}