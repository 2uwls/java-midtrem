import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		double totalTripFare = 0;
		boolean flag=true;
		while(flag == true) {
			
			Scanner input = new Scanner(System.in); 
			
			// TODO Auto-generated method stub
			Station station = new Station(0,0);
			
			List <PublicTransport> transports = new ArrayList<>();
			transports.add(new Train("Train", 0, 0, station));
			transports.add(new Bus("Bus", 0, 0, station));
			transports.add(new Taxi("Taxi", 0, 0));
			transports.add(new Bus("Bus", 0, 0, station));
			
			System.out.println("Choose a transport:");
		    for (int i = 0; i < transports.size(); i++) {
		    	System.out.println((i + 1) + ". " + transports.get(i).getModel());
		    }
			
			int userChoice = input.nextInt();
			if (userChoice!=0){
				PublicTransport choosedTransport = transports.get(userChoice - 1);
				System.out.println("You choose "+choosedTransport.getModel());
				System.out.print("Enter base fare: ");
				double baseFare= input.nextDouble();
				choosedTransport.setBaseFare(baseFare);
				//enter
				if((userChoice -1) == 0 || (userChoice - 1) ==1) {
					System.out.print("Enter fare per station (for extra stations): ");
					double farePerStation = input.nextDouble();
					//enter
					System.out.print("Enter number of stations: ");
					double nStations = input.nextDouble();
				}else {
					System.out.print("Enter fare per km: ");
					double farePerKm = input.nextDouble();
					System.out.print("Enter distance (in km): ");
					double distance = input.nextDouble();
				}
				
				choosedTransport.calculatePayment();
				
				
			}
			System.out.print("Add more transport (from right menu)");
			int isAgain = input.nextInt();
			if (isAgain == 1) {
				//continue purchasing
				continue;
			}
			else if (isAgain == 2) {
//				System.out.println()
				//stop purchasing
//				for (int i = 0; i < transports.size(); i++) {
//					System.out.println("Transport"+(i+1));
//					System.out.println("Total Trip Fare: "+);
//				}
//
//				System.out.println("Thank you!");
				for (PublicTransport transport : transports) {
				    totalTripFare += transport.getTotalFare();
				    System.out.println("Transport: " + transport.getModel());
				    System.out.println("Total Trip Fare: " + transport.getTotalFare());
				}
				System.out.println("Total Trip Fare: " + totalTripFare);
				break;
			}
			//enter를 누르면초기화
			
			//yes버튼
			//choose~화면으로
//			//Cancel버튼
//			System.out.println("Cancelled!");
//			System.out.println("New plan:");
	
			
//			for (PublicTransport transport : transports) {
//				System.out.print(transport.getModel());
				
		}
	}
}



