import java.util.Scanner;

public class Java_Strings_Introduction {
    public static void main(String[] args) {
        try (// https://www.hackerrank.com/challenges/java-strings-introduction/problem
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter String A: ");
            String A = scanner.nextLine();
            System.out.println("Enter String B: ");
            String B = scanner.nextLine();
            int c = A.compareTo(B);
            if (c <= 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
            System.out.println(
                    A.substring(0, 1).toUpperCase() + "" + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + ""
                            + B.substring(1));
        }

    }
}
