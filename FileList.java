import java.io.*;

public class FileList {
	public static void main(String args[]) {
		File f = new File("d:/");
		System.out.println("D:");
		tree(f, 1);
	}
	
	private static void tree(File f, int level) {
		StringBuffer preStr = new StringBuffer("");   //  preStr作为提前量来分割不同等级目录的显示情情况
																									//  StringBuffer相比String有着更高处理效率（可变性）
		for(int i = 0; i < level; i++) {　　　　　　　
			preStr.append("    ");
		}
		
		File[] childfiles = f.listFiles();
		
		for(int i = 0; i < childfiles.length; i++) {
			System.out.println(preStr + childfiles[i].getName());
			if(childfiles[i].isDirectory()) 
				tree(childfiles[i], ++level);      //　递归
		}
	}
	
}