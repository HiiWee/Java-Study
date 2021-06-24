package ex02_observerPattern.Interface;

public interface Observer {
	
	public abstract void update(float temp, float humidity, float pressure);
	
}
