// leetcode 1480 has done in 2 ways. the first way has a time complexity of O(n^2) and the second one having O(n)

// way 1

import java.util.*;

// public class runningSum1D {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int nums[] = { 1, 2, 3, 4 };
// 		int ar[] = new int[4];
// 		int sum = 0;
// 		for (int i = 0; i < nums.length; i++) {
// 			for (int j = 0; j <= i; j++) {
// 				sum += nums[j];
// 			}
// 			ar[i] = sum;
// 			sum = 0;
// 		}
// 		System.out.println(Arrays.toString(ar));
// 	}
// }


// way 2

public class runningSum1D {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		// int ar[] = new int[4];
		int sum = 0;
		for (int i = 0; i < nums.length; i++){
			sum += nums[i];
			nums[i] = sum;
		}
		System.out.println(Arrays.toString(nums));
	}
}