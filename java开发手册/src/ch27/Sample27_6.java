package ch27;
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.awt.color.*;
import java.io.*;
public class Sample27_6 extends JFrame
{
	//创建显示源图像的标签
	JLabel jls=new JLabel();
	//将显示源图象的标签放到滚动窗格中
	JScrollPane jspz=new JScrollPane(jls);
	//创建显示目标图像的标签
	JLabel jlt=new JLabel();
	//将显示目标图象的标签放到滚动窗格中
	JScrollPane jspy=new JScrollPane(jlt);
	//创建分割窗格
	JSplitPane jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jspz,jspy);
	//创建文件选择器
	JFileChooser jfc=new JFileChooser("D:\\");
	public Sample27_6()
	{
		//加载选择的图片
		ImageIcon ii=this.chooserFile();
		//将图片设置到源标签中
		jls.setIcon(ii);
		//设置源图象标签的水平、垂直对齐方式为居中
		jls.setVerticalAlignment(JLabel.CENTER);
		jls.setHorizontalAlignment(JLabel.CENTER);
		//设置目标图象标签的水平、垂直对齐方式为居中
		jlt.setVerticalAlignment(JLabel.CENTER);
		jlt.setHorizontalAlignment(JLabel.CENTER);
		//获取处理后图象对应的图标
		ii=this.processGrayImage(ii.getImage());
		//将处理后的图片设置到目标标签中
		jlt.setIcon(ii);
		//设置分隔条的初始位置
		jsp.setDividerLocation(500);
		//设置分隔条的宽度
		jsp.setDividerSize(4);
		//将分割窗格添加到窗体中
		this.add(jsp);
		//设置窗体的标题、大小位置以及可见性
		this.setTitle("图像灰度处理演示");
		this.setBounds(0,0,1000,500);
		this.setVisible(true);
		//设置窗体的默认关闭动作
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
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
		else
		{
			return null;
		}		
	}	
	//对图象进行灰度处理的方法
	public ImageIcon processGrayImage(Image source)
	{
		//获取图像的宽度与高度
		int width=source.getWidth(null);
		int height=source.getHeight(null);
		//创建表示源图象的BufferedImage对象
		BufferedImage sourceBuf=new BufferedImage(
			                           width,height,BufferedImage.TYPE_INT_ARGB);
		//创建表示处理后目标图象的BufferedImage对象
		BufferedImage targetBuf=new BufferedImage(
			                        width,height,BufferedImage.TYPE_USHORT_GRAY);
		//获取表示源图象的BufferedImage对象的画笔
		Graphics g=sourceBuf.getGraphics();
		//将待处理的图像绘制到源BufferedImage对像中
		g.drawImage(source,0,0,Color.white,null);      
		//创建用来进行灰度处理的ColorConvertOp对象
		ColorConvertOp cco=new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_sRGB),
		                                 ColorSpace.getInstance(ColorSpace.CS_GRAY),null);
		//进行灰度处理
		cco.filter(sourceBuf,targetBuf);      
		//返回处理后图像对应的图标对象
		return new ImageIcon(targetBuf);
	}	
	public static void main(String[] args)
	{
		//创建Sample27_6窗体对象
		new Sample27_6();
	}
}
