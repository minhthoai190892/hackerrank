import java.util.Scanner;

public class Java_String_Tokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = scanner.nextLine();
        scanner.close();
        //xóa khoảng trắng bằng hàm trim()
        s.trim();
        // kiểm tra độ dài chuổi
        if (s.length()==0) {
            System.out.println(0);
            return;
        }
        //tạo mảng chứa chuổi String sau khi cắt
        // He is a very very good boy, isn't he?
        String[] words = s.split("[^a-zA-Z]+");//{he,is,a,very,very,good,boy,isn,t,he}
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }

        
    }
}
