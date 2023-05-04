import java.util.Scanner;

public class Java_Regex {
    public static void main(String[] args) {
        // https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
        Scanner scanner = new Scanner(System.in);
        //sử dụng vòng lặp để nhập
        while (scanner.hasNext()) {
            String IP = scanner.next();
            // matches: xác định có hay không chuổi này so khớp với regular expression đã cho
            System.out.println(IP.matches(new MyRegex().pattern));
            if (scanner.hasNext("out")) {
                break;
            }
        }
        
    }
   static class MyRegex {
        String zeroTo255="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String pattern = zeroTo255+"."+zeroTo255+"."+zeroTo255+"."+zeroTo255;
        /*
         * 1. \\d{1,2} catches any one or two digit number
         * 2. (0|1)\\d{2} catches any three digit number starting with 0 or 1
         * 3. [0-4]\\d catches numbers between 200 and 249
         * 4. 25[0-5] catches numbers between 250 and 255
         */
    }
}
