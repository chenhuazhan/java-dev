package ch26;

import java.awt.*;
import javax.swing.*;
//继承并扩展JPanel类
public class Sample26_3 extends JPanel
{
	//声明表示字体大小的常量
	static int fs=36;
	//创建字体数组
	Font[] f={new Font("宋体",Font.BOLD|Font.ITALIC,fs),
			new Font("隶书",Font.BOLD|Font.ITALIC,fs),
			new Font("宋体",Font.ITALIC,fs),
			new Font("隶书",Font.ITALIC,fs),
			new Font("宋体",Font.BOLD,fs),
			new Font("隶书",Font.BOLD,fs),
			};
	//重写paint方法
	public void paint(Graphics g)
	{
		//设置画笔颜色
		g.setColor(Color.WHITE);
		//将画布填充为白色
		g.fillRect(0,0,1200,1200);
		//循环绘制不同字体的文本
		for(int i=0;i<f.length;i++)
		{
			//设置字体
			g.setFont(f[i]);
			//设置画笔颜色
			g.setColor(Color.LIGHT_GRAY);
			//按指定字体绘制文本（阴影部分）
			g.drawString("您好，欢迎您！！！Hello!!!",8+(i%2)*505,43+(i/2)*70);
			//设置画笔颜色
			g.setColor(Color.black);
			//按指定字体绘制文本（实际部分）
			g.drawString("您好，欢迎您！！！Hello!!!",5+(i%2)*505,40+(i/2)*70);
		}
	}
	public static void main(String[] args)
	{
		//创建画布
		Sample26_3 jp=new Sample26_3();
		//创建窗体
		JFrame jf=new JFrame();
		//将画布添加进窗体
		jf.add(jp);
		//设置窗体大小位置、标题以及可见性
		jf.setTitle("绘制各种字体");
		jf.setBounds(0,0,1020,240);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
