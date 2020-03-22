/** 
题目：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
*/

// Scanner类用来获取用户输入
import java.util.Scanner;


public class Subject1
{
	public static void main(String[] args)
	{
		System.out.print("请输入你想知道的兔子数量的月份：");
		Scanner scanner = new Scanner(System.in);
		// 获取输入的整数 
		int n = scanner.nextInt();
		System.out.println(test(n));
		System.out.println(fun(n));
		scanner.close();
	}

	// 菜鸟写法
	public static int test(int i){
		int tot = 0;
		int a = 0;
		int b = 1;
		for(int j = 0; j < i; j++){
			tot = a + b;
			a = b;
			b = tot;
		}
		return a;
	}
	
	// 大神写法
	// private访问修饰符使fun函数只能在类内部被访问
	private static int fun(int n){
		if(n ==1 || n ==2)
			return 1;
		else
			return fun(n - 1) + fun(n - 2);
	}










}
















