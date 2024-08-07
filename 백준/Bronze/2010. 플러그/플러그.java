import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int multitab = 0;
		int max = 0;
		int plug = 0;
		
		multitab = sc.nextInt();
		for(int i = 0; i < multitab; i++) {
			plug = sc.nextInt();
			max += plug;
		}
		sc.close();
		max = max - multitab + 1;
		System.out.println(max);
	}
}