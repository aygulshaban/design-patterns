package MediatorSingleton;

public interface Message {

	void addUser(User user);
	void sendMessage(String message, User user);
	void addBot(Bot bot);
	
}
