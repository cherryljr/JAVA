
public class KMP {

	public static void main(String[] args) {
		String s = "abacababc";
		String p = "abab";
		System.out.println(Index_KMP(s, p));
	}
	
	//优化过后的next数组求法 
	public static int[] next(String p) {
		int[] next = new int[p.length()];
		int k = -1, j = 0;
		next[0] = -1;		//	初值为-1	
		
		while(j < p.length() - 1) { 
			//	p[k]表示字符串的前缀，p[j]表示字符串的后缀
			if(k == -1 || p.charAt(k) == p.charAt(j)) {  // 判断的先后顺序不能调换
				k++;
				j++;
				//	后面即是求next[j+1]的过程
				if(p.charAt(k) == p.charAt(j)) 			//  此处等价于if(p[j] == p[ next[j] ])
					//	因为不能出现p[j] = p[ next[j] ]，所以当出现时需要继续递归，k = next[k] = next[next[k]]
					next[j] = next[k];					//  此处等价于next[j] = next[ next[j] ]
				else	
					next[j] = k;
			}
			else {
				k = next[k];         
			}
		}
	
		return next;
	}
	
	public static int Index_KMP(String S, String P) {
		int i = 0, j = 0;
		int[] next = next(P);
		
		while(i < S.length() && j < P.length()) {	  
			if(j == -1 || S.charAt(i) == P.charAt(j)) {		//	如果j = -1，或者当前字符匹配成功（即S[i] == P[j]），都令i++，j++. 注意：这里判断顺序不能调换！ 
				i++;
				j++;
			}
			else
				//	如果j != -1，且当前字符匹配失败（即S[i] != P[j]），则令 i 不变，j = next[j]      
	            //	next[j]即为j所对应的next值，效果为进行回溯        
				j = next[j];
		}
		
		if(j == P.length())
			return i - j;
		else 
			return -1;
	}
	
}
