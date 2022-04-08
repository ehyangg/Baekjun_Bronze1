import java.util.Scanner;

public class Baekjun_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String p = n;
		final int c = 48;	
		if(n.length()==1) {
			n += 0;
		}
		
		int num1 = n.charAt(0)-c;
		int num2 = n.charAt(1)-c;
		int sum = num1 + num2;
		String a = Integer.toString(sum);
		String s = Integer.toString(num2) + a.charAt(a.length()-1);
		int i=1;
		boolean plz = true;
		while (plz) {
			int num3 = s.charAt(0)-c;
			int num4 = s.charAt(1)-c;
			sum = num3 + num4;
			a = Integer.toString(sum);
			s = Integer.toString(num4) + a.charAt(a.length()-1);
			i+=1;
			if(s == p) plz=false;
		}
		System.out.println(i);
		sc.close();
	}
}