public class SplitDemo  {
    
     public static void main(String[] args) {
 				 double number = 234432.234;
 				 String str = String.valueOf(number);
         String digits[] = str.split("\\.");         // split�Ὣ.����һ���������ʽ����ǰ����Ҫ����ת���ַ�
        
        System.out.println("��������λ��:" + digits[0].length() + " С������λ��:" + digits[1].length());
     }

}