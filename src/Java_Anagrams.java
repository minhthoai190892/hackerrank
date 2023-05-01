import java.util.Arrays;
import java.util.Scanner;

public class Java_Anagrams {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter String a: ");
    String a = scanner.nextLine();
    System.out.println("Enter String b: ");
    String b = scanner.nextLine();
    boolean c = isAnagram(a, b);
    System.out.println(c?"Anagrams":"Not Anagrams");
    scanner.close();

    }
     public static boolean isAnagram(String a, String b) {
        //loại bỏ khoảng trắng và chuyển chuổi thành chữ hoa
        a = a.replace(" ", "").toUpperCase();
        b = b.replace(" ", "").toUpperCase();

        //tạo 2 mảng ký tự chứa chuổi a và b
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        //sắp xếp lại mảng
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        
        //so sánh 2 mảng
        if (Arrays.equals(aArray, bArray)) {
            return true;
        }else{
        
            return false;
        }
            
    }
}
