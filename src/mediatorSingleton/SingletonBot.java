package mediatorSingleton;

public class SingletonBot {

private static SingletonBot instance;
	
	private SingletonBot() {
		// TODO Auto-generated constructor stub
	}

	public static SingletonBot getInstance() {
		
		if(instance == null) {
			instance = new SingletonBot();
		}
		
		return instance;
	}
	
	public boolean searchForbiddenWord(String message) {
		if(message.contains("cat")) {
			return true;
		} else {
			return false;
		}
	}
}
