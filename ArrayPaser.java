public class ArrayPaser {
	public static void main(String args[]) {
		double[][] result;
		String str = "1,2;3,4,5;6,7,8";
		String[] s1 = str.split(";");         //  ���ڴ������ĵ�һά����
		result = new double[s1.length][];
		
		for(int i = 0; i < s1.length; i++) {
			String[] s2 = s1[i].split(",");     //  ���ڴ������ĵڶ�ά����
			result[i] = new double[s2.length];  //  ����ÿ�зֿ�������Ԫ�ظ�����ͬnew���µ�����.
			for(int j = 0; j < s2.length; j++) {
				result[i][j] = Double.parseDouble(s2[j]);     // ����parseDouble���ַ���תΪdouble���͵�����.������Double��
			}	
		}
		
		for(int i = 0; i < result.length; i++) {         //  ����ö�ά����
			for(int j = 0; j < result[i].length; j++) 
				System.out.print(result[i][j] + " ");
			System.out.println();
		}
	}
}