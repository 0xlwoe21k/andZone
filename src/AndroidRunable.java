import gui.gui;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;


public class AndroidRunable  implements Runnable{

	gui frame;
	Socket socket= null;
	PhoneInfo phoneInfo;
	
	String[] columnNameString ={"手机型号","系统版本","网络状态","地理位置","上线时间","手机端IP","内部储蓄卡/GB","内存/GB"};
	
	public AndroidRunable(Socket _socket,gui _frame) {
		// TODO Auto-generated constructor stub
		socket = _socket;
		frame = _frame;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		phoneInfo = new PhoneInfo();
		String line  = null;
		InputStream in;
		OutputStream ou;
		
		String str = "is oK!";
		
		try {
			in = socket.getInputStream();
			ou = socket.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			ou.write(str.getBytes("gbk"));
						
			
			ou.flush();
			socket.shutdownOutput();
			
			String buff = null;
			
			while((line = br.readLine()) != null){
				//System.out.println(line.toString());
				buff =line;
				
			}
			

		      String[] str1 = buff.split("\\|");
		      Object []tmp = new Object[8];
		        for (int i= 0 ; i < str1.length; i++){
		        	System.out.println(str1[i]);
		        }
		        
		        tmp[0] = str1[0];
		        tmp[1] = str1[1];
		        tmp[2] = str1[2];
		        tmp[3] = str1[6];
		        tmp[4] = str1[7];
		        tmp[5] = str1[8];
		        tmp[6] = str1[9];
		        tmp[7] = str1[10];
		        
		        Vector row = new Vector(); 
		        Vector names = new Vector();
		        Vector data = new Vector();
		       
		        
		        for (int i = 0; i < tmp.length; i++) {
		        	row.add(tmp[i]);
				}
		       
		        for (int i = 0; i < tmp.length; i++) {
		        	names.add(columnNameString[i]);
				}
		        
		        
		        this.frame.model.setDataVector( data,  names); 
		        

					phoneInfo.PhoneModel = str1[0];
					phoneInfo.phoneVersion = str1[1];
					phoneInfo.networkStatus = str1[2];
					phoneInfo.iemi = str1[3];
					phoneInfo.Latitude = str1[4];
					phoneInfo.Longitude = str1[5];
					phoneInfo.addr = str1[6];
					phoneInfo.upTime = str1[7];
					phoneInfo.PhoneIP = str1[8];
					phoneInfo.SdcardSize = str1[9];
					phoneInfo.MemorySize =str1[10];
					                    
			for(int i=0 ; i < this.frame.table.getRowCount(); i++){
				
			}

				
		        //Object []tmp = {"android","4.4","wifi","123456","12:20","172.36.32.2","25/54","56/85"};
		        this.frame.model.addRow(tmp);
		        /*
			String[] sourceStrArray = buff.split("|");
			System.out.println(sourceStrArray.length);
	        for (int i = 0; i < sourceStrArray.length; i++) {
	            System.out.println(sourceStrArray[i]);
	        }
			*/
			ou.close();
			socket.close();
			br.close();
			in.close();
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	

}
