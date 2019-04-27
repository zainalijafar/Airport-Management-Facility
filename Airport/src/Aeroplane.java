import java.util.*;

public class Aeroplane {
	
	private HashMap<String,String> aeroList = new HashMap<String,String>();
	private String iD; 
	private String capacity;
	private String depAirport; 
	private String arrAirport; 
	
	public Aeroplane() {
		
	}
	
	public void setId(String iD) {
		
		this.iD = iD; 
	}
	
	public void setCapacity(String capacity) {
		
		this.capacity = capacity;
	}
	
	public void addPlane() {
		
		this.aeroList.put(this.iD, this.capacity);
	}
	
	public String getPlaneInfo(String iD) {
		
		return this.aeroList.get(iD);
	}
	
	public void setDeparture(String depAirport) {
		
		this.depAirport = depAirport;
	}
	
	public void setArrAirport(String arrAirport) {
		
		this.arrAirport = arrAirport;
	}
	
	public String getDeparture() {
		
		return this.depAirport;
	}
	
	public String getArrAirport() {
		
		return this.arrAirport;
	}
	
	public String getId() {
		
		return this.iD;
	}
	
	public String getCapactiy() {
		
		return this.capacity;
	}
	
	public String toString() {
		
		if (getDeparture()=="" && getArrAirport()=="") {
			
			return "The iD of this plane is " + this.iD + " and the capacity is " + this.capacity + " passengers";
			
		}else {
			
			return "The iD of this plane is " + this.iD + " and the capacity is " + this.capacity + " passengers from " + this.getDeparture() + " to " + this.getArrAirport();
		}
	}
}