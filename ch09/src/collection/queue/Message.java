package collection.queue;

public class Message {
	
	String command; //수행
	String to; //대상
	
	//생성자
	Message(String command, String to){
		this.command = command;
		this.to = to;
	}
	
	
}
