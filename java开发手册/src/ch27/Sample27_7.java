package ch27;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.image.*;
import java.awt.color.*;
import java.io.*;
public class Sample27_7 extends JFrame implements ChangeListener
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
	JFileChooser jfc=new JFileChooser("D:\\");
	//创建表示通道的标签数组
	JLabel[] jl={new JLabel("红色"),new JLabel("绿色"),new JLabel("蓝色")};
	//创建3个用来控制各通道颜色分量的滑块
	JSlider[] js={new JSlider(-255,255),new JSlider(-255,255),new JSlider(-255,255)};
	//创建一个面板
	JPanel jp=new JPanel();
	//定义一个图标引用
	ImageIcon ii;
	//创建自定义的过滤器对象
	MyColorFilter mcf=new MyColorFilter(js[0].getValue(),js[1].getValue(),js[2].getValue());
	public Sample27_7()
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
		this.add(jsp,BorderLayout.CENTER);
		//将标签以及滑块添加到面板中，并为滑块注册监听器
		for(int i=0;i<js.length;i++)
		{
			jp.add(jl[i]);
			jp.add(js[i]);
			js[i].addChangeListener(this);
		}
		//将面板添加到窗体中
		this.add(jp,BorderLayout.SOUTH);
		//设置窗体的标题、大小位置以及可见性
		this.setTitle("RGB色彩通道过滤");
		this.setBounds(0,0,1000,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	//实现ChangeListener接口中的事件处理方法
	public void stateChanged(ChangeEvent e)
	{
		//设置3个分量的值
		mcf.setRGBValue(js[0].getValue(),js[1].getValue(),js[2].getValue());
		//获取过滤后的图象
	    Image tempImg=createImage(new FilteredImageSource(ii.getImage().getSource(),mcf));
		//将处理后的图象显示到目标标签中
		jlt.setIcon(new ImageIcon(tempImg));
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
		//创建Sample27_7窗体对象
		new Sample27_7();
	}
}
//自定义的RGB色彩通道过滤器类
class MyColorFilter extends RGBImageFilter
{
	//RGB色彩通道各自的调整值
	int rc,gc,bc;
	public MyColorFilter(int rc,int gc,int bc)
	{//初始化各个色彩通道的调整值
		this.rc=rc;this.bc=bc;this.gc=gc;
	}
	public void setRGBValue(int rc,int gc,int bc)
	{//设置各个色彩通道的调整值
		this.rc=rc;this.bc=bc;this.gc=gc;		
	}
	public int filterRGB(int x, int y, int rgb) 
	{
		//取出红色通道中的数值
		int tempRed=(rgb&0x00ff0000)>>16;
		//对红色通道值进行处理
		tempRed+=rc;
		//判断处理后的数值是否越位，若越位则进行处理
		tempRed=(tempRed<255)?((tempRed>0)?tempRed:0):255;
		//将处理后的值移回指定位
		tempRed=tempRed<<16;
		//取出绿色通道中的数值
		int tempGreen=(rgb&0x0000ff00)>>8;
		//对绿色通道值进行处理
		tempGreen+=gc;
		//判断处理后的数值是否越位，若越位则进行处理
		tempGreen=(tempGreen<255)?((tempGreen>0)?tempGreen:0):255;
		//将处理后的值移回指定位
		tempGreen=tempGreen<<8;
		//取出蓝色通道中的数值
		int tempBlue=(rgb&0x000000ff);
		//对蓝色通道值进行处理
		tempBlue+=bc;
		//判断处理后的数值是否越位，若越位则进行处理
		tempBlue=(tempBlue<255)?((tempBlue>0)?tempBlue:0):255;	 
		//将红绿蓝三色通道的值与颜色本身中高8位用来控制透明度的值进行按位或运算并返回
		return (rgb&0xff000000)|tempRed|tempGreen|tempBlue;
	}  
}
