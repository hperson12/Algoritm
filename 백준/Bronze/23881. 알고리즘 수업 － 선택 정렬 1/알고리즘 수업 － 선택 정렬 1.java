import java.util.*;
public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        int change = 0;
        for (int last = N - 1; last > 0; last--) {
            int max = 0;
            for (int i = 1; i <= last; i++) {
                if (A[i] > A[max]) {
                    max = i;
                }
            }
            if (max != last) {
                int temp = A[max];
                A[max] = A[last];
                A[last] = temp;
                change++;
                if (change == K) {
                    System.out.println(Math.min(A[max], A[last]) + " " + Math.max(A[max], A[last]));
                    s.close();
                    return;
                }
            }
        }
        s.close();
        System.out.println(-1);
    }
}