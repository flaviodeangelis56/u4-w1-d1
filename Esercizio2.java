import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringa1 = input.nextLine();
        String stringa2 = input.nextLine();
        String stringa3 = input.nextLine();
        System.out.println("Stringe concatenate : " + reverse(stringa1, stringa2, stringa3));

        input.close();
    }

    public static String reverse(String str1, String str2, String str3) {
        return str1 + " " + str2 + " " + str3 + " " + str3 + " " + str2 + " " + str1;
    }
}
