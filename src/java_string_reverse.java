import java.util.Scanner;

public class java_string_reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = scanner.nextLine();
        scanner.close();
        // tạo một biến và nhận giá trị đã được đảo ngược của chuổi ban đầu
        String b = new StringBuilder(a).reverse().toString();
        // so sánh 2 chuổi
        if (a.equals(b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
