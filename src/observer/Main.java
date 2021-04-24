package observer;

public class Main {

	public static void main(String[] args) {
		Fruit fruit = new Fruit("Apple");
		
		Observer farmerOne = new FruitObserver("FarmerOne");
		Observer farmerTwo = new FruitObserver("FarmerTwo");
		Observer farmerThree = new FruitObserver("FarmerThree");
		
		fruit.subscribe(farmerOne);
		fruit.subscribe(farmerTwo);
		fruit.subscribe(farmerThree);
		
		fruit.setFruit("This fruit");
		
		fruit.setRotten(true);
	}

}
