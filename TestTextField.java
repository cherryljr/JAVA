import java.awt.*;
import java.awt.event.*;

public class TextTextField {
	public static void main(String[] args) {
		new TFrame();
	}
}

class TFrame extends Frame{
	TFrame() {
		super("TextField");
		TextField tf = new TextField();
		tf.addActionListener(new Monitor());
		tf.setEchoChar('*');   //  �������ַ�ȫ����Ϊ*���������������
		add(tf);
		pack();
		setVisible(true);
	}
}

class Monitor implements ActionListener {
	public void actionPerformed(ActionEvent e) {  //  ������ͨ������new������TFrame�����䱾������ã�ָ�룩��ʵ��ͨ����ָ��ֱ�ӵ���TFrame�еı���
																								//  ���������Բμ�TextFieldPlus.java
		TextField tf = (TextField)e.getSource();   //  ���ô��ݹ�����ʱ����Ϣe���õ����ݹ�����Object����ͨ��ǿ��ת���õ�
		//  һ���಻��ֱ�ӵ�ȡ�������еķǾ�̬���������޷�ֱ�ӵ���
		System.out.println("Messages have been Sent!\n" +
		tf.getText());     //  ��ȡ�����������Ϣ
		tf.setText("");    //  һ����Ϣ���ͺ󣨰��»س�����������
	}
}