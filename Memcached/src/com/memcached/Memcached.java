package com.memcached;

import com.danga.MemCached.MemCachedClient;

import com.danga.MemCached.SockIOPool;
import com.sun.istack.internal.Pool;
import bean.testbean;

public class Memcached {
	
	protected static MemCachedClient mcc = new MemCachedClient();
	
	static{	
	//���û���������б�
	String[] servers = {
			
			"192.168.1.117:11211"
			
	};
	
	  // ����һ��Socked���ӳ�ʵ��
    SockIOPool pool = SockIOPool.getInstance();
    
    Integer[] weights={3};
 // �����ӳ����÷�������Ȩ��
    pool.setServers(servers);
    pool.setWeights(weights);
    
    pool.setNagle(false);
    pool.setSocketTO(3000);
    pool.setSocketConnectTO(0);

   // initialize the connection pool
    pool.initialize();
    
	}
	
	public static void main(String args[]){
		
		 testbean bean=new testbean();  
	     bean.setName("lulu");
	     bean.setSex("girl");
	     
	     mcc.set("person", bean);

		
	     mcc.set("name","chenyongkang");
	     
	     
	     testbean b =(testbean)mcc.get("person");
	     
		System.out.println("������"+mcc.get("name"));
		System.out.println("����"+b.getName()+"  �Ա�:"+b.getSex());
	}
	
}
