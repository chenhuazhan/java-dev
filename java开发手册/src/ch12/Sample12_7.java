package ch12;

import java.net.*;
import java.io.*;
public class Sample12_7 {
	public static void main(String[] args)		
	{
		try{
			//调用ServerSocket构造器，创建监听9999端口的ServerSocket对象			
		    ServerSocket ss=new ServerSocket(9999);	
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
