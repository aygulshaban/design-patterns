package MediatorSingleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Chat implements Message {
	
private List<User> users;
private Set<Bot> bots;
	
	public Chat() {
		this.users = new ArrayList<>();
	}


	private Bot checkMessage(String message) {
		if (message.contains("addBot")) {
			return BotForCat.getInstance();
		}
		return null;
	}
	

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}
	
	@Override
	public void sendMessage(String message, User user) {
		Bot bot = checkMessage(message);
		boolean checkBots = false;
		if (bot != null) {
			addBot(bot);
		}
		 
			checkBots = true;
	
		for (User u : this.users) {
			if (u != user) {
				u.receive(message);
			}else {
				if (checkBots) {
					for (Bot b : bots) {
						message = b.checkMessage(message, this.users, user);
					}
				}
			}
		}

	}
	
	@Override
	public void addBot(Bot bot) {
		this.bots.add(bot);
		System.out.println("Bot is added successfully!");
	}

}
