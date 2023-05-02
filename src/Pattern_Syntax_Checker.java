import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Pattern_Syntax_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter nhập số lượng trường hộp cần test: ");
        int testCase = Integer.parseInt(scanner.nextLine());


        while (testCase>0) {
            String pattern = scanner.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch ( PatternSyntaxException ex) {
                // TODO: handle exception
                System.out.println("Invalid");
            }
            testCase--;
        }
    }
}
