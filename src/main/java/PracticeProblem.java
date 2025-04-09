public class PracticeProblem {

	public static void recamanner(int[] arr, int n) {
		if (n == 0) return;
		recamanner(arr, n - 1);
		boolean valid = true;
		for (int j = 0; j < n; ++j) {
			if (arr[j] == arr[n - 1] - (n + 1) || arr[n - 1] - (n + 1) <= 0) {
				valid = false;
				break;
			}
		}
		arr[n] = (valid) ? arr[n - 1] - (n + 1) : arr[n - 1] + (n + 1);
		return;
	}

	public static int[] recaman(int n) {
		if (n < 1) return new int[0];
		int[] arr = new int[n];
		arr[0] = 1;
		recamanner(arr, n - 1);
		return arr;
	}

}
