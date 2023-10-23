
public class Taxi extends PublicTransport {
	
	private double farePerKm;
	private double distance;

	public Taxi(String model, double baseFare, double totalFare) {
		super(model, baseFare, totalFare);
		// TODO Auto-generated constructor stub
	}
	
	public String getModel() {
		return "KAKAO TAXI";
	}


	@Override
	public void calculatePayment() {
		totalFare = baseFare + distance * farePerKm;
		setTotalFare(totalFare);
		
	}


	public double getFarePerKm() {
		return farePerKm;
	}


	public void setFarePerKm(double farePerKm) {
		this.farePerKm = farePerKm;
	}


	public double getDistance() {
		return distance;
	}


	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
	
	
	
	
	
	
	

}
