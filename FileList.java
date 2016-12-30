import java.io.*;

public class FileList {
	public static void main(String args[]) {
		File f = new File("d:/");
		System.out.println("D:");
		tree(f, 1);
	}
	
	private static void tree(File f, int level) {
		StringBuffer preStr = new StringBuffer("");   //  preStr��Ϊ��ǰ�����ָͬ�ȼ�Ŀ¼����ʾ�����
																									//  StringBuffer���String���Ÿ��ߴ���Ч�ʣ��ɱ��ԣ�
		for(int i = 0; i < level; i++) {��������������
			preStr.append("    ");
		}
		
		File[] childfiles = f.listFiles();
		
		for(int i = 0; i < childfiles.length; i++) {
			System.out.println(preStr + childfiles[i].getName());
			if(childfiles[i].isDirectory()) 
				tree(childfiles[i], ++level);      //���ݹ�
		}
	}
	
}