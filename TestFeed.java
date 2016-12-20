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
		// 将m声明为Takecare接口，人们只能够看到其Takcare里面的方法，故无法调用m中的wage这个变量.
		// 接口是抽象方法和常量值的定义的集合.
		Takecare m1 = new Farmmen("nongming", "Man", 1);   
		Takecare m2 = new Workmen("gongren", "Woman", 10);
		Takecare m3 = new Servant("ganbu", "Man", 100);
		m1.feed();
		m1.play();
		m2.feed();
		m2.play();		
		m3.feed();
		m3.play();
		Farmmen m4 = (Farmmen)m1;     // 通过强制转换将m1转成Farmen类型，此时m4指向m1所指向heap中Farmmen这个对象
		System.out.println(m4.wage);
	}
}