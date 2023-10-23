
abstract class PublicTransport implements Payable {
	
	public String model;
	public double baseFare;
	public double totalFare;

	@Override
	public void calculatePayment() {
		
	}

	public PublicTransport(String model, double baseFare, double totalFare) {
		super();
		this.model = "";
		this.baseFare = 0;
		this.totalFare = 0;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(double baseFare) {
		this.baseFare = baseFare;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
		

}
