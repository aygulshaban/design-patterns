package MediatorSingleton;

public class MediatorSingletonMain {

	public static void main(String[] args) {
		
		Chat chat = new Chat();
		
		User user1 = new ChatUser(chat, "Jordan");
		User user2 = new ChatUser(chat, "Daniel");
		User user3 = new ChatUser(chat, "Aleksia");
		
		user3.send("Hello  colleagues");
		user3.send("Can I addBot ?");
		user3.send("And I want to share with you that my cat is sick...so sad");
		user1.send("How are you ? ");
		user2.send("Oh no, you will be banned because you uses a forbidden word");
		user1.send("Cat is forbidden word ");

	}

}
