import java.util.Scanner;
//다른 사람 풀이를 보니 사칙연산으로 공식화 시켜서 푸는게 대부분이었다.
public class Baekjun_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		final int c = 48;
		if (!n.equals("0")) {
			if (n.length() == 1) {
				n += 0;
			}
			int num1 = n.charAt(0) - c;
			int num2 = n.charAt(1) - c;
			int sum = num1 + num2;
			String a = Integer.toString(sum); //int -> string
			String s = Integer.toString(num2) + a.charAt(a.length() - 1); //a.length() - 1 가장 오른쪽 문자
			int i = 1;
			if (s != n) {
				boolean plz = true; //while 탈출, 범위가 정해져있지 않기 때문에 while활용
				while (plz) {
					int num3 = s.charAt(0) - c;
					int num4 = s.charAt(1) - c;
					sum = num3 + num4;
					a = Integer.toString(sum);
					s = Integer.toString(num4) + a.charAt(a.length() - 1);
					i += 1;
					if (s.equals(n))
						plz = false;
				}
			}
			System.out.println(i);
		} else System.out.println("1");
		sc.close();
	}
}

//import java.util.Scanner;
//
//public class Main {
// 
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
// 
//		int N = in.nextInt();
//		in.close();
//        
//		int cnt = 0;
//		int copy = N;
//        
//		while (true) {
//			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
//			cnt++;
// 
//			if (copy == N) {
//				break;
//			}
//		}
//		System.out.println(cnt);
//	}
//}