package MyServer;



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



//���͵�ַ��http://blog.csdn.net/dmk877/article/details/50893635

public class MySocketServer {



	private static final int SOCKET_PORT = 1234;

	private ServerSocket serverSocket = null;

	private boolean flag = true;

	private int socketId;

	

	private ArrayList<JSONObject> mMsgList = new ArrayList<JSONObject>();

	private ArrayList<SocketThread> mThreadList = new ArrayList<SocketThread>();
	
	private SocketThread sThreadList=null;
	private SocketThread eThreadList=null;




	public static void main(String[] args) {

		MySocketServer socketServer = new MySocketServer();

		socketServer.initSocket();

	}



	private void initSocket() {

		try {

			serverSocket = new ServerSocket(SOCKET_PORT);

			System.out.println("�����Ѿ��������˿ں�:" + SOCKET_PORT);

			startMessageThread();

			while (flag) {

				Socket clientSocket = serverSocket.accept();
				System.out.println(clientSocket.getInetAddress());

				SocketThread socketThread = new SocketThread(clientSocket,socketId++);

				socketThread.start();

				mThreadList.add(socketThread);

			}



		} catch (IOException e) {

			e.printStackTrace();

		}

	}



	public class SocketThread extends Thread {



		public Socket socket;

		public int mSocketId;

		public BufferedReader reader;

		public BufferedWriter writer;



		public SocketThread(Socket clientSocket, int socketId) {

			this.mSocketId=socketId;

			this.socket = clientSocket;

			

			//��ȡ������

			InputStream inputStream;

			try {

				inputStream = socket.getInputStream();

				//�õ���ȡBufferedReader����

				reader = new BufferedReader(new InputStreamReader(inputStream,"utf-8"));

				writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));

				System.out.println("��ע���û���idΪ��"+mSocketId);
			

			} catch (IOException e) {

				e.printStackTrace();

			}

			

		}



		@Override

		public void run() {

			super.run();



			try {

				//ѭ����ȡ�ͻ��˷���������Ϣ

				while (flag) {
					
				

					//if (reader.ready()) {
						System.out.println("1");
						

						String comeData=reader.readLine();
						System.out.println(comeData);

						JSONObject msgJson = new JSONObject(comeData);
						try{
							
							if(msgJson.getInt("status")==1){
								
								sThreadList=this;
								System.out.println("���������������");
							
							continue;
						}
						else if(msgJson.getInt("status")==2){
							eThreadList=this;
							System.out.println("���������������");
							continue;
							
						}
						}catch(Exception e){
							
						}
						
					
						//System.out.println(msgJson.getString("info"));
						mMsgList.add(msgJson);
						

					}

					Thread.sleep(100);

				//}

			} catch (Exception e) {

				//e.printStackTrace();

			}



		}

	}

	

	public void startMessageThread() {

		new Thread(){

			@Override

			public void run() {

				super.run();

				try {

					while(flag) {

						if(mMsgList.size() > 0)
						{
							
							BufferedWriter writer = eThreadList.writer;
								
									JSONObject json=mMsgList.get(0);
									if(json.getInt("status")==3){
										
										 writer = sThreadList.writer;
									}
									else{
									
										 writer = eThreadList.writer;
									}

									writer.write(mMsgList.get(0)+"\n");

									writer.flush();

									System.out.println("ת����Ϣ�ɹ�");

								

								

							

							mMsgList.remove(0);

						}

						Thread.sleep(200);

					}

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		}.start();

	}

	

	private String getTime(long millTime) {

		Date d = new Date(millTime);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println(sdf.format(d));

		return sdf.format(d);

	}



}

