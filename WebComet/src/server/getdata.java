package server;

import java.net.*;

import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.lang.Thread;

import org.json.JSONObject;

import com.HelloWorldPushlet.HsPlushlet;

public class getdata {
	

	
	public static void main(String args[]){
		
		acceptData g=new acceptData();
		g.start();
	}
		
		

}

class acceptData extends Thread{
	
	public  HsPlushlet  h = new HsPlushlet();
	public void run()
	{
try{
			
			 

			
			Socket socket =new Socket("192.168.3.60",2007);
			System.out.println("�ͻ������ӳɹ�");
			
			while(true){
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			if(reader.ready()){
				
				System.out.println("���Ѿ�����������");
				String mess= reader.readLine();
				JSONObject js = new JSONObject(mess);  
				
			    System.out.println("����:"+js.get("name"));  
			    System.out.println("�Ա�"+js.get("sex"));  
			    

				h.pullEvent(mess);
			}
			Thread.sleep(1000);
			}
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	}
		
	

