package ch27;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;
import java.awt.color.*;
import java.io.*;
public class Sample27_8 extends JFrame implements ActionListener
{
	//创建显示源图像的标签，并将其放置到滚动窗格中
	JLabel jls=new JLabel();
	JScrollPane jspz=new JScrollPane(jls);
	//创建显示目标图像的标签，并将其放置到滚动窗格中
	JLabel jlt=new JLabel();
	JScrollPane jspy=new JScrollPane(jlt);
	//创建分割窗格，并设置各子窗格中显示的控件
	JSplitPane jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jspz,jspy);
	//创建文件选择器
	JFileChooser jfc=new JFileChooser("d:\\");
	//创建菜单栏、菜单以及菜单项
	JMenuBar jmb=new JMenuBar();
	JMenu jm=new JMenu("卷积滤镜处理");
	JMenuItem[] jmi={new JMenuItem("加强边缘"),new JMenuItem("锐化"),
	                 new JMenuItem("模糊"),new JMenuItem("浮雕")};
	//创建表示不同滤镜的卷积矩阵数组
	float[][] data =
	{
	 //加强边缘
	 {0f,-1f,0f,
	  -1f,5f,-1f,
	  0f,-1f,0f},
	 //锐化 
     {-0.125f,-0.125f,-0.125f,
      -0.125f,2f,-0.125f,
      -0.125f,-0.125f,-0.125f},
     //模糊	
     {0.09375f,0.09375f,0.09375f,
      0.09375f,0.25f,0.09375f,
      0.09375f,0.09375f,0.09375f},
     //浮雕
     {2f,0f,2f,
      0f,0f,0f,
      2f,0f,-5f}
    };	
	//定义一个图标引用
	ImageIcon ii;
	public Sample27_8()
	{
		//加载选择的图片到图标对象中
		ii=this.chooserFile();
		//将图片设置到源标签中
		jls.setIcon(ii);
		//设置两个标签的水平、垂直对齐方式
		jls.setVerticalAlignment(JLabel.CENTER);
		jls.setHorizontalAlignment(JLabel.CENTER);
		jlt.setVerticalAlignment(JLabel.CENTER);
		jlt.setHorizontalAlignment(JLabel.CENTER);
		//将处理后的图片设置到目标标签中
		jlt.setIcon(ii);
		//设置分隔条的宽度以及初始位置
		jsp.setDividerLocation(500);
		jsp.setDividerSize(4);
		//将分割窗格添加到窗体中
		this.add(jsp);
		//循环将菜单项添加进菜单，并为每个菜单项注册动作事件监听器
		for(int i=0;i<jmi.length;i++)
		{
			jm.add(jmi[i]);
			jmi[i].addActionListener(this);
		}
		//将菜单添加进菜单栏，并将菜单栏添加进窗体
		jmb.add(jm);
		this.setJMenuBar(jmb);
		//设置窗体的标题、大小位置以及可见性
		this.setTitle("卷积滤镜处理示例");
		this.setBounds(0,0,1000,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//实现ActionListener接口中的事件处理方法
	public void actionPerformed(ActionEvent e)
	{
		for(int i=0;i<jmi.length;i++)
		{
			if(e.getSource()==jmi[i])
			{//对事件源进行判断，决定使用哪一种卷积矩阵进行处理
				//获取待处理图像的宽度与高度
				int width=ii.getImage().getWidth(null);
				int height=ii.getImage().getHeight(null); 
				//创建两个BufferedImage对象分别用来放置待处理图像与处理后的图像     
				BufferedImage sourceBuf=
				     new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
				BufferedImage targetBuf=
				     new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
				//将待处理图像绘制加载到源BufferedImage对像中
				Graphics g=sourceBuf.getGraphics();
				g.drawImage(ii.getImage(),0,0,Color.white,null);     
				//创建封装卷积矩阵的Kernel对象	
				Kernel kernel = new Kernel(3,3,data[i]);
				//创建ConvolveOp对象并进行卷积处理
				ConvolveOp co = new ConvolveOp(kernel,ConvolveOp.EDGE_NO_OP,null);
				co.filter(sourceBuf,targetBuf);		
				//获取处理后的图像并设置到目标标签中
				jlt.setIcon(new ImageIcon(targetBuf));
			}	
		}
	}	
	//加载选中图片的方法
	public ImageIcon chooserFile()
	{
		//弹出文件选择器
		int i=jfc.showOpenDialog(this);
		//获取选择文件的路径
		String dir=(jfc.getSelectedFile()!=null)?(jfc.getSelectedFile().getPath()):null;
		if(dir!=null&&!dir.equals(""))
		{
			//按指定的路径加载图片到图标对象中并返回
			return new ImageIcon(dir);
		}
		return null;
	}
	public static void main(String[] args)
	{
		//创建Sample27_8窗体对象
		new Sample27_8();
	}
}
