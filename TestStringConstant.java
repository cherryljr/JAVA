public class TestStringConstant {
	public static void main(String args[]) {
		// �ַ���������������Data Segment,���������������Ż���
		// ����һ���ַ����Ѿ�����ʱ�������ظ�����һ����ͬ�Ķ��󣬶���ֱ�ӽ�s2Ҳָ��"hello".
		String s1 = "hello";   
		String s2 = "hello";
		// new�����Ķ��󣬷�����heap��.s3��s4��Ȼָ����ַ�����������ͬ�ģ�������������ͬ�Ķ���.
		// ���==���бȽ�ʱ���������ǲ�ͬ�ģ��ʲ������
		String s3 = new String("world");      
		String s4 = new String("world");
		
		System.out.println(s1 == s2);   // true
		System.out.println(s3 == s4);   // false
		System.out.println(s3.equals(s4));   // true   
		// String��equals�����Ѿ�����д�����Ƚϵ��������Ƿ����.
	}
}