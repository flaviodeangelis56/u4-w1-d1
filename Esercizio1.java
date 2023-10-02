import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il primo fattore e premi invio");
        int fattore1 = input.nextInt();
        System.out.println("Inserisci il secondo fattore e premi invio");
        int fattore2 = input.nextInt();
        System.out.println("Il prodotto è : " + product(fattore1, fattore2));
        input.close();

    }

    public static int product(int n1, int n2) {
        return n1 * n2;
    }
}
