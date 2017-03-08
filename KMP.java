
public class KMP {

	public static void main(String[] args) {
		String s = "xxax";
		String t = "xa";
		System.out.println(Index_KMP(s, t));
	}
	
	public static int[] next(String s) {
		int[] next = new int[s.length()];
		int i = 0, j = -1;
		next[0] = -1;
		
		while(i < s.length() - 1) {
			if(j == -1 || s.charAt(i) == s.charAt(j)) {  // 判断的先后顺序不能调换
				i++;
				j++;
				if(s.charAt(i) == s.charAt(j)) {   // 对KMP算法的优化
					next[i] = next[j];
				}
				else {
					next[i] = j;
				}
			}
			else {
				j = next[j];         //  若字符不相等进行回溯，保证s[0]~s[j]与s[i-j]~s[i]是匹配的
			}
		}
	
		return next;
	}
	
	public static int Index_KMP(String S, String T) {
		int i = 0, j = 0;   //  i用于表示主串的下标值，j用于表示子串的下标值
		int[] next = next(T);
		
		while(i < S.length() && j < T.length()) {   
			if(j == -1 || S.charAt(i) == T.charAt(j)) {   //  两字符相等则继续
				i++;
				j++;
			}
			else {
				j = next[j];  //  j回溯退回合适的位置开始重新匹配,i的值不变
			}
		}
		
		if(j == T.length()) {    //  结果匹配，则返回第一次匹配的数组下标
			return i - j;
		}
		else {
			return -1;
		}
	}

}
