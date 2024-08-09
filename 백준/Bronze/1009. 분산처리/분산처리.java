import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int data, a, b, last = 0;
        data = s.nextInt();

        int[] result = new int[data];
        int[] a1 = new int[data];
        int[] b1 = new int[data];

        for (int i = 0; i < data; i++) {
            a1[i] = s.nextInt();
            b1[i] = s.nextInt();
        }
        for (int i = 0; i < data; i++) {
            a = a1[i];
            b = b1[i];

            a = a % 10;
            if (a == 0) {
                result[i] = 10;
            } else {
                last = 1;
                for (int j = 0; j < b; j++) {
                    last = (last * a) % 10;
                }
                result[i] = last;
            }
        }
        for (int i = 0; i < data; i++) {
            System.out.println(result[i]);
        }
        s.close();
    }
}