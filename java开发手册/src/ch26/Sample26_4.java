package ch26;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
//继承并扩展JPanel类
public class Sample26_4 extends JPanel
{
	//重写paint方法
    public void paint(Graphics g)
    {
    	//获取Graphics2D对象
        Graphics2D g2=(Graphics2D)g;
        //创建BasicStroke对象并设置线条各个属性
        BasicStroke bs=new BasicStroke(14,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        //为画笔设置线条的风格
        g2.setStroke(bs);
        //创建两个直线图形对象
        Line2D L1=new Line2D.Double(15,20,230,100);
        Line2D L2=new Line2D.Double(15,100,230,20);
        //绘制线条
        g2.draw(L1);
        g2.draw(L2);
}
	public static void main(String[] args)
	{
		//创建画布
		Sample26_4 jp=new Sample26_4();
		//创建窗体
		JFrame jf=new JFrame();
		//将画布添加进窗体
		jf.add(jp);
		//设置窗体大小位置、标题以及可见性
		jf.setTitle("控制线条粗细");
		jf.setBounds(100,100,250,150);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
