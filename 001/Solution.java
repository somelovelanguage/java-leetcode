
import java.util.Arrays;
import java.util.HashMap;

public class Solution{
	// method 1
	// public int[] twoSum(int[] sums,int target){
	// 	for(int i=0;i<sums.length;i++){
	// 		for(int j=i+1;j<sums.length;j++){
	// 			if(sums[i]+sums[j]==target){
	// 				return new int[]{i,j};
	// 			}
	// 		}
	// 	}
	// 	return null;
	// }
	public int[] twoSum(int[] sums,int target){
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<sums.length;i++){
			final Integer value = map.get(sums[i]);
			if (value != null){
				return new int[]{i,value};
			}
			map.put(target-sums[i],i);
		}
		return null;
	}
	public static void main(String[] args){
		Solution solution = new Solution();
		int[] nums = new int[]{2,7,1,6};
		int target = 9;

		System.out.println(Arrays.toString(solution.twoSum(nums,target)));
	}
}