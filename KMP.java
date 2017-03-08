
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
			if(j == -1 || s.charAt(i) == s.charAt(j)) {  // �жϵ��Ⱥ�˳���ܵ���
				i++;
				j++;
				if(s.charAt(i) == s.charAt(j)) {   // ��KMP�㷨���Ż�
					next[i] = next[j];
				}
				else {
					next[i] = j;
				}
			}
			else {
				j = next[j];         //  ���ַ�����Ƚ��л��ݣ���֤s[0]~s[j]��s[i-j]~s[i]��ƥ���
			}
		}
	
		return next;
	}
	
	public static int Index_KMP(String S, String T) {
		int i = 0, j = 0;   //  i���ڱ�ʾ�������±�ֵ��j���ڱ�ʾ�Ӵ����±�ֵ
		int[] next = next(T);
		
		while(i < S.length() && j < T.length()) {   
			if(j == -1 || S.charAt(i) == T.charAt(j)) {   //  ���ַ���������
				i++;
				j++;
			}
			else {
				j = next[j];  //  j�����˻غ��ʵ�λ�ÿ�ʼ����ƥ��,i��ֵ����
			}
		}
		
		if(j == T.length()) {    //  ���ƥ�䣬�򷵻ص�һ��ƥ��������±�
			return i - j;
		}
		else {
			return -1;
		}
	}

}
