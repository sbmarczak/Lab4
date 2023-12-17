// Klasa Car
public class Car {
    String marka; // Marka samochodu
    String model; // Model samochodu
    int rokProdukcji; // Rok produkcji samochodu
    int liczbaDrzwi; // Liczba drzwi w samochodzie
    double pojemnoscSilnika; // Pojemność silnika samochodu
    double cena; // Cena samochodu

    // Konstruktor klasy Car
    public Car(String marka, String model, int rokProdukcji, int liczbaDrzwi, double pojemnoscSilnika, double cena) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.liczbaDrzwi = liczbaDrzwi;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.cena = cena;
    }

    // Metoda wyświetlająca informacje o samochodzie
    public void wyswietlInformacje() {
        System.out.println("Marka: " + this.marka);
        System.out.println("Model: " + this.model);
        System.out.println("Rok produkcji: " + this.rokProdukcji);
        System.out.println("Liczba drzwi: " + this.liczbaDrzwi);
        System.out.println("Pojemność silnika: " + this.pojemnoscSilnika);
        System.out.println("Cena: " + this.cena);
    }
}
