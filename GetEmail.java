import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class GetEmail {
	public static void main(String[] args) {
		try {
			BufferedReader b = new BufferedReader(
					new FileReader("C:/Users/Administrator/Desktop/ss.html"));
			String mes = null;
			try {
				while((mes = b.readLine()) != null) {
					parse(mes);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void parse(String mes) {
		Pattern p = Pattern.compile("([\\w+[.+-]]+)@[\\w[.+-]]+\\.[\\w]+");
		Matcher m = p.matcher(mes);
		while(m.find()) {
			System.out.println(m.group());     // 获取完整的邮箱地址
			//System.out.println(m.group(1));  // 利用分组获取用户名称
		}
	}
}
