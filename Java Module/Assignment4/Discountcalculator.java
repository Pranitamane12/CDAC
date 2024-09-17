package Asss4_2example;

public class Discountcalculator {

	private double originalprice;
	private double discountrate;
	
	
	public Discountcalculator(double originalprice,double doscountrate) {
		this.originalprice = originalprice;
        this.discountrate = discountrate;
        
	}

	public double getOriginalprice() {
		return originalprice;
	}

	public void setOriginalprice(double originalprice) {
		this.originalprice = originalprice;
	}

	public double getDiscountrate() {
		return discountrate;
	}

	public void setDiscountrate(double discountrate) {
		this.discountrate = discountrate;
	}

	
	public double calculateDiscountAmount() {
        return originalprice * (discountrate / 100);
    }
	
    public double calculateFinalPrice() {
        return originalprice - calculateDiscountAmount();
    }

	
	@Override
	public String toString() {
		return  "Discountcalculator ()";

	}

	
	
	
}
