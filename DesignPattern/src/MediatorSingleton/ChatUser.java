package MediatorSingleton;

public class ChatUser extends User{

	public ChatUser(Message message, String name) {

			super(message, name);
			message.addUser(this);
	}

		@Override
		public void send(String message) {
			System.out.println("-" + this.name + " sends: " + message);
			//this.message.sendMessage(message, this);
		}

		@Override
		public void receive(String message) {
			System.out.println("-"+this.name + " received: " + message);
			
		}


}
