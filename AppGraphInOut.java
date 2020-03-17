import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AppGraphInOut
{
	public static void main(String[] main)
	{
		new AppFrame();
	}
}

class AppFrame extends JFrame
{
	JTextField in = new JTextField(10);
	JButton btn = new JButton("求平方");
	JLabel out = new JLabel("用于显示结果的标签");
	
	public AppFrame()
	{
		setLayout(new FlowLayout());
		getContentPane().add(in);
		getContentPane().add(btn);
		getContentPane().add(out);
		// 添加事件
		btn.addActionListener(new BtnActionAdapter());
		// 设置大小
		setSize(400, 100);
		// 默认关闭按钮退出程序
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// 显示窗口
		setVisible(true);
	}
	
	class BtnActionAdapter implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String s = in.getText();
			double d = Double.parseDouble(s);
			double sq = d * d;
			out.setText(d + "的平方是：" + sq);
		}
	}
}

