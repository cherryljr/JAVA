import java.io.File;
import java.io.IOException;

public class CreatFile {
	public static void main(String args[]) {
	String separator = File.separator;
	String filename = "me.txt";
	String filedir = "myfile" + separator + "test";
//	String filedir = "myfile/test";        // ����д���������棬�������ַ���Ҳ�У�������д��Ϊ��
	File f = new File(filedir, filename);
	
	if(f.exists()) {
		System.out.println("�ļ���λ��" + f.getPath());
		System.out.println("�ļ���С" + f.length());
	}	else {
		f.getParentFile().mkdirs();        
		//  ����ͨ��getParentFile���abstract pathname,Ȼ��ͨ�����ص�File�����ٵ���mkdirs��������Ŀ¼
		//  ���Ҫʹ��mkdirs,����Ŀ¼�������ǿɴ�����Ŀ¼
		try {
		System.out.println(f.createNewFile());  
	} 	catch (IOException e) {
		e.printStackTrace();
	}
	}
}
	
}



//import java.io.File;
//import java.io.IOException;
//public class tree {
// public static void main(String[] args){
// File f =new File("d:\\1.txt");
// try {
//System.out.println(f.createNewFile());//���ļ�����ʱ����false
// System.out.println(f.delete());//���ļ�������ʱ����false
// } catch (IOException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
//}
// }
//}

