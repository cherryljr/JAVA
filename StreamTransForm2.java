import java.io.*;
public class StreamTransForm2 {
  public static void main(String args[]) {
    InputStreamReader isr = new InputStreamReader(System.in);   // 将字节读取转为字符读取，避免读取汉字发生不可预计的后果
    // System.in指等待键盘输入的内容
    BufferedReader br = new BufferedReader(isr);   // 外加上该处理流后可使用readline方法读取，更为方便
    String s = null;
    try {
      s = br.readLine();
      while(s != null){
        if(s.equalsIgnoreCase("exit")) break;
        System.out.println(s.toUpperCase());
        s = br.readLine();
      }
      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
} //阻塞