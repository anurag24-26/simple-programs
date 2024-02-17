import java.util.Scanner;
//Simple program to useer input string and reverse the string.
public class Stringrev {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int length=name.length();
        char a=' ';
            for (int j = length-1; j >= 0; j--) {
                a=name.charAt(j);
                System.out.print(a);
            }
    }
}

