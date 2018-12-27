package Model;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;

import Server.Client;

public class event implements Serializable{
	private String content;

	public event(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public event(){
		
	}
	public ArrayList<event> viewData3() throws UnknownHostException, IOException, ClassNotFoundException{
		Client c= new Client();
		return c.viewData3();
	}
}
