import java.util.Scanner;

public class Java_End_of_file {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int i =1;
        
            while (scanner.hasNext()) {//hasNext:có phần tử tiếp theo hay không
                //Tạo ra một Builder chuỗi với dung lượng ban đầu là 16.
                StringBuilder builder = new StringBuilder();
                //nối chuổi lại
                builder.append(i).append(" ").append(scanner.nextLine());
                //tăng i lên
                i++;
                //in kết quả
                System.out.println(builder);
                if (scanner.hasNext("out")) {
                    break;
                }
            }
        }
    }
}
