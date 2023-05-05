public class Java_String_Tokens {
    public static void main(String[] args) {
        
        String a ="He is a very very good day, isn't he?";
        String[] b = a.split("[^A-Za-z]+");
        System.out.println(b.length);
        for (int i = 0; i < b.length; i++) {
                System.out.println(b[i]);
        }
    }
}
