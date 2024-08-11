import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] barrel = new int[500];
        int leaves = 0;  
        while (true) {
            int age = s.nextInt();
            int leaf = 1;
            if (age == 0) {
               break;
            }
            for (int i = 0; i < age; i++) {
                int split = s.nextInt();
                int cut = s.nextInt();
                leaf = (leaf * split) - cut;
            }
            barrel[leaves++] = leaf;
        }
        s.close();
        for (int i = 0; i < leaves; i++) {
            System.out.println(barrel[i]);
        }
    }
}