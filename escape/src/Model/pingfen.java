package Model;

import java.io.Serializable;

public class pingfen implements Serializable{
	private String fenshu;
	private String content;
	public pingfen(String fenshu, String content) {
		super();
		this.fenshu = fenshu;
		this.content = content;
	}
	public String getFenshu() {
		return fenshu;
	}
	public void setFenshu(String fenshu) {
		this.fenshu = fenshu;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	

}
