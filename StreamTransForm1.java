import java.io.*;
public class StreamTransForm1 {
  public static void main(String[] args) {
    try {
      OutputStreamWriter osw = new OutputStreamWriter(
           new FileOutputStream("d:/char.txt"));
      osw.write("mircosoft");
      System.out.println(osw.getEncoding());
      osw.close();
      osw = new OutputStreamWriter(
      								new FileOutputStream("d:/char.txt", true),
      								// ����true����ԭ�������ݺ������ӣ����򽫸���ԭ������
      								"ISO8859_1"); // latin-1
      osw.write("mircosoft");
      System.out.println(osw.getEncoding());
      osw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}