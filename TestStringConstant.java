public class TestStringConstant {
	public static void main(String args[]) {
		// 字符串常量，分配在Data Segment,编译器会对其进行优化，
		// 即当一个字符串已经存在时，不再重复创建一个相同的对象，而是直接将s2也指向"hello".
		String s1 = "hello";   
		String s2 = "hello";
		// new出来的对象，分配在heap中.s3与s4虽然指向的字符串内容是相同的，但是是两个不同的对象.
		// 因此==进行比较时，其引用是不同的，故不会相等
		String s3 = new String("world");      
		String s4 = new String("world");
		
		System.out.println(s1 == s2);   // true
		System.out.println(s3 == s4);   // false
		System.out.println(s3.equals(s4));   // true   
		// String中equals方法已经被重写过，比较的是内容是否相等.
	}
}