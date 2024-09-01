import java.util.ArrayList;
import java.util.Stack;

public class StringPermutation {

    public static ArrayList<ArrayList<Integer>> findSubsets(int[] nums) {
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        Stack<Integer> currentSubset = new Stack<>();

        subsets.add(new ArrayList<>()); // Add the empty subset

        int index = 0;
        while (index < nums.length) {
            // Explore including the current element
            currentSubset.push(nums[index]);
            subsets.add(new ArrayList<>(currentSubset));
            index++;

            // Backtrack and explore excluding the element
            while (!currentSubset.isEmpty() && index < nums.length && nums[index] == nums[index - 1]) {
                index++; // Skip duplicates
            }

            // Backtrack further if needed
            while (!currentSubset.isEmpty() && index < nums.length && currentSubset.peek() > nums[index]) {
                currentSubset.pop();
                subsets.add(new ArrayList<>(currentSubset));
            }
        }

        return subsets;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        ArrayList<ArrayList<Integer>> subsets = findSubsets(nums);
        System.out.println(subsets);
    }
}
