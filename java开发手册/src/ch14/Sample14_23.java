package ch14;
import java.util.*;
import java.util.regex.*;
//��ʾ������ڵ����
class OPNode
{
	char op;//���������
	int level;//��������ȼ�
	public OPNode(String op)
	{
		this.op=op.charAt(0);
		//���ݲ�ͬ��������ŷ������ȼ�
		if(op.equals("+")||op.equals("-"))
		{
			this.level=1;//�Ӽ��������ȼ�Ϊ1
		}
		else if(op.equals("*")||op.equals("/"))
		{
			this.level=2; //�˳��������ȼ�Ϊ2
		}
		else if(op.equals("("))
		{
			this.level=-3;//"("���ȼ�Ϊ-3
		}
		else
		{
			this.level=-1; //")"���ȼ�Ϊ-1
		}
	}
}
//����
public class Sample14_23
{
	public static void main(String args[])
	{
       String expression=args[0];//���ղ�����Ϊ������ʽ
       //�������ڷ������ص�����ʽģʽ
       Pattern entryOfExpression = 
           Pattern.compile("[0-9]+(\\.[0-9]+)?|\\(|\\)|\\+|-|\\*|/");
       Deque stack= new LinkedList();//���������Ҫʹ�õ�ջ
       List list=new LinkedList();///���������Ҫʹ�õ��б�
       //������ʽ�������ʽ
       Matcher m = entryOfExpression.matcher(expression);
       //�Է�������ÿ�����ش���
       while(m.find())
       {
       	 //��ȡ����
       	 String nodeString=expression.substring(m.start(),m.end());
       	 if(nodeString.matches("[0-9].*"))
       	 {
       	 	//�������ֱֵ�������б�
       	 	list.add(Double.valueOf(nodeString));
       	 }
       	 else
       	 {
       	 	//���������������ݲ�ͬ�������
       	 	OPNode opn=new OPNode(nodeString);
       	 	int peekLevel=(stack.peek()==null)?0:((OPNode)stack.peek()).level;
       	 	if(opn.level>peekLevel)
       	 	{
       	 		//���������ջ����������ȼ�������ջ
       	 		stack.push(opn);
       	 	}
       	 	else
       	 	{
       	 		if(opn.level==-1)
       	 		{
       	 			//���Ϊ")"�������һֱ��ջ��ֱ������"("
       	 			OPNode tempOpn=(OPNode)stack.pop();
       	 			while(tempOpn.level!=-3)
       	 			{
       	 				list.add(tempOpn);//��ջ����������б�
       	 				tempOpn=(OPNode)stack.pop();
       	 			}
       	 		}
       	 		else if(opn.level==-3)
       	 		{
       	 			//���Ϊ"("ֱ����ջ
       	 			stack.push(opn);
       	 		}
       	 		else
       	 		{
       	 			//������������ջ����������ȼ�����һֱ��ջ
       	 			//ֱ��ջ�ջ����������ջ����������ȼ���
       	 			OPNode tempOpn=(OPNode)stack.pop();
       	 			while(tempOpn.level>=opn.level)
       	 			{
       	 				list.add(tempOpn);
       	 				if(stack.isEmpty()){break;}
       	 				tempOpn=(OPNode)stack.pop();
       	 			}  
       	 			stack.push(opn);//�����������ջ  			
       	 		}
       	 	}
       	 }        
       }
       OPNode tempOpn=null;
       //ջ��ʣ������������б�
       while(!stack.isEmpty())
       {
       	   tempOpn=(OPNode)stack.pop();
       	   list.add(tempOpn);        	   	
       }
       //�������ʽ����ֵ
       stack.clear();
       for(Object o:list)
       {
       	 if(o instanceof Double)
       	 {
       	 	//���Ϊ��ֱֵ����ջ
       	 	stack.push(o);
       	 }
       	 else
       	 {
       	 	//���Ϊ���������ȡ��ջ�е�������ֵ���㣬���������ջ
       	 	double opd2=((Double)stack.pop()).doubleValue();
       	 	double opd1=((Double)stack.pop()).doubleValue();
       	 	switch(((OPNode)o).op)
       	 	{
       	 		case '+':
       	 		  stack.push(opd1+opd2);
       	 		break;       	 		
       	 		case '-':
       	 		  stack.push(opd1-opd2);
       	 		break;  
       	 		case '*':
       	 		  stack.push(opd1*opd2);
       	 		break;  
       	 		case '/':
       	 		  stack.push(opd1/opd2);
       	 		break;  
       	 	}
       	 }
       }
       //��ӡ������
       System.out.println("������Ϊ��"+stack.pop());
	}
}
