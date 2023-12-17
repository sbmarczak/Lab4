// Definiowanie klasy
public class Konstruktory {
    // Deklaracja zmiennych instancji dla klasy Konstruktory
    private String nazwa;
    private int liczba;

    // Konstruktor bez parametrów - ustawia domyślne wartości dla zmiennych instancji
    public Konstruktory() {
        this.nazwa = "";
        this.liczba = 0;
    }

    // Konstruktor z parametrami - umożliwia przekazanie wartości do zmiennych instancji podczas tworzenia obiektu
    public Konstruktory(String nazwa, int liczba) {
        this.nazwa = nazwa;
        this.liczba = liczba;
    }

    // Metoda do wyświetlania informacji
    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + this.nazwa); // wyświetla wartość "nazwa"
        System.out.println("Liczba: " + this.liczba); // wyświetla wartość "liczba"
    }

    // Główna metoda programu
    public static void main(String[] args) {
        // Utworzenie obiektu za pomocą konstruktora bez parametrów - wszystkie zmienne instancji mają wartości domyślne
        Konstruktory obiekt1 = new Konstruktory();
        obiekt1.wyswietlInformacje(); // wyświetla informacje o obiekcie1

        // Utworzenie obiektu za pomocą konstruktora z parametrami - zmienne instancji są inicjalizowane wartościami przekazanymi jako argumenty
        Konstruktory obiekt2 = new Konstruktory("Przykład", 123);
        obiekt2.wyswietlInformacje(); // wyświetla informacje o obiekcie2
    }
}



