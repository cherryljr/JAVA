import java.awt.*;
import java.awt.event.*;

public class TestTextField {
	public static void main(String[] args) {
		new TFrame();
	}
}

class TFrame extends Frame{
	TFrame() {
		super("TextField");
		TextField tf = new TextField();
		tf.addActionListener(new Monitor());
		tf.setechochar('*');   //  将回显字符全部设为*，用于密码的输入
		add(tf);
		pack();
		setVisible(true);
	}
}

class Monitor implements ActionListener {
	public void actionPerformed(ActionEvent e) {  
		TextField tf = (TextField)e.getSource();   //  利用传递过来的时间信息e，得到传递过来的Object，并通过强制转换得到
		//  一个类不能直接调取其他类中的非静态方法，故无法直接调用
		System.out.println("Messages have been Sent!\n" +
		tf.getText());     //  获取输入的文字信息
		}
		tf.setText("");    //  一串信息发送后（按下回车）清空输入框
}