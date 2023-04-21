import java.util.Scanner;

public class Java_Static_Initializer_Block {
    // https://www.hackerrank.com/challenges/java-static-initializer-block/problem?h_r=next-challenge&h_v=zen
    static Scanner scanner = new Scanner(System.in);
    // declare property parallelogram
    
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();
    // declare boolen
    static boolean flag = true;
    static {
        try {
            // check property parallelogram >0
            if (B<=0||H<=0) {
                // change flag =false
                flag = false;
                // out put message
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
           System.out.println(e);
        }
    }

    public static void main(String[] args) {
        // check flag =true 
        if (flag) {
            System.out.println(B*H);
        }
    }
}
