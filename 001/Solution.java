// // 一个源文件中只能有一个public类
// 一个源文件可以有多个非public类
// 源文件的名称应该和public类的类名保持一致。
// main函数里必须有 String[] args
// 指定返回类型后好像必须有返回值，可以用null
// 当进行打印时，无论是任何类型，都自动转为字符串进行打印
// 打印一维数组的API为System.out.println ( Arrays.toString ()
import java.util.Arrays;

public class Solution{
	public int[] twoSum(int[] sums,int target){
		for(int i=0;i<sums.length;i++){
			for(int j=i+1;j<sums.length;j++){
				if(sums[i]+sums[j]==target){
					return new int[]{i,j};
				}
			}
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