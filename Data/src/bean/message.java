package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.json.JSONArray;



import java.util.ArrayList;
import bean.kapian;
import java.util.List; 

public class message extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	
	
	
	public message() {
		super();
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

		 response.setHeader("Content-type", "text/html;charset=UTF-8");  
		 response.setContentType("text/html;charset=utf-8");  
		 
		
		
		List<kapian> li = new ArrayList<kapian>();
		
		li.add(new kapian("1.jpg","³ÂÓÀ¿µ","2345323","Å£±Æ","10234323","200%","ÖÜ"));
		li.add(new kapian("1.jpg","ÌÆÂ¶Â¶","123143","ÎÈ½¡","1234234","190%","ÖÜ"));
		li.add(new kapian("1.jpg","ËÎºÀ½Ü","2345323","Å£±Æ","10234323","200%","ÖÜ"));
		li.add(new kapian("1.jpg","Ð¡±ó","2345323","Å£±Æ","10234323","200%","ÖÜ"));
		li.add(new kapian("1.jpg","ÀîÑÐ","2345323","À÷º¦","234235","2000%","ÖÜ"));
		
		
		li.add(new kapian("1.jpg","³ÂÓÀ¿µ","2345323","Å£±Æ","10234323","200%","ÔÂ"));
		li.add(new kapian("1.jpg","ÌÆÂ¶Â¶","123143","ÎÈ½¡","1234234","190%","ÔÂ"));
		li.add(new kapian("1.jpg","ËÎºÀ½Ü","2345323","Å£±Æ","10234323","200%","ÔÂ"));
		li.add(new kapian("1.jpg","Ð¡±ó","2345323","Å£±Æ","10234323","200%","ÔÂ"));
		li.add(new kapian("1.jpg","ÀîÑÐ","2345323","À÷º¦","234235","2000%","ÔÂ"));
		
		
		li.add(new kapian("1.jpg","³ÂÓÀ¿µ","2345323","Å£±Æ","10234323","200%","Äê"));
		li.add(new kapian("1.jpg","ÌÆÂ¶Â¶","123143","ÎÈ½¡","1234234","190%","Äê"));
		li.add(new kapian("1.jpg","ËÎºÀ½Ü","2345323","Å£±Æ","10234323","200%","Äê"));
		li.add(new kapian("1.jpg","Ð¡±ó","2345323","Å£±Æ","10234323","200%","Äê"));
		li.add(new kapian("1.jpg","ÀîÑÐ","2345323","À÷º¦","234235","2000%","Äê"));
		
		
		li.add(new kapian("1.jpg","³ÂÓÀ¿µ","2345323","Å£±Æ","10234323","200%","×Ü"));
		li.add(new kapian("1.jpg","ÌÆÂ¶Â¶","123143","ÎÈ½¡","1234234","190%","×Ü"));
		li.add(new kapian("1.jpg","ËÎºÀ½Ü","2345323","Å£±Æ","10234323","200%","×Ü"));
		li.add(new kapian("1.jpg","Ð¡±ó","2345323","Å£±Æ","10234323","200%","×Ü"));
		li.add(new kapian("1.jpg","ÀîÑÐ","2345323","À÷º¦","234235","2000%","×Ü"));
		
		
		
		try{
		JSONArray json = new JSONArray();
		
		for(kapian a :li){
			JSONObject obj = new JSONObject();
			obj.put("imgurl",a.getImgurl());
			obj.put("name",a.getName());
			obj.put("money",a.getMoney());
			obj.put("style",a.getStyle());
			obj.put("num",a.getNum());
			obj.put("revenue",a.getRevenue());
			obj.put("id",a.getId());
			
			json.put(obj);
			
		
		}
		JSONObject js =new JSONObject();
		
		response.getWriter().print(json.toString());    
	    
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
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
