package com;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import sun.rmi.runtime.Log;
import nl.justobjects.pushlet.core.Dispatcher;
import nl.justobjects.pushlet.core.Event;
import nl.justobjects.pushlet.core.EventPullSource;
import nl.justobjects.pushlet.*;
import nl.justobjects.pushlet.core.EventSource;

public class HelloWorldPushlet implements Serializable{
	
	static public class HwPlushlet extends EventPullSource{
		
		protected long getSleepTime(){
			
			return 3000;
		}
		
		public Event pullEvent(){
			
			Event event = Event.createDataEvent("/cuige/he");
			event.setField("mess", "hello,world!Plushlet!");
			//System.out.println("ok");
			return event;
		}
		
		
	}
	
	static public class HsPlushlet implements EventSource{
		
		public void pullEvent(String message){
			
			Event event = Event.createDataEvent("/suige/he");
			event.setField("mess", message);
			Dispatcher.getInstance().multicast(event);
		}

		public void activate() {
			// TODO Auto-generated method stub
			
		}

		public void passivate() {
			// TODO Auto-generated method stub
			
		}

		public void stop() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
static public class HsPlushlet2 implements EventSource{
		
		public void pullEvent(String message){
			
			Event event = Event.createDataEvent("/cuige/he");
			event.setField("mes", message);
			Dispatcher.getInstance().multicast(event);
		}

		public void activate() {
			// TODO Auto-generated method stub
			
		}

		public void passivate() {
			// TODO Auto-generated method stub
			
		}

		public void stop() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	

}
