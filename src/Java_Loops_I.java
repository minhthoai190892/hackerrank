import java.util.Scanner;

public class Java_Loops_I {
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Nhap N: ");
        int N = scanner.nextInt();
            for (int i = 1; i <=10; i++) {
                int result = N*i;
                System.out.println(N+" x "+i+" = "+result);
            }
    }
    }
}
