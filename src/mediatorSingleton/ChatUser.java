package mediatorSingleton;

public class ChatUser extends User {

	public ChatUser(MessageMediator mediator, String nickName, int age, String hobby, String country) {
		super(mediator, nickName, age, hobby, country);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {
		System.out.println(this.nickName + " age "+ age+", with hobby "+hobby+" from "+country+" sends the following message: " + message);
		mediator.addBot();
		mediator.sendMessage(message, this);

	}

	@Override
	public void get(String message) {
		System.out.println(this.nickName + " age "+ age+", with hobby "+hobby+" from "+country+" recieved the following message: " + message);

	}

}
