package ch16;
	//主类
	public class Sample16_12
	{
		public static void main(String args[])
		{
			//创建两个资源对象
			Object resource1=new Object();
			Object resource2=new Object(); 
			//锁定resource1资源的同步语句块
			synchronized(resource1)
			{
				try
				{
					//调用没有被锁定资源resource2的wait方法
					resource2.wait();							
				}
			    catch(Exception e)
			    {
			    	e.printStackTrace();
			    }			
			}
		}
	}
