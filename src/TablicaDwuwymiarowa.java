import java.util.Arrays; // biblioteka do działania na tablicach
import java.util.Random; // biblioteka do generowania liczb losowych

public class TablicaDwuwymiarowa {
    public static void main(String[] args) {
        // Tworzymy dwuwymiarową tablicę 10 x 10
        int[][] tablica = new int[10][10];

        // Tworzymy obiekt klasy Random do generowania liczb losowych
        Random rand = new Random();

        // Wypełniamy tablicę losowymi liczbami od 20 do 45
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = rand.nextInt(26) + 20; // Losowanie liczby z zakresu 20-45
            }
        }

        // Wyświetlamy pierwotną tablicę
        System.out.println("Pierwotna tablica:");
        wyswietlTablice(tablica);

        // Sortujemy każdy wiersz tablicy
        for (int[] wiersz : tablica) {
            Arrays.sort(wiersz);
        }

        // Wyświetlamy posortowaną tablicę
        System.out.println("\nPosortowana tablica:");
        wyswietlTablice(tablica);

        // Tworzymy tablicę do zliczania wystąpień liczb od 20 do 45
        int[] wystapienia = new int[26];

        // Zliczamy wystąpienia każdej liczby w tablicy
        for (int[] wiersz : tablica) {
            for (int element : wiersz) {
                wystapienia[element - 20]++;
            }
        }

        // Wyświetlamy ilość wystąpień każdej liczby
        System.out.println("\nIlość wystąpień poszczególnych liczb:");
        for (int i = 0; i < wystapienia.length; i++) {
            System.out.println("Liczba " + (i + 20) + " występuje " + wystapienia[i] + " razy");
        }
    }

    // Metoda do wyświetlania tablicy dwuwymiarowej
    public static void wyswietlTablice(int[][] tablica) {
        for (int[] wiersz : tablica) {
            for (int element : wiersz) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
