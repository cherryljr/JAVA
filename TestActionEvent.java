/*
�¼��������Ƶ�ʵ�֣�
�ο�ͼ��06_�¼�ģ��_ActionEvent.avi_20170207_231330.142.jpg
Ϊ�˽�ʡ��Դ��ϵͳ�޷���ĳ���¼�����ʵʱ�ļ�������ʵ�ֵĻ����ǵ�����ĳ���¼���
������뽫���Զ����У����ƹ���һ�㡣���ص�������
�¼�����࣬����԰�ť������Ϊ����
���ڴ���ķ���������������Ϊ���б�д�ģ���Button�ǲ�֪����Ҫ���õĺ�������ʲô��
�Դ˲��õĽ������Ϊ��ButtonԴ��������ýӿڷ����������ǵļ��������������Ҫʵ�ָýӿڣ�ActionListener��
�������ö�̬��ʹ��Button����õ�Ϊ�ýӿڵķ����������е���������new�����Ķ��󷽷���
������Button�ṩ����ôһ�����ӣ����ǹ���������ʲô�������Լ��������������ֻ��Ҫ��Ϊ��
���������������Ҫ�Ķ������ɡ�

���¼�Դ��������ĳһ�¼����¼���Ϣ�������ΪActionEvent�࣬�����͸��¼���������
�����¼������������������ݣ������������λ�ã������ȣ�������Ӧ�Ĵ������Զ�ִ��actionPerformed()������
��ʵ�����ض��ӿڵ��¼�������Ϊ�˶��¼�Դ�����ĳһ�ض��¼����м��������ע�ᡣ
����֪�¼�Դ�����ѱ�������b.addActionListener(m)��
*/

import java.awt.*;
import java.awt.event.*;

public class TestActionEvent {
	public static void main(String[] args) {
	Frame f = new Frame("TestActionEent");
	Button b1 = new Button("START");
	Button b2 = new Button("STOP");
	Monitor m = new Monitor();
	b1.addActionListener(m);  
	b2.addActionListener(m);    //  ע�ᣬ��֪�¼�Դ����m������������
	b2.setActionCommand("GAME OVER!");
	f.add(b1, BorderLayout.NORTH);
	f.add(b2, BorderLayout.SOUTH);
	f.pack();       //  ��������ȷ��Frame�߿��С��������Χ��װ��һ��
	f.setVisible(true);
	}
}

class Monitor implements ActionListener {
	public void actionPerformed(ActionEvent e) {  //  �¼���Ϣ���������ActionEvent e�д��ݹ������ȴ�����
		System.out.println("A Button has been pressed!\n" + 
		"the relative info is:" + e.getActionCommand());   //  ActionCommand��Ĭ����ϢΪ��Button������
	}
}

