import java.io.*;
public class StreamTransForm2 {
  public static void main(String args[]) {
    InputStreamReader isr = new InputStreamReader(System.in);   // ���ֽڶ�ȡתΪ�ַ���ȡ�������ȡ���ַ�������Ԥ�Ƶĺ��
    // System.inָ�ȴ��������������
    BufferedReader br = new BufferedReader(isr);   // ����ϸô��������ʹ��readline������ȡ����Ϊ����
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
} //����