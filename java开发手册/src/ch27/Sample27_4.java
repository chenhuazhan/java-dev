package ch27;
import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import javax.swing.filechooser.FileFilter;
import java.io.*;
import Acme.JPM.Encoders.*;
public class Sample27_4
{
	public static void main(String args[]) throws Exception 
	{
		//创建文件打开对话框
		JFileChooser jfc=new JFileChooser("d:\\");
		//创建jpg文件类型过滤器
		FileFilter filterJpeg = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
		//删除默认的文件后缀类型过滤器
		jfc.removeChoosableFileFilter(jfc.getFileFilter());
		//为文件对话框设置后缀过滤器
		jfc.addChoosableFileFilter(filterJpeg);		
		//显示文件对话框
		jfc.showDialog(null,"请选择要转换的图片");
		//获取图片文件路径
		String path=jfc.getSelectedFile().getAbsolutePath();
		//获取文件名
		String jpegName=jfc.getSelectedFile().getName();
		//生成新的gif文件名
		String gifName=jpegName.substring(0,jpegName.indexOf("."))+".gif";
		//加载图片获取Image对象
		Image image=(new ImageIcon(path)).getImage();
		System.out.println("步骤1：图片文件"+jpegName+"加载成功！！！");
		//创建输出流
		OutputStream fout=new FileOutputStream(gifName);
		//创建GifEncoder对象
		GifEncoder ge=new GifEncoder(image,fout);
		//进行编码
		ge.encode();
		//刷新输出流
		fout.flush();
		//关闭输出流
		fout.close();
		System.out.println("步骤2：图片文件"+gifName+"生成成功！！！");	
	}
}
