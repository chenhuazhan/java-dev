package ch27;
import java.awt.*;
import javax.swing.*;
public class Sample27_1 extends JFrame
{
	//通过匿名内部类的方法继承并扩展JPanel类作为画布
	public JPanel jp=new JPanel()
	{
		//加载指定图片获取Image对象
		Image img=Toolkit.getDefaultToolkit().getImage("E:\\java开发手册\\src\\ch27\\1.jpg");
		//将图象进行缩放
		Image tempimg1=img.getScaledInstance(141,106,Image.SCALE_SMOOTH);
		Image tempimg2=img.getScaledInstance(70,53,Image.SCALE_SMOOTH);		
		public void paint(Graphics g)
		{
			//绘制原始图象
			g.drawImage(img,10,10,this);
			//绘制缩放后图象
			g.drawImage(tempimg1,310,10,this);
			g.drawImage(tempimg2,465,10,this);
		}
	};
	//窗体构造器
	public Sample27_1()
	{
		//将画布添加进窗体中
		this.add(jp);
		//加载窗体图标图象
		Image icon=Toolkit.getDefaultToolkit().getImage("E:\\java开发手册\\src\\ch27\\2.jpg");
		//设置窗体图标
		this.setIconImage(icon);
		//设置窗体的关闭动作、标题、大小位置以及可见性
		this.setTitle("图象绘制演示");
		this.setBounds(100,100,550,260);
		this.setVisible(true);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	//主方法
	public static void main(String args[])
	{
		//创建Sample27_1窗体对象
		new Sample27_1();
	}
}
