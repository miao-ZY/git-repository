package Model;

import java.io.Serializable;

public class user implements Serializable{
	private String uid;
	private String upw;
	public user(String uid, String upw) {
		super();
		this.uid = uid;
		this.upw = upw;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	
	

}
