import gui.gui;

import java.awt.EventQueue;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	public static gui frame;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket service;
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new gui();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		//command command = null;
		//System.out.println("sfsdfsf"+command.ADDRESSBOOK.getValue());
		
		try {
			System.out.println("beagan now!");
			service = new ServerSocket(9999);
			while(true){
				Socket socket = service.accept();
				new Thread(new AndroidRunable(socket,frame)).start();
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
