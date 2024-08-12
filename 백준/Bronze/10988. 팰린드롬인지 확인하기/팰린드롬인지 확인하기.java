import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        int len = word.length();
        int palin = 1;
        for (int i = 0; i < len / 2; i++) { 
            if (word.charAt(i) != word.charAt(len - 1 - i)) {
                palin = 0;
                break;
            }
        }
        s.close();
        System.out.println(palin);
    }
}