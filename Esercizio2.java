import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci prima stringa e premi invio");
        String stringa1 = input.nextLine();
        System.out.println("Inserisci seconda stringa e premi invio");
        String stringa2 = input.nextLine();
        System.out.println("Inserisci terza stringa e premi invio");
        String stringa3 = input.nextLine();
        System.out.println("Stringe concatenate : " + reverse(stringa1, stringa2, stringa3));

        input.close();
    }

    public static String reverse(String str1, String str2, String str3) {
        return str1 + " " + str2 + " " + str3 + " " + str3 + " " + str2 + " " + str1;
    }
}
