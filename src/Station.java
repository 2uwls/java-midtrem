//class for composition
public class Station {
	
	private double farePerStation; //variable for fare per stations
	private int nStations; //variable for number of stations
	
	public Station(double farePerStation, int nStations) {
		super();
		this.farePerStation = farePerStation;
		this.nStations = nStations;
	}

	public double getFarePerStation() {
		return farePerStation;
	}

	public void setFarePerStation(double farePerStation) {
		this.farePerStation = farePerStation;
	}

	public int getnStations() {
		return nStations;
	}

	public void setnStations(int nStations) {
		this.nStations = nStations;
	}
	
	
	
	
	
	
	
	

}
