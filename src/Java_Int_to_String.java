import java.util.Scanner;

public class Java_Int_to_String {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = scanner.nextInt();
            String s = "";
            // check n -100<n<100
            if (n >= -100 && n <= 100) {
                s = Integer.toString(n);

            }
            if (s.length() > 0) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
        }

    }
}
