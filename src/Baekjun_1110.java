import java.util.Scanner;

public class Baekjun_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] file = new String[n];
		for (int i = 0; i < n; i++) {
			file[i] = sc.next();
		}
		boolean diff = false;
		for (int i = 0; i < file[0].length(); i++) {
			diff = false;
			for (int j = 0; j < n - 1; j++) {
				if (file[j].charAt(i) != file[j + 1].charAt(i)) {
					diff = true;
					break;
				}
			}
			if (diff) 
				System.out.print("?");
			else 
				System.out.print(file[0].charAt(i));
		}	
		sc.close();
	}
}