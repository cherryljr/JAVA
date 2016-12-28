public class SplitDemo  {
    
     public static void main(String[] args) {
 				 double number = 234432.234;
 				 String str = String.valueOf(number);
         String digits[] = str.split("\\.");         // split会将.看作一个正则表达式，故前面需要加上转义字符
        
        System.out.println("整数部分位数:" + digits[0].length() + " 小数部分位数:" + digits[1].length());
     }

}
