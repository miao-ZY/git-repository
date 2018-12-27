package Server;

import java.io.*;

import java.net.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Cduihua;
import Model.DataConnect;
import Model.beijing;
import Model.event;
import Model.jieju;
import Model.jieju2;
import Model.pingfen;
import Model.user;

public class Server implements Runnable {
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket s;
	final int LOGIN = 1001;
	final int REG = 1002;
	final int FS = 1003;
	
	
	public Server() throws IOException, SQLException, ClassNotFoundException{
		ServerSocket ss = new ServerSocket(12344);
		 System.out.println(ss);
		 while(true){
		 s = ss.accept();
		 System.out.println(s);
		 new Thread(this).start();
		 }

	}
	
	private void insert() throws IOException, SQLException ,ClassNotFoundException {
		// TODO Auto-generated method stub
		pingfen u =null;
		String fenshu =ois.readUTF();
		String content =ois.readUTF();
		String sql = "insert into pingfen values('"+fenshu+"','"+content+"')";
		try {
			DataConnect.getStatment().executeUpdate(sql);
			oos.writeObject(new pingfen(fenshu,content));
			oos.flush();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			oos.writeObject(null);
			oos.flush();
		} 
	}

	private void register() throws IOException, SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		user u = null;
		String uid =ois.readUTF();
		String upw = ois.readUTF();
		String sql = "insert into user values('"+uid+"','"+upw+"')";
		try {
			DataConnect.getStatment().executeUpdate(sql);
			oos.writeObject(new user(uid,upw));
			oos.flush();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			oos.writeObject(null);
			oos.flush();
		}	
	}

	private void login() throws IOException, SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		user u = null;
		String uid =ois.readUTF();
		String upw = ois.readUTF();
		String sql = "select * from user where uid='"+uid+"' and upw ='"+upw+"'";
		ResultSet rs = DataConnect.getStatment().executeQuery(sql);
		if(rs.next())
			u = new user(rs.getString(1),rs.getString(2));
		oos.writeObject(u);
		oos.flush();
		
	}
	public void run() {
		try {
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
			int command=ois.readInt();
			if (command == LOGIN) {
				login();
			}
			if (command ==REG) {
				register();
			}
			if (command ==FS) {
				insert();
			}
			if (command == 1004){
				String sql="select * from beijing";
				ResultSet rs =DataConnect.getStatment().executeQuery(sql);
				ArrayList<beijing> beijings = new ArrayList<beijing>();
				while(rs.next()){
					beijings.add(new beijing(rs.getString(1)));
				}
				oos.writeObject(beijings);
				oos.flush();
			}
			if (command == 1005){
				String sql="select * from cduihua";
				ResultSet rs =DataConnect.getStatment().executeQuery(sql);
				ArrayList<Cduihua> Cduihuas = new ArrayList<Cduihua>();
				while(rs.next()){
					Cduihuas.add(new Cduihua(rs.getString(1)));
				}
				oos.writeObject(Cduihuas);
				oos.flush();
			}
			if (command == 1006){
				String sql="select * from event";
				ResultSet rs =DataConnect.getStatment().executeQuery(sql);
				ArrayList<event> events = new ArrayList<event>();
				while(rs.next()){
					events.add(new event(rs.getString(1)));
				}
				oos.writeObject(events);
				oos.flush();
			}
			if (command ==1007){
				String sql="select * from jieju";
				ResultSet rs =DataConnect.getStatment().executeQuery(sql);
				ArrayList<jieju> jiejus = new ArrayList<jieju>();
				while(rs.next()){
					jiejus.add(new jieju(rs.getString(1)));	
				}
				oos.writeObject(jiejus);
				oos.flush();
			}
			if (command ==1008){
				String sql="select * from jieju2";
				ResultSet rs =DataConnect.getStatment().executeQuery(sql);
				ArrayList<jieju2> jieju2s = new ArrayList<jieju2>();
				while(rs.next()){
					jieju2s.add(new jieju2(rs.getString(1)));	
				}
				oos.writeObject(jieju2s);
				oos.flush();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public static void main(String[] args){
		try {
			new Server();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
