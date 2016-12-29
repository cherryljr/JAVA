public class ArrayPaser {
	public static void main(String args[]) {
		double[][] result;
		String str = "1,2;3,4,5;6,7,8";
		String[] s1 = str.split(";");         //  用于存放数组的第一维变量
		result = new double[s1.length][];
		
		for(int i = 0; i < s1.length; i++) {
			String[] s2 = s1[i].split(",");     //  用于存放数组的第二维变量
			result[i] = new double[s2.length];  //  根据每行分开的数组元素个数不同new出新的数组.
			for(int j = 0; j < s2.length; j++) {
				result[i][j] = Double.parseDouble(s2[j]);     // 利用parseDouble将字符串转为double类型的数据.（不是Double）
			}	
		}
		
		for(int i = 0; i < result.length; i++) {         //  输出该二维数组
			for(int j = 0; j < result[i].length; j++) 
				System.out.print(result[i][j] + " ");
			System.out.println();
		}
	}
}