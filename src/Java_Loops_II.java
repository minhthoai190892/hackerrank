import java.util.Scanner;

public class Java_Loops_II {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input q: ");
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.print("Input a: ");
            int a = scanner.nextInt();
            System.out.print("Input b: ");
            int b = scanner.nextInt();
            System.out.print("Input n: ");
            int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                int result = 0;
                for (int k = 0; k <= j; k++) {
                    result += (int)(Math.pow(2,k)*b);
                }
                System.out.print(a+result+" ");

            }
            System.out.println();
        }
        scanner.close();
    }
}
