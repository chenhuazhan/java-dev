package ch26;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
//继承并扩展JPanel类
public class Sample26_6 extends JPanel
{
	//重写paint方法
    public void paint(Graphics g)
    {
    	//获取Graphics2D对象
        Graphics2D g2=(Graphics2D)g;
        //创建椭圆
        Ellipse2D r = new Ellipse2D.Float(400,160,80,40);
        //创建2次曲线
        QuadCurve2D e2=new QuadCurve2D.Double(15,125,115,80,175,100);
        //创建两个AffineTransform对象
        AffineTransform atf1=new AffineTransform();
        AffineTransform atf2=new AffineTransform();
        //循环绘制变换后的图形
        for(int i=1;i<=24;i++)
        {
        	//设置图形的进行缩放
        	atf1.scale(0.9,0.9);
        	//设置图形进行旋转
        	atf1.rotate(15.0*Math.PI/180,150,200);
        	//为画笔设置变换
        	g2.setTransform(atf1);
        	//绘制2次曲线
        	g2.draw(e2);
        	//设置图形的进行缩放
        	atf2.scale(0.9,0.9);
        	//设置图形进行旋转
        	atf2.rotate(15.0*Math.PI/180,360,200);
        	//为画笔设置变换
        	g2.setTransform(atf2);
        	//绘制椭圆
        	g2.draw(r);
        }
    }
	public static void main(String[] args)
	{
		//创建画布
		Sample26_6 jp=new Sample26_6();
		//创建窗体
		JFrame jf=new JFrame();
		//将画布添加进窗体
		jf.add(jp);
		//设置窗体大小位置、标题以及可见性
		jf.setTitle("图形变换示例");
		jf.setBounds(100,100,480,250);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
