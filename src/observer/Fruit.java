package observer;
import java.util.ArrayList;
import java.util.List;

public class Fruit implements Observable {
	
	public Fruit(String fruitName, boolean isRotten) {
		super();
		this.fruitName = fruitName;
		this.isRotten = isRotten;
	}

	private List<Observer> observers;
	private String fruitName;
	private boolean isRotten;

	public Fruit(String fruit) {
		this.fruitName = fruit;
		this.observers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setFruit(this);

	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}

	}

	
	public void setFruit(String fruit) {
		this.fruitName = fruit;
		this.notifyObservers();
	}

	public boolean isRotten() {
		return isRotten;
	}

	public void setRotten(boolean isRotten) {
		this.isRotten = isRotten;
		this.notifyObservers();
	}

	@Override
	public Fruit getNewFruit() {
		// TODO Auto-generated method stub
		return new Fruit(this.getFruitName(),this.isRotten());
	}

	public String getFruitName() {
		return fruitName;
	}

	
	
}
