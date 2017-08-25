package Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import java.util.Random;
import server.getdata;
import com.HelloWorldPushlet.HsPlushlet;
import org.json.JSONObject;


public class mydata extends HttpServlet {

	/**
	 * Constructor of the object.
	 * 
	 * 
	 */
	
	
	public getData get;
	public String preData="";
	public String nowData="";
	public mydata() {
		
		
		super();
		//System.out.println("ok");
		get =new getData();
		get.start();
		
		//act =new acceptData();
		//act.start();
		
		try{
			Thread.sleep(5000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
	
	}
	
	public String jsondata;

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		

		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
	
		
		nowData=get.data;
		
		if(preData==""||nowData!=preData)
		{
			preData=nowData;
			out.write(nowData);

			out.flush();
			out.close();
		}
		
		
		
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}

class getData extends Thread{
	
	
	public HsPlushlet hs = new HsPlushlet();

	public getData(){
	
	}
	String data;
	
	Random ran = new Random();
	private static String string = "abcdefghijklmnopqrstuvwxyz"; 
	
	public void run(){
		
		while(true){
			
			try{
				int time=ran.nextInt(5000)%(2000)+3000;
				String name="";
				String sex="";
				int len=string.length();
				
				for(int i=0;i<4;i++)
					name+=string.charAt(ran.nextInt(len-1));
				
				for(int i=0;i<2;i++)
					sex=(ran.nextInt(2)==0?"boy":"girl");
					
				
				data="{\"name\":\""+name+"\",\"sex\":\""+sex+"\"}";
				
				Thread.sleep(time);
				
				hs.pullEvent(data);
				System.out.println("ok");
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			
		}
		
	}
	
}


	
		
	
