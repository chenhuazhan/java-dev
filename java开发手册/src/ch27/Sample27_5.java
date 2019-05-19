package ch27;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.sun.image.codec.jpeg.*;
import java.awt.image.*;
import java.io.*;
//扩展JFrame类
public class Sample27_5 extends JFrame implements ActionListener
{
	//创建各种菜单控件
	private JMenuBar jmb=new JMenuBar();
	private JMenu jm=new JMenu("操作");
	private JMenuItem[] jmi={new JMenuItem("开始截图"),new JMenuItem("文件保存"),
							new JMenuItem("清空内容"),new JMenuItem("退出")};
	//创建用来显示抓取图象的标签
	private JLabel jl=new JLabel();
	//创建放置标签的滚动窗体
	private JScrollPane jsp=new JScrollPane(jl);
	//创建文件选择器
	private JFileChooser jfc=new JFileChooser();
	//定义Image类型的引用image
	private Image image;
	public Sample27_5()
	{
		for(int i=0;i<jmi.length;i++)
		{//将菜单项添加进菜单，并为菜单项注册动作事件监听器
			jm.add(jmi[i]);
			jmi[i].addActionListener(this);
		}
		//设置各个菜单项的快捷键
		jmi[0].setAccelerator
		  (KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK+InputEvent.ALT_MASK));
		jmi[1].setAccelerator
		  (KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_MASK));
		jmi[2].setAccelerator
		  (KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_MASK));
		jmi[3].setAccelerator
		  (KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_MASK));
		//设置菜单项的可用状态
		this.setMenuItemStatus(false);
		//将菜单添加进菜单栏，并将菜单栏设置到窗体中
		jmb.add(jm);
		this.setJMenuBar(jmb);
		//将包含标签的滚动窗体添加进窗体中
		this.add(jsp);
		//设置窗体的大小位置、标题以及可见性
		this.setBounds(100,100,500,400);
		this.setTitle("抓屏软件示例");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//设置菜单项可用状态的方法
	public void setMenuItemStatus(boolean flag)
	{//flag==true 已经抓屏 flag==false 没有抓屏 
		jmi[1].setEnabled(flag);
		jmi[2].setEnabled(flag);
	}
	//实现ActionListener接口中的方法
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==jmi[0])
		{//点击截图菜单项执行的代码
			//先将窗体最小化
			this.setExtendedState(JFrame.ICONIFIED);
			//获取当前屏幕图像
			image=this.captureImage();
			//将窗体最大化
			this.setExtendedState(JFrame.MAXIMIZED_BOTH);
			//将将图像在标签中显示
			jl.setIcon(new ImageIcon(image));
			//设置菜单项的可用状态
			this.setMenuItemStatus(true);
		}
		else if(ae.getSource()==jmi[1])
		{//点击保存文件菜单项执行的代码
			this.saveAs();
		}
		else if(ae.getSource()==jmi[2])
		{//点击清空内容菜单项执行的代码
			//设置标签内容为空
			jl.setIcon(null);
			//设置菜单项的可用状态
			this.setMenuItemStatus(false);
			//将image引用置空
			image=null;
		}
		else if(ae.getSource()==jmi[3])
		{//点击退出菜单项执行的代码
			System.exit(0);
		}
	}
	public Image captureImage()
	{
		Image temp=null;
		try
		{
			//创建Robot对象
			Robot r=new Robot();
			//获取屏幕的尺寸大小
			Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
			//设置截图的区域
			Rectangle rec=new Rectangle(0,0,d.width,d.height);
			//设置延迟
			Thread.sleep(100);
			//截取指定区域的图像
			temp=r.createScreenCapture(rec);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return temp;//将图像返回
	}
	//保存抓取图片的方法
	public void saveAs()
	{
		int save=jfc.showSaveDialog(this);//弹出保存文件对话框
		if(save==JFileChooser.APPROVE_OPTION)//如果点击保存执行的代码
		{
			try
			{   //根据用户的选择生成要保存的文件名
				String fname=jfc.getSelectedFile().getPath()+".jpg";
				//创建一个输出流
				FileOutputStream fos=new FileOutputStream(fname);
				//将输出流封装进JPEG编码器中，即将输出流连接到编码器
				JPEGImageEncoder jie=JPEGCodec.createJPEGEncoder(fos);
				//对指定图像进行编码
				jie.encode((BufferedImage)image);
				//刷新并关闭输出流
				fos.flush();
				fos.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}		
	}
	public static void main(String[] args)
	{
		//创建Sample27_5窗体对象
		new Sample27_5();
	}
}
