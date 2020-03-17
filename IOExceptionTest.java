import java.io.IOException;

class IOExceptionTest{
	public static void main(String[] args){
		char c = ' ';
		System.out.print("please input a char: ");
		try{
			// 得到当前输入的一个字符(即使输入多个字符也只获取第一个)，然后强制转换成char类型
			c = (char) System.in.read();
		}catch(IOException e){}
		System.out.println("You have entered: " + c);
	}
}