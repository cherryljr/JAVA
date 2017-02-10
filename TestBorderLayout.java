import java.awt.*;

public class TestBorderLayout {
	public static void main(String[] args) {
		Frame f = new Frame("My Frame");
		Panel p = new Panel();
		Button b1 = new Button("BN");
		Button b2 = new Button("BS");
		Button b3 = new Button("BW");
		Button b4 = new Button("BE");
		Button b5 = new Button("BC");
		
//  f.setLayout(new BorderLayout());
		f.add(b1, BorderLayout.NORTH);  // BorderLayout.NORTHŒ™static int¿‡–Õ
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.WEST);
		f.add(b4, BorderLayout.EAST);
		f.add(b5, BorderLayout.CENTER);
		
		f.setSize(400,400);
		f.setVisible(true);
	}
}

