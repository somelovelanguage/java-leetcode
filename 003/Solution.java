
//维护一个滑动窗口,只需记录最左端的位置
public class Solution{
	public int lengthOfLongestSubstring(String s){
		int left=0;
		int[] Hash=new int[128];
		int l=0,max=0;
		int len = s.length();
		if (s == null || (len = s.length()) == 0) return 0;
		for(int i=0;i<len;i++){
			char c=s.charAt(i);
			// if(Hash[c]!=0){//之前记录过
				if(Hash[c]>left)
				left = Hash[c];	
			// }
			Hash[c]=i+1;
			l=i-left+1;
			
			if(l>max)max=l;
		}
		return max;

	}
	public static void main(String[] args){
		Solution solution = new Solution();
		System.out.println(solution.lengthOfLongestSubstring("abc"));
		System.out.println(solution.lengthOfLongestSubstring("bbbb"));
		System.out.println(solution.lengthOfLongestSubstring("asdfbbcab"));
		System.out.println(solution.lengthOfLongestSubstring("abzxccab"));
		System.out.println(solution.lengthOfLongestSubstring("abbcasaab"));
	}
}