package ch26;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
//继承并扩展JPanel类
public class Sample26_7 extends JPanel
{
	//重写paint方法
    public void paint(Graphics g)
    {
    	//设置画笔为XOR模式
   		g.setXORMode(Color.LIGHT_GRAY);
   		//使用背景色进行绘制 即背景色+背景色=浅灰色
   		g.setColor(this.getBackground());
   		g.fillOval(10,10,150,100);
   		//使用相同颜色绘制两个重叠的图形，c+c=背景色
   		g.setColor(Color.GRAY);
   		g.fillOval(170,10,150,100);
   		g.fillOval(220,10,150,100);
   		//使用不同的颜色绘制两个重叠的图形，即c+d=c与d的混合色
   		g.fillOval(380,10,150,100);
   		g.setColor(Color.DARK_GRAY);
   		g.fillOval(430,10,150,100);
    }
	public static void main(String[] args)
	{
		//创建画布
		Sample26_7 jp=new Sample26_7();
		//创建窗体
		JFrame jf=new JFrame();
		//设置窗体背景色为白色
		jf.setBackground(Color.WHITE);
		//将画布添加进窗体
		jf.add(jp);
		//设置窗体大小位置、标题以及可见性
		jf.setTitle("图形变换示例");
		jf.setBounds(100,100,610,150);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
