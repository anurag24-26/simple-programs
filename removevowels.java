import java.util.*;

public class removevowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter your name: ");
            String name = s.nextLine();
            String re = removevowel(name);
            System.out.println("Name without vowels: " + re);
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        } finally {
            s.close();
        }
    }

    private static String removevowel(String name) {
        char[] nam = new char[name.length()];
        int index = 0;

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                nam[index] = c;
                index++;
            }
        }

        return new String(nam, 0, index);
    }
}
