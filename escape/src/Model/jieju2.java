package Model;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;

import Server.Client;

public class jieju2 implements Serializable{
	private String gcontent;

	public jieju2(String gcontent) {
		super();
		this.gcontent = gcontent;
	}

	public String getGcontent() {
		return gcontent;
	}

	public void setGcontent(String gcontent) {
		this.gcontent = gcontent;
	}
	public jieju2(){
		
	}
	public ArrayList<jieju2> viewData5() throws UnknownHostException, IOException, ClassNotFoundException{
		Client c = new Client();
		return c.viewData5();
		
	}

}
