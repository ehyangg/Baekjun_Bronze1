import java.util.*;

public class Baekjun_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		int a = 0;
		int[] score = new int[tests];
		double sum = 0;
		while (a < tests) {
			score[a] = sc.nextInt();
			a++;
		}
		Arrays.sort(score);

		for (int i = 0; i < score.length; i++) {
			double solo = score[i] * 100 / score[score.length-1];
			sum += solo;
		}
		double avg = sum / tests;
		System.out.println(avg);
		sc.close();
	}
}
