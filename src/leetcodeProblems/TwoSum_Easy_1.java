package leetcodeProblems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_Easy_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] att = {8,9,2,1,5,7};
		int target = 6;
		int[] s = isTarget(att,target);
		System.out.println(s[0]+" "+s[1]);
	}
	private static int[] isTarget(int[] att, int target) {
		Map<Integer,Integer>mp = new HashMap<>();
		for(int i=0;i<att.length;i++) {
			int missing = target-att[i];
			if(mp.containsKey(missing)) {
				return new int[] {mp.get(missing),i};
			}mp.put(att[i], i);
		}
		return new int[] {};	
	}
}
