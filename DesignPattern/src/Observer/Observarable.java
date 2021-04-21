package Observer;

public interface Observarable {
	
	 void registerObserver(Observer observer);

	    void removeObserver(Observer observer);

	    void notifyObservers();

}
