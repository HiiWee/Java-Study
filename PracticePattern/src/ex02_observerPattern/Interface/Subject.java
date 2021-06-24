package ex02_observerPattern.Interface;

public interface Subject {
	//abstract Ű���� ��������.
	public abstract void registerObserver(Observer o);

	public abstract void removeObserver(Observer o);
	
	public abstract void notifyObserver();
	
}
