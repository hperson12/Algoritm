import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int now = 0;
		int max = 0;
		
		for(int i=0; i<10; i++) {
			int off = sc.nextInt();
			int on = sc.nextInt();
			
			now -= off;
			now += on;
			
			if(now >= max) {
				max = now;
			}
		}
		sc.close();
		System.out.println(max);
	}
}