/*
事件监听机制的实现：
参考图：06_事件模型_ActionEvent.avi_20170207_231330.142.jpg
为了节省资源，系统无法对某个事件进行实时的监听。故实现的机制是当发生某个事件后，
处理代码将被自动运行，类似钩子一般。（回调函数）
事件有许多，这边以按钮被按下为例。
由于处理的方法函数是我们人为进行编写的，故Button是不知道所要调用的函数名是什么。
对此采用的解决方法为：Button源代码调中用接口方法，而我们的监听处理函数则必须要实现该接口（ActionListener）
这样利用多态，使得Button虽调用的为该接口的方法，但运行的则是我们new出来的对象方法。
类似于Button提供了这么一个钩子，但是钩子上面是什么东西他自己并不清楚，我们只需要人为地
往上面挂上我们需要的东西即可。

当事件源对象发生了某一事件后，事件信息将被打包为ActionEvent类，并发送给事件监听器。
而后事件监听器将根据其内容（包括鼠标点击的位置，动作等）做出相应的处理。（自动执行actionPerformed()函数）
而实现了特定接口的事件监听器为了对事件源对象的某一特定事件进行监测必须进行注册。
即告知事件源对象已被监听（b.addActionListener(m)）
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
	b2.addActionListener(m);    //  注册，告知事件源对象被m监听器所监听
	b2.setActionCommand("GAME OVER!");
	f.add(b1, BorderLayout.NORTH);
	f.add(b2, BorderLayout.SOUTH);
	f.pack();       //  根据内容确定Frame边框大小，类似外围包装上一层
	f.setVisible(true);
	}
}

class Monitor implements ActionListener {
	public void actionPerformed(ActionEvent e) {  //  事件信息被打包在了ActionEvent e中传递过来，等待处理
		System.out.println("A Button has been pressed!\n" + 
		"the relative info is:" + e.getActionCommand());   //  ActionCommand中默认信息为该Button的名字
	}
}

