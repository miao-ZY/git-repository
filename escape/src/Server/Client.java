package Server;

import java.io.*
;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import Model.Cduihua;
import Model.beijing;
import Model.event;
import Model.jieju;
import Model.jieju2;
import Model.pingfen;
import Model.user;

public class Client {
	static ObjectOutputStream oos;
	static ObjectInputStream ois;
	final static int LOGIN = 1001;
	final static int REG = 1002;
	final static int FS = 1003;
	
	
	public Client() throws UnknownHostException, IOException{
		Socket s = new Socket("10.51.160.87",12344);
		oos = new ObjectOutputStream(s.getOutputStream());
		ois = new ObjectInputStream(s.getInputStream());
	}
	public user login(String uid,String upw) throws IOException, ClassNotFoundException{
		oos.writeInt(LOGIN);
		oos.flush();
		oos.writeUTF(uid);
		oos.flush();
		oos.writeUTF(upw);
		oos.flush();
		return (user)ois.readObject();
	}
	public user register(String uid,String upw) throws IOException, ClassNotFoundException{
		oos.writeInt(REG);
		oos.flush();
		oos.writeUTF(uid);
		oos.flush();
		oos.writeUTF(upw);
		oos.flush();
		return (user)ois.readObject();
	}
	public pingfen insert(String fenshu,String content) throws IOException, ClassNotFoundException{
		oos.writeInt(FS);
		oos.flush();
		oos.writeUTF(fenshu);
		oos.flush();
		oos.writeUTF(content);
		oos.flush();
		return (pingfen)ois.readObject();
	}
	public ArrayList<beijing> viewData() throws IOException, ClassNotFoundException{
		oos.writeInt(1004);
		oos.flush();
		 ArrayList<beijing> beijings =( ArrayList<beijing>)ois.readObject();
		return beijings;	 
	}
	public ArrayList<Cduihua> viewData1() throws IOException, ClassNotFoundException{
		oos.writeInt(1005);
		oos.flush();
		ArrayList<Cduihua> Cduihuas = (ArrayList<Cduihua>)ois.readObject();
		return Cduihuas;
	}
	public ArrayList<event> viewData3() throws IOException, ClassNotFoundException{
		oos.writeInt(1006);
		oos.flush();
		ArrayList<event> events = (ArrayList<event>) ois.readObject();
		return events;	
	}
	public ArrayList<jieju> viewData4() throws IOException, ClassNotFoundException{
		oos.writeInt(1007);
		oos.flush();
		ArrayList<jieju> jiejus=(ArrayList<jieju>) ois.readObject();
		return jiejus;
	}
	public ArrayList<jieju2> viewData5() throws IOException, ClassNotFoundException{
		oos.writeInt(1008);
		oos.flush();
		ArrayList<jieju2> jieju2s =(ArrayList<jieju2>)ois.readObject();
		return jieju2s;
		}

}
