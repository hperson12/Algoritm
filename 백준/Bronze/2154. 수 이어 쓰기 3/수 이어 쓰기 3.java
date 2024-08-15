import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(i);
        }
        String loc = Integer.toString(N);
        int posi = sb.indexOf(loc) + 1;
        System.out.println(posi);
    }
}