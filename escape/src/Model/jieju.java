package Model;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;

import Server.Client;

public class jieju implements Serializable{
	private String gcontent;

	public jieju(String gcontent) {
		super();
		this.gcontent = gcontent;
	}

	public String getGcontent() {
		return gcontent;
	}

	public void setGcontent(String gcontent) {
		this.gcontent = gcontent;
	}
	public jieju(){
		
	}
	public ArrayList<jieju> viewData4() throws UnknownHostException, IOException, ClassNotFoundException{
		Client c = new Client();
		return c.viewData4();
	}
}
