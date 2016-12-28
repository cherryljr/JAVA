public class SplitDemo  {
    
     public static void main(String[] args) {
 				 double number = 234432.234;
 				 String str = String.valueOf(number);
         String digits[] = str.split("\\.");
        
        System.out.println("整数部分位数:" + digits[0].length() + " 小数部分位数:" + digits[1].length());
     }

}
