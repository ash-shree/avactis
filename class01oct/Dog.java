package class01oct;

public class Dog extends Animal{

	String color ="white";
	

public void display()
{
	System.out.println(color); //color in child class
	System.out.println(super.color); //parent class animal color
}
public void break1()
{
	super.break1();
	System.out.println("i am a method in class Dog");
	
	
}
public static void main(String []args)
{
	Dog obj =new Dog();
	obj.display();
	obj.break1();
	
}
}
