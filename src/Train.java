
public class Train extends PublicTransport {
	//Composition
	private Station station;

	public Train(String model, double baseFare, double totalFare, Station station) {
		super(model, baseFare, totalFare);
		this.baseFare = baseFare;
		this.station = station;
	}
	
	public String getModel() {
		return "KORAIL";
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
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
		
	}
	public double getTotalFare() {
		return totalFare;	
	}
}
