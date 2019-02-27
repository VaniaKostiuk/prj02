package prj02;

public class Product {
	private double price;
	private String name;
	private double weight;
	public Product(double price, String name, double weight) {
		setPrice(price);
		this.name = name;
		this.weight = weight;
	}
	public double getPrice() {
		return price*Currency.USD*(1.20+0.10+0.10+0.10+0.50);
	}
	public void setPrice(double price) {
		this.price = price/Currency.USD;
	}
	public String getName() {
		return name;
	}	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
