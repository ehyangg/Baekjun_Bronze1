
public class Baekjun_4673 {
	public static int d(int n) {
		int sum = n;
		while (n != 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];
		for (int i = 1; i < 10001; i++) {
			int noAnswer = d(i);
			if (noAnswer<10001) {
				arr[noAnswer] = true;
			}
			if(!arr[i]) {
				System.out.println(i);
			}
		}
	}

}