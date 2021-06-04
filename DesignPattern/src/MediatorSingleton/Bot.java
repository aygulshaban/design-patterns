package MediatorSingleton;

import java.util.List;
import MediatorSingleton.User;

public interface Bot {

		public String checkMessage(String message, List<User> users, User u);
		public void send(String message, String matches);
		
}
