package mediatorSingleton;

public interface MessageMediator {
	
	public void addUser(User user);
	
	public void sendMessage(String message, User user);

	public void addBot();
	
}
