import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        	int ball = 1;
        	int M = sc.nextInt();

        	for (int i = 0; i < M; i++) {
            	    int X = sc.nextInt();
            	    int Y = sc.nextInt();

            	    if (ball == X) {
                         ball = Y;
                    } 
                    else if (ball == Y) {
                         ball = X;
                   }
             }
             System.out.println(ball);
             sc.close();
       }
}