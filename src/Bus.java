
public class Bus extends PublicTransport {
	//Composition
	private Station station;

	public Bus(String model, double baseFare, double totalFare, Station station) {
		super(model, baseFare, totalFare);
		this.baseFare = baseFare;
		this.station = station;
	}
	
	public String getModel() {
		return "KORBUS";
	}
	
	public void setFarePerStation(double farePerStation) {
		station.setFarePerStation(farePerStation);
	}

	public void setnStations(int nStations) {
		station.setnStations(nStations);
	}
	
	//calculate payment consider number of stations
	@Override
	public void calculatePayment() {
		if (station.getnStations()<5) {
			totalFare=baseFare; 
		}else {
			totalFare = baseFare + (station.getnStations()-5)*(station.getFarePerStation());	
		}
		setTotalFare(totalFare);
	}
	
	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
}
