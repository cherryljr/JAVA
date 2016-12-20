interface Takecare {
	void feed ();
	void play();
}

class Person {
	public String name, sex;
	
	public Person (String name, String sex) {
		this.name = name;
		this.sex = sex;
	}
}

class Farmmen extends Person implements Takecare {
	int wage;
	Farmmen (String name, String sex, int wage) {
		super(name, sex);
		this.wage = wage;
	}
	
	public void feed() {
		System.out.println("I'm Farmmen feed.");
	}
	
	public void play() {
		System.out.println("I'm Farmmen play.");
	}
}

class Workmen extends Person implements Takecare {
	int wage;
	
	Workmen (String name, String sex, int wage) {
		super(name, sex);
		this.wage = wage;
	}
	
	public void feed() {
		System.out.println("I'm Workmen feed.");
	}
	
	public void play() {
		System.out.println("I'm Workmen play.");
	}
}

class Servant extends Person implements Takecare {
	int wage;
	Servant (String name, String sex, int wage) {
		super(name, sex);
		this.wage = wage;
	}
	
	public void feed() {
		System.out.println("I'm Servant feed.");
	}
	
	public void play() {
		System.out.println("I'm Servant play.");
	}
}

public class TestFeed {
	public static void main(String[] args) {
		// ��m����ΪTakecare�ӿڣ�����ֻ�ܹ�������Takcare����ķ��������޷�����m�е�wage�������.
		// �ӿ��ǳ��󷽷��ͳ���ֵ�Ķ���ļ���.
		Takecare m1 = new Farmmen("nongming", "Man", 1);   
		Takecare m2 = new Workmen("gongren", "Woman", 10);
		Takecare m3 = new Servant("ganbu", "Man", 100);
		m1.feed();
		m1.play();
		m2.feed();
		m2.play();		
		m3.feed();
		m3.play();
		Farmmen m4 = (Farmmen)m1;     // ͨ��ǿ��ת����m1ת��Farmen���ͣ���ʱm4ָ��m1��ָ��heap��Farmmen�������
		System.out.println(m4.wage);
	}
}