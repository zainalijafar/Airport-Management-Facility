import java.util.*;

public class Airport {
	
	private ArrayList<Aeroplane> list = new ArrayList<Aeroplane>();
	
	public Airport() {
		
	}
	
	public ArrayList<Aeroplane> addPlaneList(Aeroplane plane){
		
		list.add(plane);
		return list;
	}
	
	public void printPlanes() {
		
		for (Aeroplane a : list) {
			
			System.out.println(a);
		}
	}
	
	public void printFlights() {
		
		for (Aeroplane a : list) {
			
			System.out.println(a);
		}
	}
}