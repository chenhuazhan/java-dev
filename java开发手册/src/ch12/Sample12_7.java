package ch12;

import java.net.*;
import java.io.*;
public class Sample12_7 {
	public static void main(String[] args)		
	{
		try{
			//����ServerSocket����������������9999�˿ڵ�ServerSocket����			
		    ServerSocket ss=new ServerSocket(9999);	
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
