package observer;

public class FruitObserver implements Observer {
	
	private String name;
	private Observable fruit;

	public FruitObserver(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.fruit == null) {
			System.out.println(this.getName() + "has no fruit.");
			return;
		}
		Fruit newFruit = this.fruit.getNewFruit();
		System.out.println(this.getName() + " recieved an update! " + newFruit.getFruitName()+" is rotten " + newFruit.isRotten());

	}

	@Override
	public void setFruit(Observable fruit) {
		this.fruit = fruit;

	}

	public String getName() {
		return name;
	}

}
