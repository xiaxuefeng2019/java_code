/*
javac命令中文乱码解决方案：javac -encoding utf-8 *.java
*/

import java.util.Scanner;
// 如果存在一个类，它的所有成员都是static的，则可以使用import static语句来导入，之后(下一行例子)可以用out.println()表示System.out.println()
import static java.lang.System.*;

public class javaGrammar
{
	/*
	public: 此访问修饰符表示公开的，访问不受限制
	static: 静态的
	void: 无返回值的
	*/
	public static void main(String[] args)
	{
		// print(打印), println(打印并换行), printf(格式化打印)
		//System.out.println("Hello World!");
		
		// 无法在静态方法中调用非静态变量、方法，要么将被调用的成员用static修饰，要么定义创建实例通过实例调用
		javaGrammar test = new javaGrammar();
		
		// if条件语句用法
		// test.ifUsage();
		
		// 使用类的实例对象调用该类的静态方法
		Person person = new Person();
		person.sumTotalNum();
	}
	
	// if条件语句用法
	void ifUsage()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个数：");
		// nextInt(得到一个整数), nextDoubel(得到一个实数), next(得到下一个单词)
		int num = scanner.nextInt();
		// 用法1
		if (num > 0)
		{
			System.out.printf("%d是正数", num);
		}
		// 用法2
		if (num > 0)
		{
			System.out.printf("%d是正数", num);
		}else
		{
			System.out.printf("%d是负数", num);
		}
		// 用法3
		if (num < 60)
		{
			System.out.printf("分数%d不及格", num);
		}else if (num < 80)
		{
			System.out.printf("分数%d及格", num);
		}else
		{
			System.out.printf("分数%d优秀", num);
		}
	}
}

/* 
访问控制符：修饰类或者类的成员
private:	同一个类中可访问
默认:		同一个包中可访问
protected: 	不同包里的子类可访问
public: 	不同包的非子类可访问

常见用法：
1.类的修饰符要么是默认的，要么是public。
2.对类的字段用private修饰进行封装和隐藏，然后设置public的setter和getter对该字段进行设置和访问
*/ 

/*
非访问控制符
static:		静态的，非实例的，类的。可以修饰类、成员	
final:		最终的，不可改版的。可以修饰类、成员、局部变量
abstract:	抽象的，不可实例的。可以修饰类、成员
*/

class Person
{
	// static字段：静态字段最本质的特点是“它们不是类的字段，不属于任何一个对象的实例”
	// 因为static字段和实例对象无关，所以它可以表示全局变量(Java是纯粹的面向对象语言，所有的变量都在类中)
	static long totalNum;
	int age;
	String Name;
	
	/* 
	* static修饰的方法叫静态方法，又叫类方法
	* 类方法的本质是该方法属于整个类的，不是属于某个实例的
	* 非static的方法是属于某个对象的方法，在这个对象创建时，对象的方法在内存中拥有自己专用的代码段。
	  而static的方法是属于整个类的，它在内存中的代码段将随着类的定义而进行分配和装载，不被任何一个对象专有
	*/
	static void sumTotalNum()
	{
		/* 
		* 由于static方法是属于整个类的，所以它不能操纵和处理属于某个对象的成员变量，
		  而只能处理属于整个类的成员变量，即static方法只能处理本类中的static域或调用static方法
		* static方法中，不能范文实例变量，不能使用this或super
		* 调用这个方法时，应该使用类名直接调用，也可以用某个具体的对象名
		*/
		System.out.println("sumTotalNum");
	}
}

// final修饰类，则说明这个类不能被继承，即不能拥有子类
final class pen
{
	/* 
	* final修饰字段、局部变量时：
		1.他们的值一旦给定，就不能修改，
		2.是只读量，他们只能被赋值一次，而不能被赋值多次
		3.没有初始值，必须且只能赋值1次，可以在定义变量时赋初始值，在每个构造函数中进行赋值
	*/
	final color = "black";
	/* 
	* 当字段被static和final修饰时，它可以表示常量
	* 若没有给定初始值时，则按默认值进行初始化(数值为0，boolean型为false，引用型为null)
	*/
	static final weight = 10;
	// final修饰方法，则说明这个方法不能被子类覆盖
	final void write();
}

/* 
* abstract修饰类为抽象类，不可实例化，可以被继承
* 抽象类可以包含抽象方法，也可以不包含抽象方法，但是一旦类中包含了abstract方法，则这个类必须声明为abstract类
* 抽象方法在子类中必须被实现，否则这个子类仍然是abstract类
*/
abstract class love
{
	/*
	* 被abstract修饰的方法叫抽象方法，抽象方法的作用在为所有子类定义一个统一的接口。
	*/
	abstract void find();
}















