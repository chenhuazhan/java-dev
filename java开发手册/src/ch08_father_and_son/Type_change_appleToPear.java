package ch08_father_and_son;
/*
 * 苹果变梨，编译通过，运行不通过
 */
public class Type_change_appleToPear {

	public static void main(String[] args)
	{
      Fruit f=new Apple();
      Pear p=(Pear)f;
	}    
}
//水果类
class Fruit
{
}
//苹果类
class Apple extends Fruit
{
}
//梨类
class Pear extends Fruit
{
}