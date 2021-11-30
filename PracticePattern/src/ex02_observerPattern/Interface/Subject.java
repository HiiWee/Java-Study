package ex02_observerPattern.Interface;

public interface Subject {
	//abstract 키워드 생략가능.
	public abstract void registerObserver(Observer o);

	public abstract void removeObserver(Observer o);
	
	public abstract void notifyObserver();
	
}
