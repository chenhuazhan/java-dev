package ch16;
	//����
	public class Sample16_12
	{
		public static void main(String args[])
		{
			//����������Դ����
			Object resource1=new Object();
			Object resource2=new Object(); 
			//����resource1��Դ��ͬ������
			synchronized(resource1)
			{
				try
				{
					//����û�б�������Դresource2��wait����
					resource2.wait();							
				}
			    catch(Exception e)
			    {
			    	e.printStackTrace();
			    }			
			}
		}
	}
