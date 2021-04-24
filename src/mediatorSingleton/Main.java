package mediatorSingleton;

public class Main {

	public static void main(String[] args) {
		
		MessageMediator chat = new ChatRoom();
		
		User userOne = new ChatUser(chat, "Genji", 35, "meditating", "Japan");
		User userTwo = new ChatUser(chat, "Hanzo", 45, "archery", "Japan");
		User userThree = new ChatUser(chat, "Gogo", 66, "drinking rakia", "Bulgaria");
		
		userOne.send("My cat is ugly.");
		userThree.send("I live in Bulgaria.");
		userTwo.send("Nice.");

	}

}
