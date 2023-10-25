import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mainsource {
	public static void main(String[] args) {
		
		
		
		
		double totalTripFare = 0;
		List <PublicTransport> transports = new ArrayList<>();
		boolean flag=true;
		while(flag == true) {
			
			Scanner input = new Scanner(System.in); 
			Station station = new Station(0,0);

			
			System.out.println("Choose a transport(from left menu):");
			System.out.println("0. Train");
			System.out.println("1. Bus");
			System.out.println("2. Taxi");
			
			int userChoice = input.nextInt();
		
			if(userChoice == 0) {
				System.out.println("You Choose TRAIN");
				System.out.print("Enter base fare: ");
				double baseFare= input.nextDouble();
				System.out.print("Enter fare per station (for extra stations): ");
				double farePerStation = input.nextDouble();
				System.out.print("Enter number of stations: ");
				int nStations = input.nextInt();
				
				
				
				station = new Station(farePerStation, nStations);
				Train train = new Train("Train", baseFare, 0, station);
				train.calculatePayment();
				transports.add(train);
			
		
			} else if (userChoice == 1) {
				System.out.println("You Choose BUS");
				System.out.print("Enter base fare: ");
				double baseFare= input.nextDouble();
				System.out.print("Enter fare per station (for extra stations): ");
				double farePerStation = input.nextDouble();
				System.out.print("Enter number of stations: ");
				int nStations = input.nextInt();
				
				station = new Station(farePerStation, nStations);
				Bus bus = new Bus("Bus", baseFare, 0, station);
				bus.calculatePayment();
				transports.add(bus);

			} else {
				System.out.println("You Choose TAXI");
				System.out.print("Enter base fare: ");
				double baseFare= input.nextDouble();
				System.out.print("Enter fare per km: ");
				double farePerKm = input.nextDouble();
				System.out.print("Enter distance (in km): ");
				double distance = input.nextDouble();
				
				Taxi taxi = new Taxi("Taxi",baseFare,0);
				taxi.setFarePerKm(farePerKm);
				taxi.setDistance(distance);
				taxi.calculatePayment();
				transports.add(taxi);
				
				
			}
			System.out.print("Add more transport (from right menu)");
			int isAgain = input.nextInt();
			if (isAgain == 1) {
				//continue purchasing
				continue;
			}
			else if (isAgain == 2) {

				for (int i = 0; i< transports.size();i++) {
					PublicTransport transport = transports.get(i);
					totalTripFare += transport.getTotalFare();
					System.out.println("Transport "+(i+1)+":"+transport.getModel());
					System.out.println(String.format("Fare: %.2f",transport.getTotalFare()));
					
				}
				System.out.println(String.format("Total Trip Fare: %.2f",totalTripFare));
				break;
			}
			
			input.close();
	
			
				
		}
	}
}



