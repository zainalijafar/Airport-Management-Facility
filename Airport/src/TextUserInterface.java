import java.util.*;

public class TextUserInterface {

	private Scanner reader = new Scanner(System.in); 
	private String input; 
	private Airport airport;
	
	public TextUserInterface() {
		
		this.airport = new Airport();
	}
	
	public void start() {
		
		while (true) {
			
			System.out.println("Airport Panel");
			System.out.println("-------------");
			
			int outPut = outputAirportPanel();
			
			if(outPut == 1){
				
				addPlane();
				
			}else if(outPut == 2) {
				
				addFlight();
				
			}else if(outPut == 3) {
				
				break;
				
			}else {
				
				System.out.println("Not recoganized , please enter again");
			}
		}
		
		while(true) {
				
			System.out.println("Cheers. Welcome to Flight Service");
			System.out.println("---------------------------------");
			
			int flightOutput = flightService();
			
			if (flightOutput == 1) {
				
				printPlanes();
				
			}else if (flightOutput == 2) {
				
				printFlights();
				
			}else if (flightOutput == 3) {
				
				printPlaneInfo();
				
			}else if (flightOutput == 4) {
				
				System.out.println("Cheers. Thanks for visiting Zain International Airport");
				break;
			}
		}
	}
	
	public int outputAirportPanel() {
		
		System.out.println("Choose an operation : ");
		System.out.println("[1] Add airplane");
		System.out.println("[2] Add flight");
		System.out.println("[3] Exit");
		
		this.input = this.reader.nextLine();
		int newInput = convertStringInt(this.input);
		
		return newInput;
	}
	
	public int flightService() {
		
		System.out.println("Choose an operation : ");
		System.out.println("[1] Print Planes");
		System.out.println("[2] Print Flights");
		System.out.println("[3] Print Plane Info");
		System.out.println("[4] Quit");
		
		this.input = this.reader.nextLine();
		int newInput = convertStringInt(this.input);
		
		return newInput;
	}
	
	public void addPlane() {
		
		System.out.println("Give plane ID");
		String userInput = this.reader.nextLine();
		System.out.println("Give plane capacity");
		String capacity = this.reader.nextLine();
		int userInput2 = convertStringInt(capacity);
		this.airport.createAirplane(userInput,userInput2);
	}
	
	public void addFlight() {
		
		System.out.println("Give plane ID");
		String userInput = this.reader.nextLine();
		System.out.println("Give departure airport code");
		String userInput1 = this.reader.nextLine();
		System.out.println("Give arrival airport code");
		String userInput2 = this.reader.nextLine();
		this.airport.addFlight(userInput,userInput1,userInput2);
	}
	
	public void printPlanes() {
		
		this.airport.printPlanes();
	}
	
	public void printFlights() {
		
		this.airport.printFlights();
	}
	
	public void printPlaneInfo() {
		
		System.out.println("Enter the plane iD ");
		String iD = this.reader.nextLine();
		Aeroplane targetAirplane = this.airport.getPlanebyId(iD);
		System.out.println(targetAirplane);
	}
	
	public int convertStringInt(String a) {
		
		try {
			int convert = Integer.parseInt(a);
			return convert;
			
		}catch (Exception e){
			return 50;
		}
	}
}