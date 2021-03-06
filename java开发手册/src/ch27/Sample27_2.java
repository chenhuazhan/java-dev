package ch27;
import java.awt.*;
import javax.swing.*;
//自定义的图标类
class MyIcon implements Icon
{
	//定义描述图标宽度与高度的成员变量
	private int width=400;
	private int height=300;
	//实现paintIcon方法
	public void paintIcon(Component c,Graphics g,int x,int y)
	{
		//打开抗锯齿
		Graphics2D g2=(Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		                                   RenderingHints.VALUE_ANTIALIAS_ON);
		//自定义的图标绘制代码
		g.setColor(new Color(10,10,10,125));
		g.fillRect(10,10,90,90);
		g.fillOval(260,10,150,90);
		g.setColor(new Color(100,100,100,125));
		g.fillRect(70,70,90,90);
		g.fillOval(320,70,150,90);
		g.setColor(new Color(190,190,190,125));
		g.fillRect(130,130,90,90);	
		g.fillOval(380,130,150,90);	
	}
	//实现getIconWidth方法
	public int getIconWidth()
	{
		return this.width;
	}
	///实现getIconHeight方法
	public int getIconHeight()
	{
		return this.height;
	}
}
//主类
public class Sample27_2 extends JFrame
{
	//窗体构造器
	public Sample27_2()
	{
		//创建自定义的图标对象
		Icon icon=new MyIcon();
		//创建用于显示图标的标签
		JLabel jp=new JLabel(icon,JLabel.CENTER);
		//设置标签的背景色为白色
		jp.setBackground(Color.white);
		//设置标签背景为不透明
		jp.setOpaque(true);
		//将标签添加进窗体中
		this.add(jp);
		//设置窗体的关闭动作、标题、大小位置以及可见性
		this.setTitle("自定义图标演示");
		this.setBounds(100,100,550,260);
		this.setVisible(true);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//主方法
	public static void main(String args[])
	{
		//创建Sample27_2窗体对象
		new Sample27_2();
	}
}
