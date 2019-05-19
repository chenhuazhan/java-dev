package ch26;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
//继承并扩展JPanel类
public class Sample26_8 extends JPanel implements ActionListener
{
	//控制圆角矩形的背景流动的参数
	int recY=60;
	//控制字符串以及椭圆浮动的参数
	int rW=60;
	//标记字符串以及椭圆浮动方向的参数
	int flag=0;
	//创建延时为5毫秒的Timer对象
	Timer t=new Timer(5,this);
	public Sample26_8()
	{
		//启动Timer对象
		t.start();
	}
	//重写paint方法
	public void paint(Graphics g) 
	{
		//获得Graphics2D对象
		Graphics2D g2=(Graphics2D)g;
		//打开抗锯齿
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
			                RenderingHints.VALUE_ANTIALIAS_ON);
		//创建填充背景圆角矩形的渐变色，通过recY参数控制渐变色的变化
		//以产生动画的效果
		GradientPaint gp = new GradientPaint(0,recY,Color.WHITE,
											0,recY+60,Color.DARK_GRAY,true);
		//为画笔设置渐变色
		g2.setPaint(gp);
		//创建圆角矩形对象
		RoundRectangle2D rec=new RoundRectangle2D.Double(10,10,370,250,20,20);
		//绘制圆角矩形对象
		g2.fill(rec);
		//创建填充变型椭圆的渐变色
		gp=new GradientPaint(0,260-rW,Color.WHITE,380,260,Color.BLACK,true);
		//创建椭圆,由rW参数控制椭圆的高
		Ellipse2D r = new Ellipse2D.Float(30,260-rW,330,rW);
		//为画笔设置渐变色
		g2.setPaint(gp);
		//绘制椭圆
		g2.fill(r);
		//设置字体
		g2.setFont(new Font("Serif",Font.BOLD,85));
		//设置画笔颜色
		g2.setPaint(Color.LIGHT_GRAY);
		//绘制字符串阴影,由rW参数控制字符串的位置
		g2.drawString("Java 2D",50+4,280-rW+4);
		//重新设置画笔颜色
		g2.setPaint(Color.DARK_GRAY);
		//绘制字符串主体，,由rW参数控制字符串的位置
		g2.drawString("Java 2D",50,280-rW);
	}
	public void actionPerformed(ActionEvent e)
	{
		//测试y值是否小于180，即y是否增加了两个60
		if(recY<180)
		{
			//若小于180则y坐标自增1个像素
			recY++;
		}
		else
		{
			//若测试不成立则使y值重新等于60；
			recY=60;
		}
		//测试rw值是否超过180
		if(rW>180)
		{//若rW超过180设置flag为1，表示椭圆应该纵向收缩
			flag=1;
		}
		else if(rW<60)
		{//若rW小于60设置flag为0，表示椭圆应该纵向拉伸
			flag=0;
		}
		//调用设置rw参数的setRW方法
		this.setRW();
		//请求重新绘制画布
		this.repaint();
	}
	//设置rw参数的setRW方法
	public void setRW()
	{
		if(flag==0)
		{
			//若flag为0则rW增加
			rW=rW+2;
		}
		else if(flag==1)
		{
			//若flag为0则rW自减
			rW=rW-2;
		}
	}
	public static void main(String[] args)
	{
		//创建画布
		Sample26_8 jp=new Sample26_8();
		//创建窗体
		JFrame jf=new JFrame();
		//将画布添加进窗体
		jf.add(jp);
		//设置窗体大小位置、标题以及可见性
		jf.setTitle("Java2D动画示例");
		jf.setBounds(100,100,400,300);
		jf.setVisible(true);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
