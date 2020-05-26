package Factory;

import Mediator.MessageMediator;

public class ChatBot extends User {


    private static ChatBot bot;
    
	public ChatBot(MessageMediator med, String name) {
		super(med, name);
		med.addUser(this);
	}
	
    public static ChatBot createBot(MessageMediator med, String name) {
        if (bot == null) {
        	bot = new ChatBot(med, name);
        }
        return bot;
    }
	@Override
	public void send(String msg) {
        System.out.println(getName() + " sends: " + msg);
        mediator.sendMessage(msg, this);
		
	}
	@Override
	public void receive(String msg) {
	      System.out.println(getName() + " receives:" + msg);
	      
	}

}
