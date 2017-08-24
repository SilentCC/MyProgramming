package MyClient;

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.IOException;

import java.io.InputStream;

import java.io.InputStreamReader;

import java.io.OutputStreamWriter;

import java.net.ServerSocket;

import java.net.Socket;

import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.Date;



import org.json.JSONObject;
import MyServer.Message;

public class SocketClient {
	
	
	private Socket s=null;
	private BufferedReader reader;
	private BufferedWriter writer;

	public static void main(String agrs[]){
		
	 SocketClient sc=new SocketClient();
		sc.initSocket();
		
		
	}
	public void initSocket(){
		
		try{
			
			s=new Socket("127.0.0.1",1234);
			
			
			//getMessageThread();
		
		InputStream inputStream = s.getInputStream();

		//得到读取BufferedReader对象

		reader = new BufferedReader(new InputStreamReader(inputStream,"utf-8"));

		writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream(),"utf-8"));
		
		JSONObject json = new JSONObject();
		
		json.put("status",0);
		
		writer.write(json.toString());
		writer.flush();
		writer.close();
		//s.close();
		//System.out.println("链接成功");
		//String comeData=reader.readLine();
		//System.out.println("我是客户端------>"+comeData);
		
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
		
		
	}
	
	public void getMessageThread(){
		
		new Thread(){
			
			public void run(){
				super.run();
				
				while(true){
					
					String comeData;
					try {
						comeData = reader.readLine();
						
						System.out.println("我是客户端------->服务器："+comeData);
						
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		}.start();
		
		
	}

}
