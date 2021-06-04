package MediatorSingleton;

public abstract class User {
	
	protected Message message;
	protected String name;
	
	public User(Message message, String name) {
		this.message = message;
		this.name = name;
	}
	
	public abstract void send(String message);
	public abstract void receive(String message);
	
	public String getName() {
		return this.name;
	};

}
