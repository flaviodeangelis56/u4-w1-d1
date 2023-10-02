import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il primo fattore e premi invio");
        int fattore1 = Integer.parseInt(input.nextLine());
        System.out.println("Inserisci il secondo fattore e premi invio");
        int fattore2 = Integer.parseInt(input.nextLine());
        System.out.println("Il prodotto è : " + Moltiplica(fattore1, fattore2));

        System.out.println("Inserisci una stringa e premi invio");
        String stringaConcatena = input.nextLine();
        System.out.println("Inserisci un numero e premi invio");
        int numero = Integer.parseInt(input.nextLine());
        System.out.println("Elementi concatenati : " + Concatena(stringaConcatena, numero));

        String[] arrayDiStringhe = {"stringa1", "stringa2", "stringa3", "stringa4", "stringa5"};
        System.out.println("Inserisci una stringa da inserire nella terza posizione dell'array e premi invio");
        String stringaAggiungiArray = input.nextLine();
        String[] finalArray = InserisciInArray(arrayDiStringhe, stringaAggiungiArray);
        for (int i = 0; i < finalArray.length; i++) {
            System.out.println("Array con stringa aggiunta : ");
            System.out.println(finalArray[i]);
        }

        input.close();


    }

    public static int Moltiplica(int n1, int n2) {
        return n1 * n2;
    }

    public static String Concatena(String str, int num) {
        return str + " " + num;
    }

    public static String[] InserisciInArray(String[] arrayStr, String str) {
        String[] finalArray = new String[6];
        finalArray[0] = arrayStr[0];
        finalArray[1] = arrayStr[1];
        finalArray[2] = str;
        finalArray[3] = arrayStr[2];
        finalArray[4] = arrayStr[3];
        finalArray[5] = arrayStr[4];
        return finalArray;
    }
}
