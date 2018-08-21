
public class Punto2 {

	// 2.1 - Ejercicios Recursion 1 CodingBat
	public int bunnyEars(int bunnies) {
		if (bunnies == 0)
			return 0;
		else
			return 2 + bunnyEars(bunnies - 1);
	}

	// --------------------------------------------------
	public int bunnyEars2(int bunnies) {
		if (bunnies == 0)
			return 0;
		else if (bunnies % 2 == 0)
			return 3 + bunnyEars2(bunnies - 1);
		else
			return 2 + bunnyEars2(bunnies - 1);
	}

	// --------------------------------------------------
	public int count11(String str) {
		int n = str.length();
		if (n <= 1)
			return 0;
		else if (str.charAt(n - 2) == '1' && str.charAt(n - 1) == '1')
			return 1 + count11(str.substring(0, n - 2));
		else
			return 0 + count11(str.substring(0, n - 1));
	}

	// --------------------------------------------------
	public int sumDigits(int n) {
		if (n <= 9)
			return n;
		else
			return n % 10 + sumDigits(n / 10);
	}

	// --------------------------------------------------
	public int powerN(int base, int n) {
		if (n == 1)
			return base;
		else
			return base * powerN(base, n - 1);
	}

	// 2.2 - Ejercicios Recursion 2 CodingBat ...
	public boolean groupNoAdj(int start, int[] nums, int target) {
		if (start >= nums.length)
			return target == 0;
		else
			return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
	}

	// --------------------------------------------------
	public boolean groupSum6(int start, int[] nums, int target) {
		if (start >= nums.length)
			return target == 0;
		else if (nums[start] == 6)
			return groupSum6(start + 1, nums, target - 6);
		else
			return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
	}

	// --------------------------------------------------
	public boolean groupSumClump(int start, int[] nums, int target) {
		if (start >= nums.length)
			return target == 0;
		else {
			int i = start;
			int k = 1;
			while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
				k++;
				i++;
			}
			return groupSumClump(start + k, nums, target - nums[start] * k) || groupSumClump(start + k, nums, target);
		}
	}

	// --------------------------------------------------
	public boolean groupSum5(int start, int[] nums, int target) {
		if (start >= nums.length)
			return target == 0;
		else if (start < nums.length - 1 && nums[start] % 5 == 0 && nums[start + 1] != 1)
			return groupSum5(start + 1, nums, target - nums[start]);
		else if (nums[start] % 5 != 0)
			return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
		else
			return groupSum5(start + 2, nums, target - nums[start]);
	}

	// --------------------------------------------------
	public boolean splitArray(int[] nums) {
		return aux(0, nums, 0, 0);
	}

	public boolean aux(int start, int[] nums, int sum1, int sum2) {
		if (start >= nums.length)
			return sum1 == sum2;
		else
			return aux(start + 1, nums, sum1 + nums[start], sum2) || aux(start + 1, nums, sum1, sum2 + nums[start]);
	}

}
