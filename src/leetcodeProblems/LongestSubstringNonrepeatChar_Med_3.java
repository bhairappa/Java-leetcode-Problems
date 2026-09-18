package leetcodeProblems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringNonrepeatChar_Med_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcauiocbds";
		int left=0,max=0,start=0;
		Map<Character,Integer>mp =new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char cc = str.charAt(i);
			if(mp.containsKey(cc)&&mp.get(cc)>=left) {
				left=mp.get(cc)+1;
			}mp.put(cc, i);
			if(i-left+1>max) {
				max=i-left+1;
				start=left;
			}
		}
		System.out.println(str.substring(start,start+max));
	}

}
