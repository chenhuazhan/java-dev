package ch26;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
//继承并扩展JPanel类
public class Sample26_5 extends JPanel
{
	//重写paint方法
    public void paint(Graphics g)
    {
    	//获取Graphics2D对象
        Graphics2D g2=(Graphics2D)g;
        //创建GradientPaint渐变色对象
        GradientPaint gp=new GradientPaint(0,0,Color.WHITE,100,100,Color.BLACK,true);
        //为画笔设置渐变色
        g2.setPaint(gp);
        //创建椭圆图形对象
        Ellipse2D r = new Ellipse2D.Float(10,10,800,200);
       	//绘制填充椭圆
       	g2.fill(r);
    }
	public static void main(String[] args)
	{
		//创建画布
		Sample26_5 jp=new Sample26_5();
		//创建窗体
		JFrame jf=new JFrame();
		//将画布添加进窗体
		jf.add(jp);
		//设置窗体大小位置、标题以及可见性
		jf.setTitle("渐变色示例");
		jf.setBounds(100,100,830,250);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
