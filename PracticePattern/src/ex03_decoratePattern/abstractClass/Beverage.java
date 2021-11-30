package ex03_decoratePattern.abstractClass;

public abstract class Beverage {
	private String description = "No title";
	
	public String getDescription() {
		return description;
	}
	public abstract double cost();
	
	public void setDescription(String description) {
		this.description = description;
	}
}
