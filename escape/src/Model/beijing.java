package Model;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;

import Server.Client;

public class beijing implements Serializable{
	private String content;

	public beijing(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public beijing(){
		
	}
	public ArrayList<beijing> viewData() throws UnknownHostException, IOException, ClassNotFoundException{
		Client c = new Client();
		return c.viewData();
	}

}
