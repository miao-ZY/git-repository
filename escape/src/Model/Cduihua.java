package Model;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;

import Server.Client;

public class Cduihua implements Serializable{
	private String content;

	public Cduihua(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public Cduihua(){
		
	}
	public ArrayList<Cduihua> viewData1() throws UnknownHostException, IOException, ClassNotFoundException{
		Client c = new Client();
		return c.viewData1();
		
	}

}
