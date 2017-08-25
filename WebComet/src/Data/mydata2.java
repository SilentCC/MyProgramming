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

import com.HelloWorldPushlet.HsPlushlet;
import com.HelloWorldPushlet.HsPlushlet2;

public class mydata2 extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	
	acceptData act =new acceptData();
	public mydata2() {
		super();
		act =new acceptData();
		act.start();
	}

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
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
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
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}

class acceptData extends Thread{
	
	public  HsPlushlet2  h = new HsPlushlet2();
	public void run()
	{
		
		try{
			
			 

			System.out.println("客户端链接成功");
			Socket socket =new Socket("192.168.3.60",2007);
			System.out.println("客户端链接成功");
			
			while(true){
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			if(reader.ready()){
				
				System.out.println("我已经接受了数据");
				String mess= reader.readLine();
				JSONObject js = new JSONObject(mess);  
				
			    System.out.println("姓名:"+js.get("name"));  
			    System.out.println("性别："+js.get("sex"));  
			    

				h.pullEvent(mess);
				System.out.println("oo");
			}
			Thread.sleep(1000);
			}
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
}
