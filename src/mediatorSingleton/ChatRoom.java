package mediatorSingleton;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements MessageMediator {

	private List<User> users;
	private SingletonBot bot;
	
	public ChatRoom() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);

	}

	
	@Override
	public void sendMessage(String message, User user) {
		
		String goodMessage = message;
		if(bot.searchForbiddenWord(message)) {
			this.users.remove(user);
			System.out.println(user.getNickName() + " is removed.\n");
			goodMessage = "The message cannot be send, because it contains a forbidden word.\n";
		}
		
		for (User chatUser: this.users) {
			if(user != chatUser) {
				chatUser.get(goodMessage);
			}
		}

	}

	@Override
	public void addBot() {
		if(bot == null) {
			this.bot = SingletonBot.getInstance();
		}
		
	}

}
