/**
 * The twoSum program takes in an integer array called nums and performs a simple calculation to return the indices of two
 * numbers which make the sum of a specified target integer.
 * @author Simir Cooper
 * @since 2/12/2021
 */
import java.util.Arrays;
public class Lab02 {
	/**
	 * This method takes in an integer array called nums and an integer called target. If the target is the result
	 * is the result of the sum of two values in the array the program returns an array with their indices. If the sum of that 
	 * correlates to the target is not found the method returns an array with the value -1.
	 * @param nums
	 * @param target
	 * @return int []
	 */
	public int [] twoSum(int[] nums, int target) {
		for (int i=0; i< nums.length-1; i++) {
			for (int j=i+1;j< nums.length; j++) {
				if (nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
	
			}
		}
		return new int[] {-1};
	}

	public static void main(String[] args) {
		Lab02 s = new Lab02();
		int [] array = {2, 12, 8, 7};
		int target = 9;
		System.out.println(Arrays.toString(s.twoSum(array,target)));
	}

}
