import java.util.Scanner;

public class Java_Substring_Comparisons {
    public static void main(String[] args) {
        try (// https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
    Scanner scanner = new Scanner(System.in)) {
        int k =3;
        String s = scanner.nextLine();
 
   System.out.println(getSmallestAndLargest(s, k));
    }
    
    
    }
    /**
     * @param s nhập một chuổi "welcometojava"
     * @param k lấy số ký tự trong chuổi "3"
     * @return trả về một chuổi
     */
    public static String getSmallestAndLargest(String s, int k) {
        //khai báo thuộc tính
        String str = s.substring(0,k); //"wel"
        //gán chuổi cho biến
        String smallest = str;
        String largest = str;
        // sử dụng vòng lặp để cắt chuổi
        for (int i = 0; i <= s.length()-k; i++) {
            str = s.substring(i, i+k);// "elc" "lco" "com" "ome" "met" "eto" "toj" "oja" "jav" "ava"
        // so sánh 2 chuổi
        if (str.compareTo(smallest)<0) {
            smallest =str;
        }
        if (str.compareTo(largest)>0) {
            largest=str;
        }
        }
       
        return smallest + "\n"+largest;
        
    }

}
