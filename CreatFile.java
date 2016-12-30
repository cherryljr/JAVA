import java.io.File;
import java.io.IOException;

public class CreatFile {
	public static void main(String args[]) {
	String separator = File.separator;
	String filename = "me.txt";
	String filedir = "myfile" + separator + "test";
//	String filedir = "myfile/test";        // 上面写法更加正规，但是这种方法也行，而且书写更为简单
	File f = new File(filedir, filename);
	
	if(f.exists()) {
		System.out.println("文件名位置" + f.getPath());
		System.out.println("文件大小" + f.length());
	}	else {
		f.getParentFile().mkdirs();        
		//  首先通过getParentFile获得abstract pathname,然后通过返回的File类型再调用mkdirs方法创建目录
		//  这边要使用mkdirs,当该目录不存在是可创建该目录
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
//System.out.println(f.createNewFile());//当文件存在时返回false
// System.out.println(f.delete());//当文件不存在时返回false
// } catch (IOException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
//}
// }
//}

