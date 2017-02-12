import java.awt.*;
import java.awt.event.*;

public class TextFieldPlus {
	public static void main(String[] args) {
		new MyFrame();
	}
}

class MyFrame extends Frame {
	TextField num1, num2, num3;
	
	MyFrame() {
		super("PlusTest");
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(10);
		Label plus = new Label("+");
		Button equl = new Button("=");
		equl.addActionListener(new Monitor(this));
		
		setLayout(new FlowLayout());
		add(num1);
		add(plus);
		add(num2);
		add(equl);
		add(num3);
		pack();
		setVisible(true);
	}
}

class Monitor implements ActionListener {
	MyFrame f = null;     //  还可以通过内部类实现，即无需进行传递直接调用包装类（MyFrame）的成员变量
	Monitor(MyFrame f) {
		this.f = f;
	}
	public void actionPerformed(ActionEvent e) {
		int n1 = Integer.parseInt(f.num1.getText());
		int n2 = Integer.parseInt(f.num2.getText());
		f.num3.setText("" + (n1 + n2));
	}
}