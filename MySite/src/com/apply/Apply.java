package com.apply;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;

public class Apply extends HttpServlet {
    
    /**
     * Constructor of the object.
     *
     *
     */
    //初始化支付宝客户端
    public static String APP_ID = "2016081600258697";
    public static String APP_PRIVATE_KEY="MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDNMovxadDoYn9guavU67iYOn+ppDNRg0WXAo03cbi/QBNo9dRe9Hx/HYaD2ABSHDEwIf7urhFjzFaOIDrbRbPw9NJi4C/i3wfoMc9ef8eyA1OmH4yBwp77KeV2EUDJQw+lm4sSifT+v7SzlbIO4Nfcfj0fi8EEdFcStze6nfVDHVMiRe63w1+4E5TJixHLOmErCHgM6WCqPOZWdw7yXnwTHh3u8mKXlU74oCFNbyvv7+CNO2xzWTUb0xt+CYmqirYSYXL6AWc0f+TXahq6eds76RKxmtllxoJ5fv2PNmSDRMQW6y9Zg1mbY9lbEqZqeAOsPcgZR6E6H+xu8gq8Afy9AgMBAAECggEAEUyCmb6W+xBatrfQcanRrRu5aX7LSMLtWfbAGv1+Wrk3KbEXz02DNWAy1+ic1k9EIk+rY0nPc39liKPU8mlk6xpopidKQjEVRJD2b3wMRMidA7NDMClNJ9V3X8XClXUO26JKTizNN7DHtiAXm8N+zzrhQkiQ5CQ+tvg1PYlVhOvMTZ1wGV2kFK5dbyswz8hWCb7Ptv6JW+Q9x1zY/CWLfeqblS6FXpB5IJ4lgzqOaXj0SL4b4YVyo1Q3mRZd6Ew4zopXt5LU0Hk4znkHm9iXgMGyDNknV47HOyjQWH+ve3VRuVaeLM0jyP4MYCHFNmuKZ/Br8haA9eDbb2OQQ4UtAQKBgQDsblSclOultqIkb8yNd6jT7s74uSeSWaKW7hkooIMMAXJ32J3ueflWKk30MiB6r/5Vm1kmr6Ws4JgPScY85l6TOLAn3scYIEpxPd6Wz8A8qdlWCrS943dJw7s0GtKQBmBKlxjyQIzaaR/vwM3YBi7QBLo32RE1UonaTAo5NAvRwQKBgQDeLmrqrfOxL+V0ukbtdiCkWkGtZJx9cNLyVt6aDYj6fwQgDN9uvKNCwIv+/HH4R54+dcfs6U9ZTfTmbVlbAbL3NsW3EgcvAEh7ccwaL8EzwKpFxyNyKyXmj6zroqF0zLySZaBP77XVJC/s1nNzDpPyq7EpjJkQ7n+hWI+0qR3x/QKBgAHojhRJe3F1/O8QW/VUXu9/APqu++vJf296coeKbCRfqp3fCL9RCrswUjrDYNG8s+/a9ihCyLKRiYiuDsSVE3Raw8k+mhrOv+sUFcTf3mxe7pssMPNLb74Pr2YnRUXWV1aiy5fA/6IPsStNQhwZSK1zLFGhFet5RBWYAYkeq23BAoGAb0PnnycGBxHpYw92Pa0Oo7/fbCoahGdf/KSsTZHBq1C4jCRmMFqfl+o9MbDSknerM7RgLrCYYCy+HDderEipi0wOr6ODnXIS2l8ey25m3rf5jYAwrBgXnuMMweRr3sY5GUdzhRSShu7cYUrz/gaq6Lg6vIgAj44gtHhZXyviJzECgYBShUpoBgg8fKei2kvbts1WeHjcbIsJBNLJjqSF6a6sBkwcxucsvaf8i7E8feAtS3go8zCQcr8tLtz+nWBavRHFAbxQdg/L+khBl6kNiTz15W7qLiMnXpTVKCTIuZpdTihpascXNCD2SZfC0R4o79Osw21cra4lYKuBn6s3I3YFCQ==";
    public static String ALIPAY_PUBLIC_KEY="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzTKL8WnQ6GJ/YLmr1Ou4mDp/qaQzUYNFlwKNN3G4v0ATaPXUXvR8fx2Gg9gAUhwxMCH+7q4RY8xWjiA620Wz8PTSYuAv4t8H6DHPXn/HsgNTph+MgcKe+ynldhFAyUMPpZuLEon0/r+0s5WyDuDX3H49H4vBBHRXErc3up31Qx1TIkXut8NfuBOUyYsRyzphKwh4DOlgqjzmVncO8l58Ex4d7vJil5VO+KAhTW8r7+/gjTtsc1k1G9MbfgmJqoq2EmFy+gFnNH/k12oaunnbO+kSsZrZZcaCeX79jzZkg0TEFusvWYNZm2PZWxKmangDrD3IGUehOh/sbvIKvAH8vQIDAQAB";
    public static String URL="https://openapi.alipay.com/gateway.do";
    public static String FORMAT="json";
    public static String CHARSET="utf-8";
    public static String SIGN_TYPE="RSA2";
    
    
    public Apply() {
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
        
        response.setContentType("text/html;charset="+CHARSET);
        PrintWriter out = response.getWriter();
        
        //初始化客户端
        AlipayClient alipayClient = new DefaultAlipayClient(URL,APP_ID,APP_PRIVATE_KEY,FORMAT,CHARSET,ALIPAY_PUBLIC_KEY,SIGN_TYPE);
        
        //创建API对应的request
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        
        
        
        alipayRequest.setReturnUrl("http://domain.com/CallBack/return_url.jsp");
        alipayRequest.setNotifyUrl("http://domain.com/CallBack/notify_url.jsp");//在公共参数中设置回跳和通知地址
        alipayRequest.setBizContent("{" +
                                    "    \"out_trade_no\":\"20150320010101001\"," +
                                    "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
                                    "    \"total_amount\":88.88," +
                                    "    \"subject\":\"Iphone6 16G\"," +
                                    "    \"body\":\"Iphone6 16G\"," +
                                    "    \"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\"," +
                                    "    \"extend_params\":{" +
                                    "    \"sys_service_provider_id\":\"2088511833207846\"" +
                                    "    }"+
                                    "  }");//填充业务参数
        
        String form="";
        try{
            form = alipayClient.pageExecute(alipayRequest).getBody();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        out.write(form);
        
        
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
