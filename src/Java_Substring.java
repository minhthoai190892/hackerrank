import java.util.Scanner;

public class Java_Substring {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter String : ");
            String s = scanner.nextLine();
            System.out.println("Enter start: ");
            int start = scanner.nextInt();
            System.out.println("Enter end: ");
            int end = scanner.nextInt();
            System.out.println("start: " + start + " " + "end " + end);
            System.out.println(s.substring(start, end));
        }
    }
}
