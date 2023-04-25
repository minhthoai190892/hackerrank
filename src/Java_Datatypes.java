import java.util.Scanner;

public class Java_Datatypes {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap t: ");
            int t = scanner.nextInt();
            for (int i = 0; i < t; i++) {
                try {
                    long x = scanner.nextLong();
                    System.out.println(x + " can be fitted in:");
                    // check x range from -128 to 127
                    if (x >= -128 && x <= 127) {
                        System.out.println("* byte");
                    }
                    // check x range from -32,768 to 32,767
                    if (x >= -32768 && x <= 32767) {
                        System.out.println("* short");
                    }
                    // check x range from -2^31 to (2^31)-1
                    if (x >= Math.pow(-2, 31) && x <= Math.pow(2, 31) - 1) {
                        System.out.println("* int");
                    }
                    // check x range from -2^63 to (2^63)-1
                    if (x >= Math.pow(-2, 63) && x <= Math.pow(2, 63) - 1) {
                        System.out.println("* long");
                    }
                } catch (Exception e) {
                    System.out.println(scanner.next() + " can't be fitted anywhere.");
                }
            }
        }
    }
}
