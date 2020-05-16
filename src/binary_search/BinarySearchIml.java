package binary_search;

public class BinarySearchIml {
	public static void main(String[] args) {
		int numberToSearch = 102;
		int[] x = {0, 5, 13, 19, 22, 41, 55, 68, 72, 81, 98};

		int result = solve(x, numberToSearch);
		if (result == -1) {
			System.out.println("Not found in array");
		} else {
			System.out.println("Given number in array");
		}

	}

	private static int solve(int[] x, int search) {
		int left = 0, right = x.length - 1;
		while (left <= right) {
			int mid = ((left + right) / 2);
			if (x[mid] == search) {
				return search;
			}
			if (x[mid] < search) {
				left = mid + 1;
			} else if (x[mid] > search) {
				right = mid - 1;
			}
		}
		return -1;
	}
}

