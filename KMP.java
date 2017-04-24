
public class KMP {

	public static void main(String[] args) {
		String s = "abacababc";
		String p = "abab";
		System.out.println(Index_KMP(s, p));
	}
	
	//�Ż������next������ 
	public static int[] next(String p) {
		int[] next = new int[p.length()];
		int k = -1, j = 0;
		next[0] = -1;		//	��ֵΪ-1	
		
		while(j < p.length() - 1) { 
			//	p[k]��ʾ�ַ�����ǰ׺��p[j]��ʾ�ַ����ĺ�׺
			if(k == -1 || p.charAt(k) == p.charAt(j)) {  // �жϵ��Ⱥ�˳���ܵ���
				k++;
				j++;
				//	���漴����next[j+1]�Ĺ���
				if(p.charAt(k) == p.charAt(j)) 			//  �˴��ȼ���if(p[j] == p[ next[j] ])
					//	��Ϊ���ܳ���p[j] = p[ next[j] ]�����Ե�����ʱ��Ҫ�����ݹ飬k = next[k] = next[next[k]]
					next[j] = next[k];					//  �˴��ȼ���next[j] = next[ next[j] ]
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
			if(j == -1 || S.charAt(i) == P.charAt(j)) {		//	���j = -1�����ߵ�ǰ�ַ�ƥ��ɹ�����S[i] == P[j]��������i++��j++. ע�⣺�����ж�˳���ܵ����� 
				i++;
				j++;
			}
			else
				//	���j != -1���ҵ�ǰ�ַ�ƥ��ʧ�ܣ���S[i] != P[j]�������� i ���䣬j = next[j]      
	            //	next[j]��Ϊj����Ӧ��nextֵ��Ч��Ϊ���л���        
				j = next[j];
		}
		
		if(j == P.length())
			return i - j;
		else 
			return -1;
	}
	
}
