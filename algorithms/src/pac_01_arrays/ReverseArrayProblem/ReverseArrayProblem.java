package pac_01_arrays.ReverseArrayProblem;

import java.util.Arrays;

public class ReverseArrayProblem {
    public static void main(String[] args) {
        int[] tempArray = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(tempArray));

        tempArray = solve(tempArray);

        System.out.println(Arrays.toString(tempArray));

    }

    // no need for extra memory (in-place algorithm)
    // O(N/2) = O(N) linear running time
    public static int[] solve(int[] nums) {
        int lowIndex = 0;
        int highIndex = nums.length - 1;

        while (lowIndex < highIndex) {
            swap(nums, lowIndex, highIndex);
            lowIndex++;
            highIndex--;
        }

        return nums;
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
