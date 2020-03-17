import java.util.Scanner;
class ScannerTest{
	public static void main(String[] args){
		// System.in 获取系统的输入设备，控制台是键盘
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个数");
		/** 
			nextInt		得到一个整数
			nextDoubel()	得到一个实数
			next()	得到下一个单词
		*/
		int a = scanner.nextInt();
		System.out.printf("%d的平方是%d\n", a, a*a);
	}
}