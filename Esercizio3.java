import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci base e premi invio");
        double base = Integer.parseInt(input.nextLine());
        System.out.println("Inserisci altezza e premi invio");
        double altezza = Integer.parseInt(input.nextLine());
        System.out.println("Il perimetro del rettangolo è : " + perimetroRettangolo(altezza, base));

        System.out.println("Inserisci un numero e premi invio");
        int numero = Integer.parseInt(input.nextLine());
        System.out.println("Se esce 0 il tuo numero è pari se esce 1 è dispari : " + pariDispari(numero));

        System.out.println("Inserisci lato 1 e premi invio");
        int lato1 = Integer.parseInt(input.nextLine());
        System.out.println("Inserisci lato 2 e premi invio");
        int lato2 = Integer.parseInt(input.nextLine());
        System.out.println("Inserisci lato 3 e premi invio");
        int lato3 = Integer.parseInt(input.nextLine());
        System.out.println("L'area del triangolo è : " + areaTriangolo(lato1, lato2, lato3));
        input.close();
    }

    public static double perimetroRettangolo(double h, double b) {
        return h * 2 + b * 2;
    }

    public static int pariDispari(int n) {
        int resto = n % 2;
        if (resto == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double areaTriangolo(int l1, int l2, int l3) {
        int p = (l1 + l2 + l3) / 2;
        return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
    }
}
