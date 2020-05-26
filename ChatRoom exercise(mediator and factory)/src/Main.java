import Factory.ChatUser;
import Factory.ChatUserFactory;
import Factory.User;
import Factory.UserFactory;
import Mediator.ChatRoomMediator;
import Mediator.MessageMediator;

public class Main {

	public static void main(String[] args) throws Exception {
		
		MessageMediator chatroom = new ChatRoomMediator();
		ChatUserFactory userFactory = new ChatUserFactory();
		
		User user1 = userFactory.CreateUser(chatroom,"ChatUser", "Yovcho");
		User user2 = userFactory.CreateUser(chatroom,"ChatUser", "Leppop");
		User user3 = userFactory.CreateUser(chatroom,"ChatUser", "Armagedon");
		

		user1.send("Are we going to win tonight guys??");
		user3.send("We are going to totally wreck everyone!");
		user2.send("Guys i dont know i cant find my cat.");
		user1.send("addBot");
		user3.send("OH yea i found my cat no worries.");
		user3.send("Can you invite??");
	}

}
