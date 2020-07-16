package br.com.erudio;

public class Greeting {//used for communicating with clients
	//or to send greetings to our REST Clients
	
	private final long id;
	private final String content;
	
	public Greeting(long id, String content) { //constructor
		this.id = id;
		this.content = content;
	}
	
	//we want to protect id and content protected so it is made private so that
	//other class cannot access it
	//so we are using getters to access it and receive the data

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	
	

}
