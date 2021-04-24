package mediatorSingleton;

public abstract class User {
	
	protected MessageMediator mediator;
	protected String nickName;
	protected int age;
	protected String hobby;
	protected String country;
	
	public User(MessageMediator mediator, String nickName, int age, String hobby, String country) {
		this.mediator = mediator;
		this.nickName = nickName;
		this.age = age;
		this.hobby = hobby;
		this.country = country;
	}
	
	public abstract void send(String message);
	
	public abstract void get(String message);

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	
	
}
