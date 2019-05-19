/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firstjava;
import javax.swing.*;
import java.util.*;
import java.text.*;
import java.awt.*;
/**
 *
 * @author changehz
 */
public class FirstJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*JFrame myWindow=new JFrame();
        myWindow.setSize(600,500);
        myWindow.setTitle("My firss Java Program");
        myWindow.setVisible(true);
        String str1=new String("How are you?");
        
        String str2=new String();
        str2="I Love Java!";
        String str3;
        str3="Shopping List:\n      Apple\n      Banana\n      Lowfat Milk";
        JOptionPane.showMessageDialog(myWindow,str1);
        myWindow.setVisible(false);
        JOptionPane.showMessageDialog(null,str2);
        JOptionPane.showMessageDialog(null,str2.substring(0,7)+str2.length()+str2.indexOf("Love"));     
        //substring(first,end)取子串，length()取字符串长度 ,indexOf(ch)|indexOf(str)取字符|字符串位置序号
        JOptionPane.showMessageDialog(null,str3);
        JOptionPane.showMessageDialog(null,str3.substring(5,28));
        */
        /*
        Date today=new Date();
        SimpleDateFormat sdf1=new SimpleDateFormat("MM/dd/yy");
        SimpleDateFormat sdf2=new SimpleDateFormat("EEEE");
        JOptionPane.showMessageDialog(null,"今天的完整时间是："+today.toString());
        JOptionPane.showMessageDialog(null,"今天的月/日/年是："+sdf1.format(today));
        JOptionPane.showMessageDialog(null,"今天是"+sdf2.format(today));
        */
        /*
        String input;
        input=JOptionPane.showInputDialog(null,"你是谁？");
        JOptionPane.showMessageDialog(null,"你好！"+input);
        */
        
        JFrame win;
		Container contentPane;
		Graphics g;
		
		win=new JFrame("My First Rectangle");
		win.setSize(300,200);
		win.setLocation(100, 100);
		
		
		contentPane=win.getContentPane();
		contentPane.setBackground(Color.LIGHT_GRAY);
		
		g=contentPane.getGraphics();
		g.setColor(Color.BLUE);
		g.drawRect(50, 50, 100, 30);
		g.setColor(Color.RED);
		g.fillRect(175, 50, 100, 30);
                win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
