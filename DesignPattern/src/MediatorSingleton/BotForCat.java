package MediatorSingleton;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BotForCat implements Bot {
	
	private static BotForCat BotInstance;
	private String allMatches;
	private Pattern pattern;
	private Matcher matcher;
	
	public boolean findMatch(String text, String findText) {
		
		this.allMatches = "";
		
		boolean isMatch = false;
		
		pattern = Pattern.compile(findText);
		matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			text = text.replace(matcher.group(), "");
			this.allMatches += matcher.group() + ", ";
			isMatch = true;
		}
		return isMatch;
	}
	
	public String getAllMatches() {
		return this.allMatches;
	}
	
	public static BotForCat getInstance() {
		if(BotInstance == null) {
			BotInstance = new BotForCat();
		}
		return BotInstance;
	}
	

	@Override
	public String checkMessage(String message, List<User> users, User u) {
		
		boolean isMatch = findMatch(message, "cat");
		
		if(isMatch) {
			users.remove(u);
		}
		
		return (User.class.getName() + " was removed from chat!") ;
	}

	@Override
	public void send(String message, String matches) {
		System.out.println(User.class.getName() + " send banned message" + message);
		
	}

}
