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


public class SocketClient2 {
	
	public static void main(String agrs[]){
		BufferedReader reader;

		BufferedWriter writer;
		
		try{
		
		Socket s=new Socket("127.0.0.1",1234);
		
		InputStream inputStream = s.getInputStream();

		//�õ���ȡBufferedReader����

		reader = new BufferedReader(new InputStreamReader(inputStream,"utf-8"));

		writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream(),"utf-8"));
		
		while(true){
			
			if (reader.ready()) {

				String comeData=reader.readLine();

				JSONObject msgJson = new JSONObject(comeData);


				System.out.println("���ǿͻ���2----->�û���"+msgJson.getInt("from")+"���㷢�͵���Ϣ����Ϊ��"+msgJson.getString("msg"));

			}

			
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
